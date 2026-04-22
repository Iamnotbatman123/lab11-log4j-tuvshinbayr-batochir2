package com.example;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Customer {
    private static final Logger logger = LogManager.getLogger(Customer.class);
    

    private String name;

    private String email;

    public Customer(String name, String email) {

        this.name = name;

        this.email = email;
        
        logger.debug("Customer created: name={} email={}" ,name,mask(email));

        }
    private static String mask(String s) {
        if (s == null || s.length() < 4) return "***";
        // Жишээ: test@gmail.com -> te***om
        return s.substring(0, 2) + "***" + s.substring(s.length() - 2);
    }

    public String getDomain() {
        logger.trace("Entering getDomain() method!");

        /*if (email == null){
            logger.warn("Email is null for customer: {}",name);
        }*/

        /*if (email == null || !email.contains("@")) {
            logger.error("Invalid email provided: {}. Cannot extract domain.", email);
            return "TRY AGAIN"; 
        } */

        logger.debug("Attempting to extract email");

        if (email != null){
            return email.substring(email.indexOf("@") + 1).toUpperCase();}
        else{
            logger.error("Failed at exctracting email!");
            return "TRY AGAIN";
        }

        // email null үед NullPointerException үүсдэг

        }

}