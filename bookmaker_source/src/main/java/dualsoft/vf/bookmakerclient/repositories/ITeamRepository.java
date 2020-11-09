/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualsoft.vf.bookmakerclient.repositories;

import dualsoft.vf.jooq.model.tables.pojos.VfTeam;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public interface ITeamRepository {

    ArrayList<VfTeam> getAll();

    VfTeam getTeam(int id);

    void addTeam(VfTeam sport);

    void updateTeam(VfTeam sport);

    void deleteTeam(int id);
}
