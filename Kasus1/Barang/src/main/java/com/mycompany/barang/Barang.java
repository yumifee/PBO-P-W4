package com.mycompany.barang;

/**
 * @author Yumi Febriana
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public int getStok(){
        return stok;
    }
    
    public void setStok(int stok){
        this.stok = stok;
    }
    
    public Barang(String kode, String nama, int stk){
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    public void addStok(int stok){
        this.stok+=stok;
    }
    
    public static void main(String[]args){
        Inventory beli = new Inventory();
        beli.pengadaan();
    }
}
