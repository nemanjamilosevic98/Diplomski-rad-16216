package dualsoft.vf.bookmakerclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dualsoft.vf.bookmakerclient.services.BookmakerService;
import dualsoft.vf.jooq.model.tables.pojos.VfBookmaker;
import org.springframework.security.access.prepost.PreAuthorize;

@Controller()
@RequestMapping("/bookmaker")
public class BookmakerController {

    @Autowired
    BookmakerService service;

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("addedBookmaker", new VfBookmaker());
        model.addAttribute("updatedBookmaker", new VfBookmaker());
        model.addAttribute("deleteId", int.class);
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @GetMapping
    public String getAllBookmakers(Model model) {
        model.addAttribute("bookmakers", service.getAllBookmakers());
        return "bookmaker";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @PostMapping("/addbookmaker")
    public String addBookmaker(@ModelAttribute("addedBookmaker") VfBookmaker bookmaker) {
        System.out.println(bookmaker.toString());
        service.addBookmaker(bookmaker);
        return "redirect:/bookmaker";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @RequestMapping("/deletebookmaker/{id}")
    public String deleteBookmaker(@PathVariable int id) {
        service.deleteBookmaker(id);
        return "redirect:/bookmaker";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @PostMapping("/updatebookmaker")
    public String update(@ModelAttribute("updatedBookmaker") VfBookmaker bookmaker) {
        service.updateBookmaker(bookmaker);
        return "redirect:/bookmaker";
    }

}
