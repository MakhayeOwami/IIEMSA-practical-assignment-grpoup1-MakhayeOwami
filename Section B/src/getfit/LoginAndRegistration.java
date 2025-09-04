/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package getfit;

/**
 *
 * @author lab_services_student
 */

import javax.swing.JOptionPane; 
public class LoginAndRegistration {
     private String username;
    private String password;
    private String firstname;
    private String surname;
    private String cellphone;
    private boolean loginStatus = false;

//boolean used for username (could have also used if else as they are both used in decision making
//booleans were used to meet assignment requirements
    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

//Loop used to ensure user can retry entering password if criteria is not met
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isDigit(c)) hasNumber = true;
            else if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }

        return hasUpper && hasNumber && hasSpecial;
    }

    public boolean checkCellphoneNumber(String number) {
        return number.startsWith("+") && number.substring(1).matches("\\d{10}");
    }

   // booleans were used to meet assignment requirements

    public String registerUser() {
// information that will be stored in the variables will be entered using this specific function 
        firstname = JOptionPane.showInputDialog(null, "Enter your first name:");
        surname = JOptionPane.showInputDialog(null, "Enter your surname:");

        while (true) {
            username = JOptionPane.showInputDialog(null, "Create a username (must contain _ and be max 5 characters):");
            if (checkUsername(username)) break;
            else JOptionPane.showMessageDialog(null, "Invalid username. Try again.");
        }

        while (true) {
            password = JOptionPane.showInputDialog(null, "Create a password (min 8 chars, 1 capital, 1 number, 1 special char):");
            if (checkPasswordComplexity(password)) break;
            else JOptionPane.showMessageDialog(null, "Invalid password. Try again.");
        }

        while (true) {
            cellphone = JOptionPane.showInputDialog(null, "Enter cellphone number with country code (i.e. +27000000000):");
            if (checkCellphoneNumber(cellphone)) break;
            else JOptionPane.showMessageDialog(null, "Invalid cellphone number. Try again.");
        }

        return "Registration successful!";
    }
//login in feature method 
 
    public String loginUser() {
        JOptionPane.showMessageDialog(null, "Please log into the same account you created.");
        while (true) {
            String inputUsername = JOptionPane.showInputDialog(null, "Enter your username:");
            String inputPassword = JOptionPane.showInputDialog(null, "Enter your password:");

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                loginStatus = true;
                return "Login successful!";
            } else {
                JOptionPane.showMessageDialog(null, "Login failed. Try again.");
            }
        }
    }

    public String returnLoginStatus() {
        if (loginStatus) {
            return "Welcome " + firstname + " " + surname + ", it's great to see you again!";
        } else {
            return "You are not logged in.";
        }
    
    }}
