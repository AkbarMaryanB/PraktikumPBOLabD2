 /**
 * MLingkaran.java 04/05/23
 * Penulis : Akbar Maryan Bagaskara
 * Deskripsi : Main untuk mengexecute lingkaran
 * 
 */ 
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang jari-jari lingkaran : ");
        double jari_jari = scan.nextDouble();
        Lingkaran lr = new Lingkaran(jari_jari);
        System.out.println("Luas lingkaran dengan jari-jari "+ jari_jari + "\nSatuannya adalah : "+ lr.hitungLuas());
    }
}