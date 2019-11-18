package zad2;

import java.util.Iterator;
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
        Iterator<Vehicle> iterator = vehicles.iterator();
        do {
            switch (chooseOption) {
                case 1:
                    System.out.println("Podaj dane pojadzu:");
                    if(iterator.hasNext()) {
                        vehicles.peek();
                        ((LinkedList<Vehicle>) vehicles).getLast();
                    }
                    break;
                case 2:
                    vehicles.poll();
                    break;
            }
        } while (scanner.nextInt() == 0);
    }
}






