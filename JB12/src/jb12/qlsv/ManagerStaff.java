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
public class ManagerStaff  extends Person{
    public Person createAccount(){
        return null;
    }
    public Course InputCourse(){        
        return null;
    }
    public void InputMark(Student[] student){
        
    }
    public Student[] searchLowMark(){
     return null;   
    }
    public Student[] searchNeedPay(){
        return null;
    }

    @Override
    public void print() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean searchByID(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean searchByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean searchByClassName(String className) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean searchByNameAndClass(String name, String className) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
