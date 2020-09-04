package com.brigelabz.collectionpractise.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class HelperService {
    static LinkedList<Object> obj;

    public static void readData() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("CSV.csv"))) {
            scanner.useDelimiter(",");
            obj = new LinkedList<>();

            while (scanner.hasNext()) {
                obj.add(scanner.nextLine());
            }
        }
        System.out.println("Linked List After Reading Data From File :" + obj);
    }

    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data You Want To Add :");
        String text = sc.next();
        if (obj.contains(text) == true) {
            System.out.println(text + " Is Present In Linked List");
            System.out.println("Removing the Data From Linked List And Adding Data To End Of List");
            obj.remove(text);
            obj.add(text);
        } else {
            obj.add(text);
        }
        System.out.println("Linked List After Addition Of Text :" + obj);
    }

    public static void remove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data You Want To Remove :");
        String text = sc.next();
        obj.remove(text);
        System.out.println("Linked List After Deletion Of Data :" + obj);
    }

    public static void searchTheData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data You Want To Search :");
        String text = sc.next();
        if (obj.contains(text) == true) {
            System.out.println(text + " Is Present In Linked List");
            System.out.println("Removing the Data From Linked List And Adding Data To End Of List");
            obj.remove(text);
            obj.add(text);
            System.out.println("Linked List After Manipulation :" + obj);
        } else {
            System.out.println(text + " Is Not Present In Linked List");
            System.out.println("Adding " + text + " To The Linked List");
            obj.add(text);
            System.out.println("Linked List After Manipulation  :" + obj);
        }
    }

    public static void checkEmpty() {
        if (obj.isEmpty() == true) {
            System.out.println("No Data In The Linked List");
        } else {
            System.out.println("Linked List Is Not Empty And It Has " + obj);
        }
    }

    public static void checkSize() {
        System.out.println("Size Of Linked List Is :" + obj.size());
    }

    public static void findIndexPosition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text To Find Index Position :");
        String text = sc.next();
        System.out.println("Index Of " + text + " Is " + obj.indexOf(text));
    }

    public static void insertElement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data  To Insert Element:");
        String text = sc.next();
        System.out.println("Enter Position To Insert Element:");
        int position = sc.nextInt();
        obj.set(position, text);
        System.out.println("Linked List After Adding " + text + " At Postion " + position + " :" + obj);
    }
}
