/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package person;


public class PersonBeraksi {
    public static void main(String[] args) {
        Person Anton = new Person();
        
        Anton.nama = "Anton";
        Anton.jenisKelamin = "Lakilaki";
        Anton.umur = 18 ;
        
        System.out.println("Nama :" + Anton.nama);
        System.out.println("Jenis Kelamin :" + Anton.jenisKelamin);
        System.out.println("Umur :" + Anton.umur);
        
        Person Riko = new Person();
        
        Riko.nama = "Riko";
        Riko.jenisKelamin = "Lakilaki";
        Riko.umur = 20;
        
        System.out.println("Nama :" + Riko.nama);
        System.out.println("Jenis Kelamin :" + Riko.jenisKelamin);
        System.out.println("Umur :" + Riko.umur);
                
    }

}
