/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartCast.ui;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Walid
 */
public class Authenticator {
	   private static final Map<String, String> USERS = new HashMap<String, String>();
    static {
        USERS.put("demoemo", "walid");
    }
    public static boolean validate(String user, String password){
        String validUserPassword = USERS.get(user);
        return validUserPassword != null && validUserPassword.equals(password);
    }
}
