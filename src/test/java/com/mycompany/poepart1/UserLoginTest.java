/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poepart1;

//w3schools
//https://www.w3schools.blog/junit-tutorial
//30-04-2023

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class UserLoginTest {
  
 
         //w3schools blog
        //from https://www.w3schools.blog/junit-tutorial
       //30-04-2023
        
    @Test
    public void UsernameCorrectlyFormatted() {
        UserLogin user = new UserLogin();
        user.setUsername("kyl_l");
        boolean result = user.checkUserName();
        
       assertTrue(result);
       
    }
    
    @Test
    public void UsernameIncorrecttlyFormatted() {
        UserLogin user = new UserLogin();
        user.setUsername("Lilo745!!");
        boolean result = user.checkUserName();
       
        assertEquals(false, result);
        
    }
    
    @Test
    public void PasswordVaild() {
        UserLogin user = new UserLogin();
        user.setPassword("Ch&&sec@ke99!");
        boolean result = user.checkPasswordComplexity();
                
        assertEquals(true, result);
   
    }
     @Test
    public void testInvalidPassword() {
       UserLogin user = new UserLogin();
       user.setPassword("kyll");
        boolean result = user.checkPasswordComplexity();
                
        assertEquals(false, result);
    }
}