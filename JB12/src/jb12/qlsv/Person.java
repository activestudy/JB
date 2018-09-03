/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb12.qlsv;

/**
 *
 * @author tanth
 */
public abstract class Person {

    private String name;
    private String identify;
    private String manageID;
    private String user;
    private String password;
    private String phoneNumber;
    private String email;
    private MemberType userType;
    private boolean isLogin;

    public abstract void print();

    public abstract boolean searchByID(String ID) ;

    public abstract boolean searchByName(String name);

    public abstract boolean searchByClassName(String className);

    public abstract boolean searchByNameAndClass(String name, String className);

    public boolean login(String user, String password) {
        if (this.user.toUpperCase().equals(user.toUpperCase()) && (this.password.equals(password))) {
            isLogin = true;
            return true;
        }
        return false;
    }

    public void logout() {
        isLogin = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getManageID() {
        return manageID;
    }

    public void setManageID(String manageID) {
        this.manageID = manageID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MemberType getUserType() {
        return userType;
    }

    public void setUserType(MemberType userType) {
        this.userType = userType;
    }

    public boolean isIsLogin() {
        return isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }
    
}
