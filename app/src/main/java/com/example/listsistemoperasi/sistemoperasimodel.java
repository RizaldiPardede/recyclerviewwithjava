package com.example.listsistemoperasi;

import android.os.Parcel;
import android.os.Parcelable;

public class sistemoperasimodel implements Parcelable {
    private String nama,deskripsi;
    private int foto;

    public sistemoperasimodel(String nama, String deskripsi, int foto) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}
