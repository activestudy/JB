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
public enum ErrorCode {
    USER_EXITS(1,"User da ton tai"),
    PASSWORD_INVALID_FORMAT(2,"Sai dinh dang password"),
    PASSWORD_INVALID_RETYPE(3, "Nhap lai password sai"),
    EMAIL_INVALID_FORMAT(4, "Sai dinh dang Email"),
    PHONE_INVALID_FORMAT(5, "Sai dinh dang so dien thoai"),
    USER_NOT_EXITS(6, "Sai User"),
    PASSWORD_INVALID(7,"Sai password"),
    USE_BLOCKED(8, "User da bị khoa");
    int value;
    String des;
    ErrorCode(int value, String des){
        this.value = value;
        this.des = des;
    }

    public int getValue() {
        return value;
    }

    public String getDes() {
        return des;
    }
    
}
