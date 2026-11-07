public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("Aplikasi transportasi online GoCepat! ");
        System.out.println("melayani Motor, Mobil, dan Mobil Listrik, masing - masing dengan skema tarif berbeda.");
        System.out.println("=====================================");

        // code sederhana untuk soal 1a
        System.out.println("Simulasi menggunakan interface dan class");
        Motor motorInterface = new Motor();
        System.out.println("Total tarif Motor 10km dengan tarif dasar (5000) dan tarif per-km (2000): Rp. "
                + motorInterface.hitungTarif(10));
        Mobil mobilInterface = new Mobil();
        System.out.println("Total tarif Mobil 10km dengan tarif dasar (10000) dan tarif per-km (2500): Rp. "
                + mobilInterface.hitungTarif(10));
        MobilListrik mobilListrikInterface = new MobilListrik();
        System.out.println("Total tarif Mobil Listrik 10km dengan tarif dasar (20000) dan tarif per-km (1000): Rp. "
                + mobilListrikInterface.hitungTarif(10));

        System.out.println("=====================================");
        System.out.println("Simulasi menggunakan enum");
        KendaraanEnum motorEnum = KendaraanEnum.MOTOR;
        System.out.println("Total tarif Motor 10km dengan tarif dasar (5000) dan tarif per-km (2000): Rp. "
                + motorEnum.hitungTarif(10));
        KendaraanEnum mobilEnum = KendaraanEnum.MOBIL;
        System.out.println("Total tarif Mobil 10km dengan tarif dasar (10000) dan tarif per-km (2500): Rp. "
                + mobilEnum.hitungTarif(10));
        KendaraanEnum mobilListrikEnum = KendaraanEnum.MOBILLISTRIK;
        System.out.println("Total tarif Mobil Listrik 10km dengan tarif dasar (20000) dan tarif per-km (1000): Rp. "
                + mobilListrikEnum.hitungTarif(10));

        // code sederhana untuk soal 1b
        // Contoh implementasi class Trip dan Driver, Penumpang, & Kendaraan (interface)
        Driver driver = new Driver("Driver Budi", 30, "1234567890");
        Penumpang penumpang = new Penumpang("Penumpang Anin", 22, "1234567890");
        KendaraanInterface mobil = new Mobil();
        Trip trip = new Trip(driver, penumpang, mobil);
        System.out.println("=====================================");
        System.out.println("Trip Detail: TRIP-001");
        System.out.println("Nama penumpang: " + trip.penumpang.nama);
        System.out.println("NIK penumpang: " + trip.penumpang.nik);
        System.out.println("Nama driver: " + trip.driver.nama);
        System.out.println("NIK driver: " + trip.driver.nik);
        System.out.println("Tarif kendaraan: Rp. " + trip.kendaraan.hitungTarif(10));

        // code sederhana untuk soal 1c
        // Contoh implementasi penambahan jenis kendaraan baru "Motor Listrik"
        // bisa dilihat dari code dibawah, dimana codenya sama seperti di code 1b, tinggal diubah new MotorListrik()
        Driver driver2 = new Driver("Driver Suprianto", 33, "09876654321");
        Penumpang penumpang2 = new Penumpang("Penumpang Anin", 22, "1234567890");
        KendaraanInterface sepedaListrik = new SepedaListrik();
        Trip trip2 = new Trip(driver2, penumpang2, sepedaListrik);
        System.out.println("=====================================");
        System.out.println("Trip Detail: TRIP-002");
        System.out.println("Nama penumpang: " + trip2.penumpang.nama);
        System.out.println("NIK penumpang: " + trip2.penumpang.nik);
        System.out.println("Nama driver: " + trip2.driver.nama);
        System.out.println("NIK driver: " + trip2.driver.nik);
        System.out.println("Tarif kendaraan: Rp. " + trip2.kendaraan.hitungTarif(10));
    }
}
