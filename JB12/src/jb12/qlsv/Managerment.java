/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb12.qlsv;

import java.util.Scanner;

/**
 *
 * @author tanth
 */
public class Managerment {

    static final int MAX_MEMBER = 50;
    public static final int MAX_COURSE = 10;
    Course[] courses = new Course[MAX_COURSE];
    Person[] members = new Person[MAX_MEMBER];
    Person currentPerson;

    Managerment() {
        currentPerson = null;
        loadPerson();
    }

    public boolean login() {
        String user;
        String passwrod;
        Scanner input = new Scanner(System.in);
        System.out.println("User\t: ");
        user = input.nextLine();
        System.out.println("Password\t: ");
        passwrod = input.nextLine();
        for (int i = 0; i < MAX_MEMBER; i++) {
            if ((members[i] != null) && (members[i].login(user, passwrod) == true)) {
                currentPerson = members[i];
                break;
            }
        }
        if (currentPerson != null) {
            System.out.println("Login Success.");
            return true;
        } else {
            System.out.println("Login false.");
        }
        return false;
    }

    public void logOut() {
        currentPerson.logout();
        return;
    }

    public void search() {
        System.out.println("ID of student:");
        Scanner input = new Scanner(System.in);
        String id_ = input.nextLine();
        if ((currentPerson != null) && (currentPerson.getUserType() == MemberType.MEMBER_TYPE_STUDENT)) {
            currentPerson.print();
            return;
        } else {
            for (int i = 0; i < MAX_MEMBER; i++) {
                if ((members[i] != null) && (members[i].searchByID(id_) == true)) {
                    members[i].print();
                }
            }
        }

    }

    public void selectMenu() {
        Scanner input = new Scanner(System.in);
        int selected = 0;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1: Login");
            System.out.println("2: Logout");
            System.out.println("3: Search");
            System.out.println("4: Exit");
            System.out.println("5: ...");
            selected = input.nextInt();
            switch (selected) {
                case 1:
                    login();
                    break;
                case 2:
                    logOut();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Selection");
            }
        }
    }

    boolean loadPerson() {
        //Khoi tao du lieu cac member tai day de do phai nhap
        System.out.println("The initialization of the data is successful!");
        return true;
    }
}
