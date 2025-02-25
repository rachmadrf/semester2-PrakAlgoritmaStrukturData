class DataDosen21 {
    public static void dataSemuaDosen(Dosen21[] daftarDosen21) {
        for (Dosen21 d : daftarDosen21) {
            d.tampilkanInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen21[] daftarDosen21) {
        int pria = 0, wanita = 0;
        for (Dosen21 d : daftarDosen21) {
            if (d.isJenisKelamin()) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
        System.out.println("------------------------------");
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen21[] daftarDosen21) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;
        for (Dosen21 d : daftarDosen21) {
            if (d.isJenisKelamin()) {
                totalPria += d.getUsia();
                countPria++;
            } else {
                totalWanita += d.getUsia();
                countWanita++;
            }
        }
        System.out.println("Rata-rata usia Dosen Pria: " + (countPria == 0 ? 0 : (totalPria / countPria)));
        System.out.println("Rata-rata usia Dosen Wanita: " + (countWanita == 0 ? 0 : (totalWanita / countWanita)));
        System.out.println("------------------------------");
    }

    public static void infoDosenPalingTua(Dosen21[] daftarDosen21) {
        Dosen21 tertua = daftarDosen21[0];
        for (Dosen21 d : daftarDosen21) {
            if (d.getUsia() > tertua.getUsia()) {
                tertua = d;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tertua.tampilkanInfo();
    }

    public static void infoDosenPalingMuda(Dosen21[] daftarDosen21) {
        Dosen21 termuda = daftarDosen21[0];
        for (Dosen21 d : daftarDosen21) {
            if (d.getUsia() < termuda.getUsia()) {
                termuda = d;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.tampilkanInfo();
    }
}
