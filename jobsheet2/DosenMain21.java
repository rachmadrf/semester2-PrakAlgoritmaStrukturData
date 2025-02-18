public class DosenMain21 {
    public static void main(String[] args) {
        Dosen21 dosen1 = new Dosen21();
        dosen1.idDosen = "1177";
        dosen1.nama = "Sandhika Galih";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Pemrograman WEB";

        dosen1.setStatusAktif(true);
        dosen1.tampilkanInformasi();
        dosen1.hitungMasaKerja(2025);

        System.out.println("-------------------------");

        Dosen21 dosen2 = new Dosen21("1515", "Dea Afrizal", false, 2012, "Pemrograman Android");

        dosen2.setStatusAktif(true);
        dosen2.ubahBidangKeahlian("Internet of Things");
        dosen2.tampilkanInformasi();
        dosen2.hitungMasaKerja(2025);
    }
}