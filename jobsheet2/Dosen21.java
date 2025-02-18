public class Dosen21 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    void hitungMasaKerja (int thnSekarang) {
        int masaKerja = thnSekarang - tahunBergabung;
        System.out.println("Masa Kerja: " + masaKerja + " Tahun");
    }

    void ubahBidangKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen21 () {
    }

    public Dosen21 (String id, String nm, boolean st, int th, String ahl) {
        idDosen = id;
        nama = nm;
        statusAktif = st;
        tahunBergabung = th;
        bidangKeahlian = ahl;
    }

}