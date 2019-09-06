package com.company;
/*
SAMPLE DECISION TREE
Kitchen
Open refrigerator
Drink strange milk
Eat leftovers
Open cabinet
Eat can of beans
Take a plate
Upstairs
Bedroom
Lay on bed
Open the drawer
Bathroom
Look in mirror
Use the toilet
Patio
Go to the pool
Clean the pool
Swim in the pool
Open shed
Take an ax
Chop a tree
Throw the ax
Take a hammer
Hammer a nail
Break the hammer
Living Room
Turn on the TV
Change the channel
Increase the volume
Decrease the volume
Stay on the first channel
Go open the door
Ignore the door
Sit on the couch
Look out the window
Start to eat
Basement
Turn on the lights
Turn the laundry on
Turn the lights off
Walk in the dark
Open a chest
Open a closet
*/


//import com.sun.java.util.jar.pack.Instruction;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println("Welcome to Erica JG's Choose Your Own Adventure");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where would you like to go? Please enter a number 1 - 5  \n1: Kitchen \n2: Upstairs " +
                "\n3: Patio \n4: Living Room \n5: Basement ");
        int adv0 = scanner.nextInt(); // nextLine will read to the end of the line
        scanner.nextLine();
        String advName0;
        switch (adv0) {
            case 1:
                System.out.println("What's next? \n1: Open refrigerator \n2: " +
                        "Open cabinet");
                int adv1 = scanner.nextInt(); // nextLine will read to the end of the line
                scanner.nextLine();
                String openRefrig11AdvName;
                //advName0 = "Open refrigerator";
                if (adv1 == 1) {
                    System.out.println("Awesome, Open refrigerator. What's next? \n1: Drink strange milk \n2: " +
                            "Eat leftovers");
                    int adv2 = scanner.nextInt(); // nextLine will read to the end of the line
                    scanner.nextLine();
                    if (adv2 == 1) {
                        System.out.println("It is your choice to drink strange milk. \nI would advise against this.");
                    } else if (adv2 == 2)
                        System.out.println("Ok, eat leftovers. They tasted good the first time.");
                    else {
                        System.out.println("I quit");
                    }
                } else if (adv1 == 2) {
                    System.out.println("What's next? \n1: Eat can of beans \n2: " +
                            "Take a plate");
                        //int adv1= scanner.nextInt(); // nextLine will read to the end of the line
                        scanner.nextLine();
                        if (adv1 == 1) {
                            System.out.println("Hooray we got beans \nI like beans with rice");
                        } else if (adv1 == 2)
                            System.out.println("Nice, grab a plate");
                        else {
                            System.out.println("I quit");}
                } else if (adv0 == 2){

                }
                break;
            case 2:
                System.out.println("What's next? \n1: Bedroom \n2: " +
                        "Bathroom");
                int adv3 = scanner.nextInt(); // nextLine will read to the end of the line
                scanner.nextLine();

                if (adv3 == 1) {
                    System.out.println("What's next? \n1: Lay on bed \n2: " +
                            "Open the drawer");
                    int adv4 = scanner.nextInt(); // nextLine will read to the end of the line
                    scanner.nextLine();
                    if (adv4 == 1) {
                        System.out.println("I like laying in the bed too \n Good night.");
                    } else if (adv4 == 2)
                        System.out.println("Ok, thanks for opening the drawer . ");
                    else {
                        System.out.println("I quit");
                    }
                } else if (adv3 == 2) {
                    System.out.println("What's next? \n1: Look in mirror \n2: " +
                            "Use the toilet");
                    //int adv1= scanner.nextInt(); // nextLine will read to the end of the line
                    scanner.nextLine();
                    if (adv3 == 1) {
                        System.out.println("Look in mirror\nI like mirrors too");
                    } else if (adv3 == 2)
                        System.out.println("Use the toilet");
                    else {
                        System.out.println("I quit");}
                } else if (adv0 == 2){

                }
                break;
            case 3:
                advName0 = "Patio";
                System.out.println("What's next? \n1: Go to the pool \n2: " +
                        "Open shed");
                int adv4 = scanner.nextInt(); // nextLine will read to the end of the line
                scanner.nextLine();

                if (adv4 == 1) {
                    System.out.println("What's next? \n1: Go to the pool \n2: " +
                            "Open shed ");
                    int adv5 = scanner.nextInt(); // nextLine will read to the end of the line
                    scanner.nextLine();
                    if (adv5 == 1) {
                        System.out.println("Clean the pool\n Enjoy the pool.");
                    } else if (adv5 == 2)
                        System.out.println("Swim in the pool. ");
                    else {
                        System.out.println("I quit");
                    }
                } else if (adv4 == 2) {
                    System.out.println("What's next? \n1: Look in mirror \n2: " +
                            "Use the toilet");
                    //int adv1= scanner.nextInt(); // nextLine will read to the end of the line
                    scanner.nextLine();
                    if (adv4 == 1) {
                        System.out.println("Look in mirror\nI like mirrors too");
                    } else if (adv4 == 2)
                        System.out.println("Use the toilet");
                    else {
                        System.out.println("I quit");}
                } else if (adv0 == 2){

                }
                break;
            case 4:
                advName0 = "Living Room";
                break;
            case 5:
                advName0 = "Basement";
                break;
            default:
                advName0 = "Main";
                adv0 = 0;
                break;
        }
    }
}