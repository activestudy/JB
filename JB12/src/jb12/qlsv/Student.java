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
public class Student extends Person{
    
    Course[] courses ;
    Student(){
        courses = new Course[Managerment.MAX_COURSE];
    }
    public boolean registerSubject(Course course){
        return true;
    }    

    @Override
    public void print() {
        
    }

    @Override
    public boolean searchByID(String ID) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //code here
        return true;
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
