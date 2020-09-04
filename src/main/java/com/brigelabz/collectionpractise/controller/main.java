package com.brigelabz.collectionpractise.controller;

import com.brigelabz.collectionpractise.service.HelperService;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        int i = 0;
        Scanner input = new Scanner(System.in);
        while (i == 0) {
            System.out.println("\nReading Data From File And Manipulation Of Data\n" +
                    "1. Read Data From File And Add To Linked-List\n" +
                    "2. Search Data in Linked-List\n" +
                    "3. Add Data In Linked-list\n" +
                    "4. Remove Data From Linked-list\n" +
                    "5. Check If Linked-List Is Empty Or Not\n" +
                    "6. Find The Current Size Of Linked-List\n" +
                    "7. Find The Index Position Of Existing Data\n" +
                    "8. Add Element At Index Position Of Your Choice\n" +
                    "9. Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> HelperService.readData();
                case 2 -> HelperService.searchTheData();
                case 3 -> HelperService.add();
                case 4 -> HelperService.remove();
                case 5 -> HelperService.checkEmpty();
                case 6 -> HelperService.checkSize();
                case 7 -> HelperService.findIndexPosition();
                case 8 -> HelperService.insertElement();
                case 9 -> i = 1;
            }
        }

    }
}