package InterfaceChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
//        loadObject(tim);
        System.out.println(tim);

        Saveable monster = new Monster("Werewolf", 20, 40);
//        monster.getStrength();
        System.out.println(((Monster) monster).getStrength());
        System.out.println(monster);
        saveObject(monster);
    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");
        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 -> {
                    quit = true;
                }
                case 1 -> {
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                }
            }
        }
        return values;
    }

    public static void saveObject(Saveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(Saveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
