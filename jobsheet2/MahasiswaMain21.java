public class MahasiswaMain21 {
    public static void main(String[] args) {
        
        Mahasiswa21 mhs1 = new Mahasiswa21();
        mhs1.nama = "Rachmad Febriananda";
        mhs1.nim = "244107020095";
        mhs1.kelas = "TI 1F";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1Z");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa21 mhs2 = new Mahasiswa21("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa21 mhsRachmad = new Mahasiswa21("Rachmad Febriananda", "244107020095", 3.60, "TI 1Z");
        mhsRachmad.tampilkanInformasi();
    }
}