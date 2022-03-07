/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author ACER
 */
public class balok implements MenghitungRuang {
double panjang,lebar,tinggi;

    public balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    
    @Override
    public void volumebalok() {
        double hasil;
        hasil= panjang*lebar*tinggi;
        System.out.println("Volume Balok = " + hasil);
    }

    @Override
    public void luaspermukaanbalok() {
        double hasil;
        hasil= 2* ((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        System.out.println("Luas Permukaan Balok = " + hasil);
    }

    @Override
    public void volumetabung() {
        
    }

    @Override
    public void luaspermukaantabung() {
        
    }
    
}
