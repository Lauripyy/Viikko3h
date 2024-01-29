package main.java.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    private Scanner sc;
    ArrayList<Animal> animals = new ArrayList<>();
    Animal newAnimal = null;
    
    private String zooName;

    public Zoo(String zooName, Scanner sc){
        this.zooName = zooName;
        this.sc = sc;
        
    }

    public String getZooName() {
        return zooName;
    }

    public void addAnimal(){
        System.out.println("Mikä laji?");
        String species = sc.nextLine();
        System.out.println("Anna eläimen nimi:");
        String name = sc.nextLine();
        System.out.println("Anna eläimen ikä:");
        String ageString = sc.nextLine();
        int age = Integer.parseInt(ageString);

        newAnimal = new Animal(species, name, age);
        animals.add(newAnimal);

    }

    public void listAnimals(){
        System.out.println(zooName+" pitää sisällään seuraavat eläimet:");
                        
        for (Animal animal : animals) {
            System.out.println(animal.getSpecies()+": "+animal.getName()+", "+animal.getAge()+" vuotta");
        }
        
    }
    public void runAnimals(){
        System.out.println("Kuinka monta kierrosta?");
        String roundsString = sc.nextLine();
        int rounds = Integer.parseInt(roundsString);
        int j;

        for (Animal animal : animals) {
            for(j=0;j<rounds;j++) {
                System.out.println(animal.getName()+" juoksee kovaa vauhtia!");
            }
                               
        }

    }
    
}

