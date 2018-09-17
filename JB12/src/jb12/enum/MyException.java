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
public class MyException extends Exception{
    ErrorCode error;
    public MyException(ErrorCode value){
        super(value.getDes());
        this.error = value;
    }

    public ErrorCode getError() {
        return error;
    }
    
}
