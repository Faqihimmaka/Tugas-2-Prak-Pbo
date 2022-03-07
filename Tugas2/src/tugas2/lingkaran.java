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
public class lingkaran implements MenghitungBidang{
    double jari;

    public lingkaran(double jari) {
        this.jari = jari;
    }
    
    @Override
    public void luaspersegi() {
        
    }

    @Override
    public void kelilingpersegi() {
        
    }

    @Override
    public void luaslingkaran() {
        double hasil;
        hasil= 3.14*(jari*jari);
        System.out.println("Luas Lingkaran = " + hasil);
    }

    @Override
    public void kelilinglinkaran() {
        double hasil;
        hasil= 3.14 *  (jari+jari);
        System.out.println("Keliling Lingkaran = " + hasil);
    }
    
    
}
