package dualsoft.vf.bookmakerclient.controller;

import dualsoft.vf.bookmakerclient.services.OperatorService;
import dualsoft.vf.jooq.model.tables.pojos.VfOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/operator")
public class OperatorController {

    @Autowired
    OperatorService service;

    @ModelAttribute //Creates model attributes when the class is created.
    public void addAttributes(Model model) {
        model.addAttribute("newOperator", new VfOperator());
        model.addAttribute("updatedOperator", new VfOperator());
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @GetMapping
    public String getAllOperators(Model model) {
        model.addAttribute("operator_list", service.getAllOperators());
        return "operator";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @GetMapping(value = "/{code}")
    public String getOperator(@PathVariable("code") String code, Model model) {
        model.addAttribute("requested_operator", service.getOperator(code));
        return "operator";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @PostMapping("/addOperator") // When @ModelAttribute used as method argument, that means that it should be retrieved from the model
    public String addOperator(@ModelAttribute("newOperator") VfOperator operator) {
        service.addOperator(operator);
        return "redirect:/operator";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @RequestMapping("/deleteOperator/{code}")
    public String deleteOperator(@PathVariable("code") String code) {
        service.deleteOperator(code);
        return "redirect:/operator";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @RequestMapping(value = "/updateOperator")
    public String update(@ModelAttribute("updatedOperator") VfOperator operator) {
        service.updateOperator(operator);
        return "redirect:/operator";
    }

}
