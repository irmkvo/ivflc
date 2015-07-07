/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import domain.Puser;
import java.beans.PropertyEditorSupport;
import service.UsersService;

/**
 *
 * @author Andrey
 */
public class UserEditor extends PropertyEditorSupport {

    private Puser puser;
    private UsersService usersService;

    public UserEditor(UsersService usersService) {
        this.usersService = usersService;
    }

    @Override
    public String getAsText() {
        Puser war = (Puser) this.getValue();
        String temp = "";
        if (war != null) {
            temp = war.getId() != null ? war.getId().toString() : "";
        }
        return temp;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Puser pmm = usersService.getUser(Integer.parseInt(text));
        this.setValue(pmm);
    }
}
