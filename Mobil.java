// menggunakan interface untuk mengimplementasikan berbagai method yang dinamis
public class Mobil implements KendaraanInterface {
    double tarifDasar = 10000;
    double tarifPerKm = 2500;

    @Override
    public double hitungTarif(double jarakKm) {
        // TODO Auto-generated method stub
        // code untuk menghitung tarif 
        return tarifDasar + (tarifPerKm * jarakKm);
    }
}
