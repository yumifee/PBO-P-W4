package com.mycompany.kelassatu;

/**
 *
 * @author Yumi Febriana
 */
public class KelasSatu {
 {
        System.out.println(11);
    }
    static
    {       
     System.out.println(2);   
    }
    public KelasSatu(int i)
    {
        System.out.println(3);
    }
    public KelasSatu()
    {
        System.out.println(4);
    }
    public static void main (String[]args)
    {
        System.out.println(6);
        KelasSatu satu = new KelasSatu();
        KelasSatu dua = new KelasSatu(10);
    }
}