package com.binar.example.challange1;

import com.binar.example.challange1.shapes2d.Circle;
import com.binar.example.challange1.shapes2d.Rectangle;
import com.binar.example.challange1.shapes2d.Square;
import com.binar.example.challange1.shapes2d.Triangle;
import com.binar.example.challange1.shapes3d.Cube;
import com.binar.example.challange1.shapes3d.Cylinder;
import com.binar.example.challange1.shapes3d.SquarePrism;

import java.util.Scanner;
public class App {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        mainMenu();
    }

    private static void mainMenu() {
        System.out.println("----------------------------------------");
        System.out.println("Kalkulator Penghitung Luas dan Volume");
        System.out.println("----------------------------------------");
        System.out.println("Menu");
        System.out.println("1. Luas");
        System.out.println("2. Volume");
        System.out.println("0. keluar");
        int op = Integer.parseInt(scanner.nextLine());
        if (op != 0) {
            if (op == 1) {
                calculateArea();
            } else if (op == 2) {
                calculateVolume();
            } else {
                System.out.println("Input Anda Salah");
                mainMenu();
            }
        }
    }

    private static void calculateArea() {
        System.out.println("----------------------------------------");
        System.out.println("Pilih bidang yang akan dihitung luas");
        System.out.println("----------------------------------------");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("4. Persegi Panjang");
        System.out.println("0. Main Menu");
        int op = Integer.parseInt(scanner.nextLine());
        switch (op) {
            case 0:
                mainMenu();
                break;
            case 1: {
                System.out.println("----------------------------------------");
                System.out.println("Masukan panjang");
                System.out.println("----------------------------------------");
                System.out.println(new Square(Integer.parseInt(scanner.nextLine())).getArea());
                break;
            }
            case 2: {
                System.out.println("----------------------------------------");
                System.out.println("Masukan jari-jari");
                System.out.println("----------------------------------------");
                System.out.println(new Circle(Integer.parseInt(scanner.nextLine())).getArea());
                break;
            }
            case 3: {
                System.out.println("----------------------------------------");
                System.out.println("Masukan alas");
                System.out.println("----------------------------------------");
                int w = Integer.parseInt(scanner.nextLine());
                System.out.println("----------------------------------------");
                System.out.println("Masukan tinggi");
                System.out.println("----------------------------------------");
                int h = Integer.parseInt(scanner.nextLine());
                Integer.parseInt(scanner.nextLine());
                System.out.println(new Triangle(w, h).getArea());
                break;
            }
            case 4: {
                System.out.println("----------------------------------------");
                System.out.println("Masukan panjang");
                System.out.println("----------------------------------------");
                int l = Integer.parseInt(scanner.nextLine());
                System.out.println("----------------------------------------");
                System.out.println("Masukan lebar");
                System.out.println("----------------------------------------");
                int w = Integer.parseInt(scanner.nextLine());
                System.out.println(new Rectangle(l, w).getArea());
                break;
            }
            default: {
                calculateArea();
                break;
            }
        }
    }


    private static void calculateVolume() {
        System.out.println("----------------------------------------");
        System.out.println("Pilih bidang yang akan dihitung volume");
        System.out.println("----------------------------------------");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("0. Main Menu");
        int op = Integer.parseInt(scanner.nextLine());
        switch (op) {
            case 0:
                mainMenu();
                break;
            case 1: {
                System.out.println("----------------------------------------");
                System.out.println("Masukan panjang");
                System.out.println("----------------------------------------");
                System.out.println(new Cube(Integer.parseInt(scanner.nextLine())).getVolume());
                break;
            }
            case 2: {
                System.out.println("----------------------------------------");
                System.out.println("Masukan panjang");
                System.out.println("----------------------------------------");
                int l = Integer.parseInt(scanner.nextLine());
                System.out.println("----------------------------------------");
                System.out.println("Masukan lebar");
                System.out.println("----------------------------------------");
                int w = Integer.parseInt(scanner.nextLine());
                System.out.println("----------------------------------------");
                System.out.println("Masukan tinggi");
                System.out.println("----------------------------------------");
                int h = Integer.parseInt(scanner.nextLine());
                System.out.println(new SquarePrism(l, w, h).getVolume());
                break;
            }
            case 3: {
                System.out.println("----------------------------------------");
                System.out.println("Masukan jari-jari");
                System.out.println("----------------------------------------");
                int r = Integer.parseInt(scanner.nextLine());
                System.out.println("----------------------------------------");
                System.out.println("Masukan tinggi");
                System.out.println("----------------------------------------");
                int h = Integer.parseInt(scanner.nextLine());
                System.out.println(new Cylinder(r, h).getVolume());
                break;
            }
            default: {
                calculateArea();
                break;
            }
        }
    }


}
