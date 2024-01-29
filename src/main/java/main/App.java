package main;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.main.Animal;
import main.java.main.Zoo;


public class App 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        Zoo newZoo = null;

        System.out.println("Anna eläintarhalle nimi:");
        String zooName = sc.nextLine();
        newZoo = new Zoo(zooName,sc);

        while(!exit){
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
    
            if(sc.hasNext()){
                int i=0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);
    
                switch(i) {
                    case 1: 
                        newZoo.addAnimal();
                        break;
                    case 2:
                        newZoo.listAnimals();

                        break;
                    case 3:
                        newZoo.runAnimals();
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
 
                    default:
                        System.out.println("Syöte oli väärä");

                }
            }
        }
    sc.close();
    }
}
