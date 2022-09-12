package com.mycompany.barang;

/**
 * @author Yumi Febriana
 */
public class Inventory {
    Barang[] barangs;
    
    void initBarang(){
        barangs = new Barang [2];
        barangs [0] = new Barang ("001", "Baju",10);
        barangs [1] = new Barang("002", "Celana",20);
    }
    
    void showBarang(){
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[0].getStok() + ")");
    }
    void pengadaan(){
        initBarang();
        
        barangs[0].addStok(20);
        showBarang();
    }
 
}

