/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb12.hinhhoc;

import java.util.Scanner;

/**
 *
 * @author tanth
 */
public class Manager {

    Geometry[] Geometrys = new Geometry[15];
    int nCountGeometry = 0;

    public void selectMenu() {
        Scanner input = new Scanner(System.in);
        int selected = 0;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1: Input Triangle");
            System.out.println("2: input square");
            System.out.println("3: input round");
            System.out.println("4: show all");
            System.out.println("0: Exit");

            selected = input.nextInt();
            switch (selected) {
                case 0:
                    return;
                case 1:
                    Geometrys[nCountGeometry] = new Triangle();
                    Geometrys[nCountGeometry].input();
                    Geometrys[nCountGeometry].perimeter();
                    Geometrys[nCountGeometry].acreage();
                    nCountGeometry++;
                    break;
                case 2:
                    Geometrys[nCountGeometry] = new Square();
                    Geometrys[nCountGeometry].input();
                    Geometrys[nCountGeometry].perimeter();
                    Geometrys[nCountGeometry].acreage();
                    nCountGeometry++;
                    break;
                case 3:
                    Geometrys[nCountGeometry] = new Circle();
                    Geometrys[nCountGeometry].input();
                    Geometrys[nCountGeometry].perimeter();
                    Geometrys[nCountGeometry].acreage();
                    nCountGeometry++;
                    break;
                case 4:
                    showAll();
                    break;                    
                default:
                    System.out.println("Invalid Selection");
            }
        }
    }

    public void showAll() {
        for (int i = 0; i < nCountGeometry; i++) {
            if (Geometrys[i] != null) {
                Geometrys[i].print();
            }
        }
    }
}
