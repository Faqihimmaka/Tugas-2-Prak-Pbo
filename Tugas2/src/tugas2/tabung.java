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
public class tabung implements MenghitungRuang{
double jari,tinggi;

    public tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
    
    @Override
    public void volumebalok() {
        
    }

    @Override
    public void luaspermukaanbalok() {
        
    }

    @Override
    public void volumetabung() {
        double hasil;
        hasil=3.14*(jari*jari)*tinggi;
        System.out.println("Volume Tabung = " + hasil);
    }

    @Override
    public void luaspermukaantabung() {
        double hasil;
        hasil=(2*3.14*jari)*(jari+tinggi);
        System.out.println("Luas Permukaan Tabung= " + hasil);
    }
    
}
