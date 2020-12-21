/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.validation.api.builtin.stringvalidation;

import org.netbeans.validation.api.Problems;
import org.openide.util.NbBundle;

/**
 *
 * @author migue
 */
public class MayusculaValidation extends StringValidator {

    @Override
    public void validate(Problems prblms, String string, String t) {
        
        if (t.isEmpty() || !Character.isUpperCase(t.charAt(0)))
        {
            String message = NbBundle.getMessage(MayusculaValidation.class,"MSG_MAYUSCULA", string);
            prblms.add(message);
        }
    }
    
}
