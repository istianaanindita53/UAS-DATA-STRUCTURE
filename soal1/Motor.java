

public class Motor implements KendaraanInterface {
    double tarifDasar = 5000;
    double tarifPerKm = 2000;
    
    @Override
    public double hitungTarif(double jarakKm) {
        // TODO Auto-generated method stub
        // code untuk menghitung tarif 
        return tarifDasar + (tarifPerKm * jarakKm);
    }
}
