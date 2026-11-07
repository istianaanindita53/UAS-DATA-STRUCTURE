public class Trip {
    Driver driver;
    Penumpang penumpang;
    KendaraanInterface kendaraan;

    public Trip(Driver driver, Penumpang penumpang, KendaraanInterface kendaraan) {
        this.driver = driver;
        this.penumpang = penumpang;
        this.kendaraan = kendaraan;
    }
}
