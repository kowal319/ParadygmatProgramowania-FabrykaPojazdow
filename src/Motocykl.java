public class Motocykl extends Samochod {
    private String typ;
    private String kolor;

    public Motocykl(String marka, String model, long vin, double waga, long nadwozie, double cena, String typ, String kolor) {
        super(marka, model, vin, waga, nadwozie, cena);
        this.typ = typ;
        this.kolor = kolor;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Typ = " + typ);
        System.out.println("Kolor = " + kolor);
    }
}
