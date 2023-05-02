package com.mycompany.poepart1;

/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import javax.swing.JOptionPane;


/**
 *
 * @author lab_services_student
 */
public class POEPart1 {

    public static void main(String[] args) {
        //Dislaying the length of the required username and the need of a underscore
            String Username = JOptionPane.showInputDialog("Please enter a username that is no more than 5 characters long with an underscore");
            
        if (Username.length() <= 5 || Username.matches("^[a-zA-Z0-9_]{1,20}$")) {
            JOptionPane.showMessageDialog(null, "Username successfully captured");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
            return;
        }
        //Dislaying the different vairables used to capture a password
        String Password = JOptionPane.showInputDialog("Enter a password that has 8 characters long (capital letter\n "
                + " Contains a number, "
                + "Contains a special character): ");
        
//mkyong
//from https://mkyong.com/regular-expressions/how-to-validate-password-with-regular-expression/#:~:text=Password%20must%20contain%20at%20least%20one%20special%20character%20like%20!,a%20maximum%20of%2020%20characters.
//22-04-2023

        if (Password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$")) {
            
            //Ch&&sec@ke99!
            JOptionPane.showMessageDialog(null, "Password successfully captured");
           
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
            
            return;
    
    }
        // initialize isAuthenticated variable to true
        boolean isAuthenticated = true;
        String name = JOptionPane.showInputDialog("Please enter your name: ");
        String lastname = JOptionPane.showInputDialog("Please enter your last name: ");
        
        //Switch statement is used to check if the entered username and password are correct
        
//W3schools
//from https://www.w3schools.com/java/java_switch.asp
//24-04-2023
        
switch (Username) {
    case "username1":
        if (Password.equals("password1")) {
            isAuthenticated = true;
            //if isAuthenticated is true username and password are correct
        }
        break;
    case "username2":
        if (Password.equals("password2")) {
            isAuthenticated = true;
        }
        
        break;
    default:
        //if isAuthenticated is false username and password are correct
        if (isAuthenticated) {
    JOptionPane.showMessageDialog(null, "Welcome " +name + " " +lastname+" it is great to see you again.");
} else {
    JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again”");
        return;
         
}

}
UserLogin user = new UserLogin();

        
        user.setUsername("my_username");
        user.setPassword("MyPassword1!");

        // User being registered
        String registrationMessage = user.registerUser();
        System.out.println(registrationMessage);

        // An example of a successful login
        boolean isLoginSuccessful = user.loginUser("my_username", "MyPassword1!");
        String loginStatus = user.returnLoginStatus(isLoginSuccessful);
        System.out.println(loginStatus);
        //An example of unsucessfull login
       isLoginSuccessful = user.loginUser("my_username", "wrong_password");
        loginStatus = user.returnLoginStatus(isLoginSuccessful);
        System.out.println(loginStatus);
    }
}


