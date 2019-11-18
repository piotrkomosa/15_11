package zad1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryTest {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("countries.csv")))) {
            Map<String, Country> countiresMap = getCountries(br);
            printCountry(countiresMap);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    private static void printCountry(Map<String, Country> customerMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
        String indeks = scanner.nextLine();
        if(customerMap.containsKey(indeks)){
            System.out.println(customerMap.get(indeks));
        } else {
            System.out.println("Kraj o takim kodzie nie istnieje");
        }
    }
    private static Map<String, Country> getCountries(BufferedReader br) throws IOException{
        Map<String, Country> countiresMap = new HashMap<>();
        String line;
        while ((line = br.readLine()) !=null){
            String[] country = line.split(";");
            String code = country[0];
            countiresMap.put(code, new Country(code,country[1],country[2]));
        }
        return countiresMap;
    }
}