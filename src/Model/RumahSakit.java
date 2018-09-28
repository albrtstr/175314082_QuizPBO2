/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jarkom
 */
public class RumahSakit {

    private String nama;
    private ArrayList<Dokter> daftarDokter = new ArrayList<Dokter>();
    private ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();

    public RumahSakit() {

    }

    public RumahSakit(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        this.daftarKlinik = daftarKlinik;
    }

    public void tambahKlinik(Klinik klinik) {
        daftarKlinik.add(klinik);
    }

    public ArrayList<Dokter> getDaftarDokter() {
        return daftarDokter;
    }

    public void setDaftarDokter(ArrayList<Dokter> daftarDokter) {
        this.daftarDokter = daftarDokter;
    }


    public void tambahDokter(Dokter dokter) {
        if (cariDokter(dokter.getNama())<0) {
            daftarDokter.add(dokter);
        }else{
            System.out.println("Dokter sudah ada");
        }
    }

    public int cariDokter(String nama) {
        for (int i = 0; i < daftarDokter.size(); i++) {
            if (nama == null ? daftarDokter.get(i).getNama() == null : nama.equals(daftarDokter.get(i).getNama())) {
                return i;
            }

        }
        return -1;
    }

    public int cariKlinik(String nama) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (nama == null ? daftarKlinik.get(i).getNamaKlinik() == null : nama.equals(daftarKlinik.get(i).getNamaKlinik())) {
                return i;
            }
        }
        return -1;
    }
}
