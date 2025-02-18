public class MataKuliahMain21 {
    public static void main(String[] args) {
        MataKuliah21 matkul1 = new MataKuliah21();
        matkul1.kodeMK = "1010";
        matkul1.nama = "Struktur Data";
        matkul1.sks = 3;
        matkul1.jumlahJam = 3;

        matkul1.tampilkanInformasi();

        MataKuliah21 matkul2 = new MataKuliah21("1020", "Basis Data", 4, 4);

        matkul2.ubahSKS(3);
        matkul2.kurangiJam(1);

        matkul2.tampilkanInformasi();
    }
}