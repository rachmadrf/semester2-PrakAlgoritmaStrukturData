class DataDosen21 {
    Dosen21[] dataDosen = new Dosen21[10];
    int idx = 0;

    public void tambah(Dosen21 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh.");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen kosong.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen21 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan secara ASCENDING (Termuda -> Tertua).");
    }

    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen21 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data berhasil diurutkan secara DESCENDING (Tertua -> Termuda).");
    }

    // pencarian sequential berdasarkan nama
    public void pencarianDataSequential21(String nama) {
        boolean ditemukan = false;
        int count = 0;

        System.out.println("\nHasil Pencarian Nama Dosen: " + nama);
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                ditemukan = true;
                count++;
            }
        }

        if (!ditemukan) {
            System.out.println("Dosen dengan nama '" + nama + "' tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari 1 dosen dengan nama '" + nama + "'!");
        }
    }

    // pencarian binary berdasarkan usia
    public void pencarianDataBinary21(int usia) {
        sortingASC(); //diurutkan ASC 
        int kiri = 0, kanan = idx - 1, mid;
        boolean ditemukan = false;
        int count = 0;

        System.out.println("\nHasil Pencarian Dosen dengan Usia: " + usia);
        while (kiri <= kanan) {
            mid = (kiri + kanan) / 2;

            if (dataDosen[mid].usia == usia) {
                // Mencari semua dosen dengan usia yang sama
                for (int i = mid; i >= 0 && dataDosen[i].usia == usia; i--) {
                    dataDosen[i].tampil();
                    count++;
                }
                for (int i = mid + 1; i < idx && dataDosen[i].usia == usia; i++) {
                    dataDosen[i].tampil();
                    count++;
                }
                ditemukan = true;
                break;
            } else if (dataDosen[mid].usia < usia) {
                kiri = mid + 1;
            } else {
                kanan = mid - 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Dosen dengan usia " + usia + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari 1 dosen dengan usia " + usia + "!");
        }
    }
}