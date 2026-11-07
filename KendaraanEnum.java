// implementasi enum dengan method
public enum KendaraanEnum {
    MOTOR(5000, 2000), MOBIL(10000, 2500), MOBILLISTRIK(20000, 1000);

    private final double tarifDasar;
    private final double tarifPerKm;

    private KendaraanEnum(double tarifDasar, double tarifPerKm) {
        this.tarifDasar = tarifDasar;
        this. tarifPerKm = tarifPerKm;
    }

    public double hitungTarif(double jarakKm) {
        return this.tarifDasar + (tarifPerKm * jarakKm);
    }
}
