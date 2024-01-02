package example1;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Plant plant1 = new Plant("plant1", 50, 100, 100);
        // Plant plant2 = new Plant("plant2", 0, 100, 70);
        // Plant plant3 = new Plant("plant3", 10, 10, 30);
        // Plant plant4 = new Plant("plant4", 0, 100, 30);
        // Plant plant5 = new Plant("plant5", 100, 100, 1);
        // Plant plant6 = new Plant("plant1", 50, 100, 100);

        // SmartGarden smart = new SmartGarden(90, 100);

        // smart.addPlant(plant1);
        // smart.addPlant(plant2);
        // smart.addPlant(plant3);
        // smart.addPlant(plant4);
        // smart.addPlant(plant5);
        // smart.addPlant(plant6);

        // smart.checkLighting();
        // System.out.println("\nLight checked\n");

        // smart.printReport();
        // smart.waterPlants();
        // System.out.println("\nPlants has been watered\n");
        // smart.printReport();

        // List<Person> list = new ArrayList<>();
        // list.add(new Person("anton", "2101971234"));
        // list.add(new Person("svend", "2101971235"));
        // list.add(new Student("olé", "2101971236", "sd"));
        // printInfo(list);

        System.out.println("Hello \\sWorld");

    }

    public static void printInfo(List<Person> listOfPerson) {
        for (Person person : listOfPerson) {
            System.out.println(person.toString());
        }
    }
}
