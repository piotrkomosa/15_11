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
        int chooseOption = 3;
        while (chooseOption != 0 || vehicles == null) {
            System.out.println("Wybierz opcje: \n 1 - Dodaj auto do kolejki \n 2 - Zrób przegląd auta pierwszego w kolejce \n 0 - Wyjście z programu");
            chooseOption = scanner.nextInt();
            scanner.nextLine();
            if (chooseOption < 0 || chooseOption > 2) {
                System.out.println("Wybierz 0, 1 lub 2");
            } else {
                switch (chooseOption) {
                    case 1:
                        Vehicle vehicle = new Vehicle();
                        System.out.println("Podaj dane nowego auta do przeglądu:");
                        System.out.print("Typ: ");
                        vehicle.setType(scanner.nextLine());
                        System.out.print("Producent:");
                        vehicle.setProducer(scanner.nextLine());
                        System.out.print("Model: ");
                        vehicle.setModel(scanner.nextLine());
                        System.out.print("Rok produkcji:");
                        vehicle.setProdcutionYear(scanner.nextLine());
                        System.out.print("Przebieg: ");
                        vehicle.setMileage(scanner.nextDouble());
                        scanner.nextLine();
                        System.out.print("VIN:");
                        vehicle.setvinNumber(scanner.nextLine());
                        vehicles.offer(vehicle);
                        System.out.println("\n Lista aut w kolejce zaktualizowana o Twoje auto:");
                        System.out.println(vehicles);
                        break;
                    case 2:
                        System.out.println("Auto do przeglądu: ");
                        System.out.println(vehicles.peek());
                        vehicles.poll();
                        System.out.println("Lista aut do przeglądu:");
                        System.out.println(vehicles);
                        break; }
                if (vehicles.size() < 1) {
                    chooseOption = 0;
                }
            }
        }
        System.out.println("Koniec programu");
        scanner.close();
    }
}

