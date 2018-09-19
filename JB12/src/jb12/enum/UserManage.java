/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb12.enumExample;

import java.util.Scanner;

/**
 *
 * @author tanth
 */
public class UserManage {

    private User exampleUser;
   
    
    User[] Users = new User[20];

    public void selectMenu() {
        
        Scanner input = new Scanner(System.in);
        int selected = 0;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1: Dang Ky");
            System.out.println("2: Dang nhap");
            System.out.println("0: Exit");

            selected = input.nextInt();
            switch (selected) {
                case 0:
                    return;
                case 1:
                    RegisAccount();
                    break;
                case 2:

                    break;

                default:
                    System.out.println("Invalid Selection");
            }
        }
    }

    public void RegisAccount() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Moi nhac User");
            String user = input.nextLine();
            System.out.println("Moi nhap password");
            String password = input.nextLine();
            System.out.println("Moi nhap Email");
            String email = input.nextLine();
            System.out.println("Moi nhap Phone number");
            String phoneNumber = input.nextLine();
            checkEmail(email);
            checkPhone(phoneNumber);
        } catch (MyException ex) {
            System.out.println("Co loi xay ra: " + ex.getMessage());
            System.out.println("Ma loi: " + ex.getError().getValue());
        }
    }

    public boolean checkEmail(String email) throws MyException {
        if (email.contains("@")) {
            return true;
        } else {
            throw new MyException(ErrorCode.EMAIL_INVALID_FORMAT);
        }
    }
    public boolean checkPhone(String phone) throws MyException{
        //kiem tra so phone theo dinh dang.
        throw new MyException(ErrorCode.PHONE_INVALID_FORMAT);
    }
}
