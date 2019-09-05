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


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        // write your code here
        System.out.println("Welcome to Erica JG's Choose Your Own Adventure");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where would you like to go? Please enter a number 1 - 5  \n1: Kitchen \n2: Upstairs " +
                "\n3: Patio \n4: Living Room \n5: Basement ");
        int room = scanner.nextInt(); // nextLine will read to the end of the line
        scanner.nextLine();
        String roomName;
        switch (room) {
            case 1:
                roomName = "Kitchen";
                //public Kitchen.kitchen();

                break;
            case 2:
                roomName = "Upstairs";
                break;
            case 3:
                roomName = "Patio";
                break;
            case 4:
                roomName = "Living Room";
                break;
            case 5:
                roomName = "Basement";
                break;
            default: roomName = "Main";
                     room = 0;
                break;
        }
        System.out.println(room + " " + roomName);
    }
}
