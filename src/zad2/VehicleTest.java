package zad2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class VehicleTest {

    public static void main(String[] args) {

        Queue<Vehicle> vehicles = new LinkedList<>();

        vehicles.offer(new Vehicle("Osobowy", "BMW", "320", "2014", 185000, "GFURKD12143252"));
        vehicles.offer(new Vehicle("Dostawczy", "Ford", "Transit", "2012", 330000, "HDSGJ1241245"));
        vehicles.offer(new Vehicle("Terenowy", "Toyota", "Tundra", "2008", 210000, "GSJDFJ12414"));

        Scanner scanner = new Scanner(System.in);
        int chooseOption = scanner.nextInt();
        switch (chooseOption) {
            case 0:
                System.out.println("Koniec programu");
                break;
            case 1:
                Vehicle vehicle1 = vehicles.peek();
                System.out.println(vehicle1);
                break;
            case 2:
                Vehicle vehicle2 = vehicles.poll();
                System.out.println(vehicle2);
                break;
        }
    }
}
