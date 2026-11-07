public class SepedaListrik implements KendaraanInterface {
    double tarifDasar = 15000;
    double tarifPerKm = 1500;

    @Override
    public double hitungTarif(double jarakKm) {
        // TODO Auto-generated method stub
        // code untuk menghitung tarif
        return tarifDasar + (tarifPerKm * jarakKm);
    }
}
