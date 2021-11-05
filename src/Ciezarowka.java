public class Ciezarowka extends Samochod {

    private double dlugosc;
    private double wysokosc;

    public Ciezarowka(String marka, String model, long vin, double waga, long nadwozie, double cena, double dlugosc, double wysokosc) {
        super(marka, model, vin, waga, nadwozie, cena);
        this.dlugosc = dlugosc;
        this.wysokosc = wysokosc;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

public void showInfo(){
        super.showInfo();
    System.out.println("Dlugosc = " + dlugosc);
    System.out.println("Wysokosc = " + wysokosc);
}
}
