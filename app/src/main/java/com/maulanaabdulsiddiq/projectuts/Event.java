package com.maulanaabdulsiddiq.projectuts;

public class Event {

    private String namaEvent;
    private String penyelenggara;
    private String tanggal;
    private int gambar;

    public Event(String namaEvent, String penyelenggara, String tanggal, int gambar){
        this.namaEvent = namaEvent;
        this.penyelenggara = penyelenggara;
        this.tanggal = tanggal;
        this.gambar = gambar;
    }

    public String getNamaEvent() {
        return namaEvent;
    }

    public void setNamaEvent(String namaEvent) {
        this.namaEvent = namaEvent;
    }

    public String getPenyelenggara() {
        return penyelenggara;
    }

    public void setPenyelenggara(String penyelenggara) {
        this.penyelenggara = penyelenggara;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
