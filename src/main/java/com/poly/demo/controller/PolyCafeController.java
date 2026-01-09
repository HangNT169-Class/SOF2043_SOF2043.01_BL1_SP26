/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.demo.controller;

import com.poly.demo.view.dialog.CategoryJDialog;
import com.poly.demo.view.dialog.LoginJDialog;
import com.poly.demo.view.dialog.WelcomeJDialog;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author hangnt
 */
public interface PolyCafeController {
    
    // cac ham k co body 
    // phai them default thi viet duoc cac ham co body code {}
    // show Dialog => dung cho tat ca cac diaload
    default void showJDialog(JDialog dialog){
        dialog.setVisible(true);
    }
    
    // show WelcomeJialog 
    default void showWelcomeJDialog(JFrame jFrame){
        this.showJDialog(new WelcomeJDialog(jFrame, true));
    }
    
     // show WelcomeJialog 
    default void showLoginJDialog(JFrame jFrame){
        this.showJDialog(new LoginJDialog(jFrame, true));
    }
    
      // show WelcomeJialog 
    default void showCategoryJDialog(JFrame jFrame){
        this.showJDialog(new CategoryJDialog(jFrame, true));
    }
}
