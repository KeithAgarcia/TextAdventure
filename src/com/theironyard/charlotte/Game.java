package com.theironyard.charlotte;

import java.util.Scanner;

public class Game {
    public static Scanner scanner = new Scanner(System.in);
    public static Player player = new Player();

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, traveller.");

        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();
        player.findItem("Sheild");
        player.findItem("Sword");
        plare.findItem("Shotgun");

        public static string nextLine(){
            String line = scanner.nextLine();
            while (line.startsWith("/")) {
                switch (line) {
                    case "/inv":
                        for (String item : player.items) {
                        System.out.println(item);
                    }
                    break;
                        case "/exit":
                        Syestem.exit(0);
                        break;
                    default:
                        system.out.println("Incorrect Command!");
                        break;
                }
                line =scanner.nextLine();
        }
        return line
    }


    }


}
