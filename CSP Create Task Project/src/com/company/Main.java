package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Base Characters
        GameCharacters Tornado = new GameCharacters("Tornado", 300, 180, 200, 1);
        GameCharacters Bang = new GameCharacters("Bang", 250, 230, 230, 1);
        GameCharacters Genos = new GameCharacters("Genos", 250, 200, 250, 1);
        GameCharacters MetalBat = new GameCharacters("Metal Bat", 280, 200, 200, 1);
        GameCharacters Sonic = new GameCharacters("Speed O' Sound Sonic", 270, 100, 300, 1);

        System.out.println("Choose a character: \n");
        System.out.println("1: " + Tornado.charStats());
        System.out.println("2: " + Bang.charStats());
        System.out.println("3: " + Genos.charStats());
        System.out.println("4: " + MetalBat.charStats());
        System.out.println("5: " + Sonic.charStats());
        int startChoice = input.nextInt();

        if(startChoice == 1){
            Fight1.TornadoFight();
        }
        else if(startChoice == 2){
            Fight1.BangFight();
        }
        else if(startChoice == 3){
           Fight1.GenosFight();
        }
        else if(startChoice == 4){
            Fight1.MetalBatFight();
        }
        else if(startChoice == 5){
            Fight1.SonicFight();
        }
        else{

        }



    }

}
