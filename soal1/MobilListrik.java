// menggunakan interface untuk mengimplementasikan berbagai method yang dinamis
public class MobilListrik implements KendaraanInterface {
    double tarifDasar = 20000; // tarif dasar lebih tinggi dari Mobil/Motor
    double tarifPerKm = 1000; // namun tarif per-km lebih murah dari Mobil/Motor
    
    @Override
    public double hitungTarif(double jarakKm) {
        // TODO Auto-generated method stub
        // code untuk menghitung tarif 
        return tarifDasar + (tarifPerKm * jarakKm);
    }
}
