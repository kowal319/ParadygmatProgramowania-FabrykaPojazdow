import java.util.ArrayList;
import java.util.Scanner;

public class Fabryka {

    ArrayList<Samochod> samochods;
    ArrayList<Motocykl> motocykls;
    ArrayList<Ciezarowka> ciezarowkas;

    Scanner input = new Scanner(System.in);


    Fabryka() {
        samochods = new ArrayList<>();
        motocykls = new ArrayList<>();
        ciezarowkas = new ArrayList<>();
        samochods.add(new Samochod("BMW", "Series 3", 123452133, 1500, 384729104, 30000));
        motocykls.add(new Motocykl("Yamaha", "R6", 321242434, 950.5, 121334331, 15000, "Scigacz", "Czerwony"));
        ciezarowkas.add(new Ciezarowka("Volvo", "Yxz", 94093284, 20000.5, 234324234, 100000, 8.54, 3.50));

        odpalMenu();
    }

    public void odpalMenu() {

        boolean petla = true;
        while (petla) {
            System.out.println("Wybierz jedna z opcji");
            System.out.println("1 - Wyswietl flote");
            System.out.println("2 - Dodaj nowy pojazd");
            int opcja = input.nextInt();
            switch (opcja) {
                case 1:
                    System.out.println("1 - Wyswietl flote samochodow");
                    System.out.println("2 - Wyswietl flote motocykli");
                    System.out.println("3 - Wyswietl flote ciezarowek");
                    System.out.println("4 - Wyswietl cala flote");
                    int wyswietlFlote = input.nextInt();
                    switch (wyswietlFlote) {
                        case 1:
                            wyswietlSamochody();
                            break;
                        case 2:
                            wyswietlMotocykle();
                            break;
                        case 3:
                            wyswietlCiezarowki();
                            break;
                        case 4:
                            wyswietlWszystkie();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1 - Dodaj samochod");
                    System.out.println("2 - Dodaj motocykl");
                    System.out.println("3 - Dodaj ciezarowke");
                    int dodajNowyPojazd = input.nextInt();
                    switch (dodajNowyPojazd) {
                        case 1:
                            dodajSamochod();
                            break;
                        case 2:
                            dodajMotocykl();
                            break;
                        case 3:
                            dodajCiezarowke();
                            break;
                    }
            }
        }
    }

    private void wyswietlSamochody() {
        System.out.println("Samochody:");
        for (int i = 0; i < samochods.size(); i++) {
            samochods.get(i).showInfo();
            System.out.println("-----------------");
        }
    }

    private void wyswietlMotocykle() {
        System.out.println("Motocykle:");
        for (int i = 0; i < motocykls.size(); i++) {
            motocykls.get(i).showInfo();
            System.out.println("-----------------");
        }
    }

    private void wyswietlCiezarowki() {
        System.out.println("Ciezarowki:");
        for (int i = 0; i < ciezarowkas.size(); i++) {
            ciezarowkas.get(i).showInfo();
            System.out.println("-----------------");
        }
    }

    private void wyswietlWszystkie() {
        System.out.println("Samochody:");
        for (int i = 0; i < samochods.size(); i++) {
            samochods.get(i).showInfo();
            System.out.println("-----------------");
        }
        System.out.println("Motocykle:");
        for (int i = 0; i < motocykls.size(); i++) {
            motocykls.get(i).showInfo();
            System.out.println("-----------------");
        }
        System.out.println("Ciezarowki:");
        for (int i = 0; i < ciezarowkas.size(); i++) {
            ciezarowkas.get(i).showInfo();
            System.out.println("-----------------");
        }
    }

private void dodajSamochod(){
    System.out.println("Marka = ");
    String marka = input.next();
    System.out.println("Model = ");
    String model = input.next();
    System.out.println("VIN = ");
    Long vin = input.nextLong();
    System.out.println("Waga = ");
    double waga = input.nextDouble();
    System.out.println("Nadwozie = ");
    Long nadwozie = input.nextLong();
    System.out.println("Cena = ");
    double cena = input.nextDouble();
    samochods.add(new Samochod(marka, model, vin, waga, nadwozie, cena));
}

    private void dodajMotocykl(){
        System.out.println("Marka = ");
        String marka = input.next();
        System.out.println("Model = ");
        String model = input.next();
        System.out.println("VIN = ");
        Long vin = input.nextLong();
        System.out.println("Waga = ");
        double waga = input.nextDouble();
        System.out.println("Nadwozie = ");
        Long nadwozie = input.nextLong();
        System.out.println("Cena = ");
        double cena = input.nextDouble();
        System.out.println("Typ = ");
        String type = input.next();
        System.out.println("Kolor = ");
        String kolor = input.next();
        motocykls.add(new Motocykl(marka, model, vin, waga, nadwozie, cena, type, kolor));
    }

    private void dodajCiezarowke(){
        System.out.println("Marka = ");
        String marka = input.next();
        System.out.println("Model = ");
        String model = input.next();
        System.out.println("VIN = ");
        Long vin = input.nextLong();
        System.out.println("Waga = ");
        double waga = input.nextDouble();
        System.out.println("Nadwozie = ");
        Long nadwozie = input.nextLong();
        System.out.println("Cena = ");
        double cena = input.nextDouble();
        System.out.println("Dlugosc = ");
        double dlugosc = input.nextDouble();
        System.out.println("Wysokosc = ");
        double wysokosc = input.nextDouble();
        ciezarowkas.add(new Ciezarowka(marka, model, vin, waga, nadwozie, cena, dlugosc, wysokosc));
        }
        }

