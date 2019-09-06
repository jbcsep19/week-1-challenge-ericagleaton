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

        int kitchen1 = 1;
        int openRefrig11 = 11;
        int drinkStran111 = 111;
        int eatLeftove112 = 112;
        int openCabine12 = 12;
        int eatCanbean121 = 121;
        int takePlate122 = 122;
        int upstairs2 = 2;
        int bedroom21 = 21;
        int layBed211 = 211;
        int openDrawer212 = 212;
        int bathroom22 = 22;
        int lookMirror221 = 221;
        int useToilet222 = 222;
        int patio3 = 3;
        int goPool31 = 31;
        int cleanPool311 = 311;
        int swimPool312 = 312;
        int openShed32 = 32;
        int takeAx321 = 321;
        int chopTree3211 = 3211;
        int throwAx3212 = 3212;
        int takeHammer322 = 322;
        int hammerNail3221 = 3221;
        int breakHamme3222 = 3222;
        int livingRoom4 = 4;
        int turnTv41 = 41;
        int changeChan411 = 411;
        int incrVolume4111 = 4111;
        int decr4112 = 4112;
        int stayFirst412 = 412;
        int goOpendoor4121 = 4121;
        int ignoreDoor4122 = 4122;
        int sitCouch42 = 42;
        int lookOutwin421 = 421;
        int startEat422 = 422;
        int basement5 = 5;
        int turnLights51 = 51;
        int turnLaundr511 = 511;
        int turnLights512 = 512;
        int walkThedar52 = 52;
        int openChest521 = 521;
        int openCloset522 = 522;


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
                advName0 = "Kitchen";

                System.out.println("Great " + adv0 + " " + advName0 + ". Where would you like to go next? Please enter a number 1 or 2  \n1: Open refrigerator \n2: Open cabinet ");
                int kitchen1adv = scanner.nextInt();
                scanner.nextLine();
                if (kitchen1adv == 1) {
                    // int kitchen1adv = scanner.nextInt(); // nextLine will read to the end of the line
                    // scanner.nextLine();
                    String kitchen1advName;
                    switch (kitchen1adv) {
                        case 1:
                            kitchen1advName = "Open refrigerator";
                            if (kitchen1adv == 1) {
                                System.out.println("Awesome, Open refrigerator. What's next? \n1: Drink strange milk \n2: " +
                                        "Eat leftovers");
                                int openRefrig11Adv = scanner.nextInt(); // nextLine will read to the end of the line
                                scanner.nextLine();
                                String openRefrig11AdvName;
                                if (openRefrig11Adv == 1) {
                                    System.out.println("It is your choice to drink strange milk. \nI would advise against this.");


                                } else if (openRefrig11Adv == 2)
                                    System.out.println("Ok, eat leftovers. They tasted good the first time.");
                               /* switch (openRefrig11Adv) {

                                    case 1:
                                        openRefrig11AdvName = "Eat can of beans";

                                    case 2:
                                        openRefrig11AdvName = "Take a plates";
                                    default:
                                        advName0 = "Main";
                                        adv0 = 0;
                                        break;

                                }*/
                            } else if (kitchen1adv == 2) {
                                System.out.println("What's next? \n1: Eat can of beans \n2: " +
                                        "Take a plate");
                                int openCabine12Adv = scanner.nextInt(); // nextLine will read to the end of the line
                                scanner.nextLine();
                                String openCabine12AdvName;
                                if (openCabine12Adv == 1) {
                                    System.out.println("Enjoy your beans \nI like beans too, but with rice.");


                                } else if (openCabine12Adv == 2) {
                                    System.out.println("Take a Plate");
                                    switch (openCabine12Adv) {

                                        case 1:
                                            openCabine12AdvName = "Eat can of beans";

                                        case 2:
                                            openCabine12AdvName = "Take a plates";
                                        default:
                                            advName0 = "Main";
                                            adv0 = 0;
                                            break;
                                    }


                                    if (kitchen1adv == 2) {
                                        System.out.println("Awesome, Open refrigerator. What's next? \n1: Eat can of beans \n2: " +
                                                "Take a plate");
                                        //int openCabine12Adv = scanner.nextInt(); // nextLine will read to the end of the line
                                        scanner.nextLine();
                                        //String openCabine12AdvName;
                                        if (openCabine12Adv == 1) {
                                            System.out.println("Enjoy your beans \nI like beans too, but with rice.");


                                        } else if (openCabine12Adv == 2) {
                                            System.out.println("Take a Plate");
                                            switch (openCabine12Adv) {

                                                case 1:
                                                    openCabine12AdvName = "Eat can of beans";

                                                case 2:
                                                    openCabine12AdvName = "Take a plates";
                                                default:
                                                    advName0 = "Main";
                                                    adv0 = 0;
                                                    break;

                                            }
                                        } else {
                                            System.out.println("Not a value");
                                        }
                                    }
                                    break;
                                }
                            }
                        case 2:
                            advName0 = "Upstairs";
                            break;
                        case 3:
                            advName0 = "Patio";
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
                    //  System.out.println("\nRecap Your Adventure So Far Has Been As Follows:\nYou have been to the \n \n Don't Forget to make your next selection" + advName0);

                }
        }
    }
}