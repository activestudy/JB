/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb12.enumExample;

/**
 *
 * @author tanth
 */
public class User {
    private String userName;
    private String password;
    private String email;
    private String phone;
    private boolean isBlocked;

    public User(String userName, String password, String email, String phone) {
        this.email = email;
        this.isBlocked = false;
        this.password = password;
        this.phone = phone;
        this.userName = userName;
    }
    
}
