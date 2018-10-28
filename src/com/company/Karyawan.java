package com.company;

/**
 * @author
 * NAMA                 : Joseph Armando Carvallo
 * KELAS                : PBO2
 * NIM                  : 10117077
 * Deskripsi Program    : Menghitung gaji total berdasarkan tunjangan golongan, jabatan dan kehadiran
 **/

public class Karyawan {
    private String nik;
    private String nama;
    private int golongan;
    private String jabatan;
    private int jmlKehadiran;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {

        this.nik = nik;
    }

    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public int getGolongan() {

        return golongan;
    }

    public void setGolongan(int golongan) {

        this.golongan = golongan;
    }

    public String getJabatan() {

        return jabatan;
    }

    public void setJabatan(String jabatan) {

        this.jabatan = jabatan;
    }

    public int getJmlKehadiran() {

        return jmlKehadiran;
    }

    public void setJmlKehadiran(int jmlKehadiran) {

        this.jmlKehadiran = jmlKehadiran;
    }

    public double tunjanganGolongan() {
        double besarTunjangan = 0;
        switch (golongan) {
            case 1: besarTunjangan=500000;  break;
            case 2: besarTunjangan=1000000;  break;
            case 3: besarTunjangan=1500000;  break;
        }
        return besarTunjangan;}

    public double tunjanganJabatan() {
        double besarTunjangan = 0;
        switch (jabatan) {
            case "Manager": besarTunjangan=2000000; break;
            case "Kabag": besarTunjangan=1000000; break;
        }
        return besarTunjangan;}

    public double tunjanganKehadiran() {

        return jmlKehadiran*10000;
    }

    public double totalGaji() {

        return tunjanganJabatan()+tunjanganGolongan()+tunjanganKehadiran();
    }
}