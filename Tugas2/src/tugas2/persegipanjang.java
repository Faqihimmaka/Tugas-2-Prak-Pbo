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
public class persegipanjang implements MenghitungBidang{
double panjang,lebar;

    public persegipanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void luaspersegi() {
        double hasil;
        hasil=panjang*lebar;
        System.out.println("Luas Persegi Panjang = " + hasil);
    }

    @Override
    public void kelilingpersegi() {
        double hasil;
        hasil= 2* (panjang + lebar);
        System.out.println("Keliling Persegi Panjang = " + hasil);
    }

    @Override
    public void luaslingkaran() {
        
    }

    @Override
    public void kelilinglinkaran() {
        
    }
    
}
