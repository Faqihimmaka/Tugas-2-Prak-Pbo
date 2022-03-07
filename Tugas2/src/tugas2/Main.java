package tugas2;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih,ulang=1;
        double panjang,lebar,tinggib,tinggit,jari;
        do {
            System.out.println("============");
            System.out.println("Menu Untama");
            System.out.println("============");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            pilih=input.nextInt();
            if (pilih==1) {
                System.out.print("Input Panjang : ");
                panjang=input.nextDouble();
                System.out.print("Input Lebar : ");
                lebar=input.nextDouble();
                System.out.print("Input Tinggi : ");
                tinggib=input.nextDouble();
                persegipanjang persegipanjang=new persegipanjang(panjang,lebar);
                balok balok=new balok(panjang,lebar,tinggib);
                persegipanjang.luaspersegi();
                persegipanjang.kelilingpersegi();
                balok.volumebalok();
                balok.luaspermukaanbalok();
            }
            else if (pilih==2) {
                System.out.print("Input Tinggi : ");
                tinggit=input.nextDouble();
                System.out.print("Input Jari-Jari : ");
                jari=input.nextDouble();
                lingkaran lingkaran=new lingkaran(jari);
                tabung tabung=new tabung(jari,tinggit);
                lingkaran.luaslingkaran();
                lingkaran.kelilinglinkaran();
                tabung.volumetabung();
                tabung.luaspermukaantabung();

            }
            else if (pilih==0) {
                ulang = 0;
            }
            if (pilih != 0) {
                System.out.print("Ulang? Ya=1||Tidak=0 : ");
                ulang=input.nextInt();
            }
            
        } while (ulang==1);
                
            
    }
    
}
