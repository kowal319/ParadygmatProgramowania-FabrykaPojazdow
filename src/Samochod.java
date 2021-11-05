public class Samochod {
    private String marka;
   private String model;
   private long   vin;
    private double waga;
    private long nadwozie;
   private double cena;

    public Samochod(String marka, String model, long vin, double waga, long nadwozie, double cena) {
        this.marka = marka;
        this.model = model;
        this.vin = vin;
        this.waga = waga;
        this.nadwozie = nadwozie;
        this.cena = cena;
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getVin() {
        return vin;
    }

    public void setVin(long vin) {
        this.vin = vin;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public long getNadwozie() {
        return nadwozie;
    }

    public void setNadwozie(long nadwozie) {
        this.nadwozie = nadwozie;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void showInfo(){
        System.out.println("Marka = " + marka);
        System.out.println("Model = " + model);
        System.out.println("VIN = " + vin);
        System.out.println("Waga = " + waga);
        System.out.println("Nadwozie = " + nadwozie);
        System.out.println("Cena = " + cena);
    }

}
