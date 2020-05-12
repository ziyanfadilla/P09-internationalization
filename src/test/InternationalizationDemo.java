/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author asus
 */
public class InternationalizationDemo {
    public static void main(String[] args) {
        String language = "en";
        String country= "US";
        Locale locale =  new Locale(language, country);
        ResourceBundle rb =
                ResourceBundle.getBundle("localization/Bundle", locale);
        System.out.println(rb.getString("mk"));
        System.out.println(rb.getString("lecture"));
        System.out.println(rb.getString("subject"));
        System.out.println("=======================================================");
        
        language = "in";
        country = "ID";
        locale = new Locale(language, country);
        rb = ResourceBundle.getBundle("localization/Bundle", locale);
        System.out.println(rb.getString("mk"));
        System.out.println(rb.getString("lecturer"));
        System.out.println(rb.getString("subject"));
       
    }
    
}
