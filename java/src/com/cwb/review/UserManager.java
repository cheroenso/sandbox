package com.cwb.review;

import java.io.Console;

public class UserManager {
    public static void main(String[] args){
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        System.out.println("Type 'quit' to finish.");
        boolean more = true;
        while (more) {
            System.out.println("Enter new user first name: ");
        	String input = null;
        	input = console.readLine();
        	if ("quit".equalsIgnoreCase(input)){
        		more = false;
        	}
        	// get user information
        	User s = new User();
        	s.setFirstName(input);
            System.out.println("Enter new last name: ");
        	input = console.readLine();
            s.setLastName(input);
            System.out.println("Enter new field: ");
        	input = console.readLine();
            s.setMajor(input);
            System.out.println("New user is " + s.getFirstName() + " " + s.getLastName() + ", field is " + s.getMajor());
            System.out.println("Is this correct? [Y/N]");
        	input = console.readLine();
        	// save data
        	if ("y".equalsIgnoreCase(input)) {
        		System.out.println("Saving user...");
//        		FileStorage fs = new FileStorage();
//        		fs.storeUser(s.csvFormat());
        		XmlStorage xml = new XmlStorage();
        		xml.XmlAdd(s);
        	}
            System.out.println("Type 'quit' to end entry.");        	
        	input = console.readLine();
        	if ("quit".equalsIgnoreCase(input) || "q".equalsIgnoreCase(input)){
        		more = false;
        	}        	
        }
    }
}
