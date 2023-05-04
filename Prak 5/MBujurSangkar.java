/**
 * MBujurSangkar.java 04/05/23
 * Penulis : Akbar Maryan Bagaskara
 * Deskripsi : kelas yang mengimplementasikan cara menghitung 
               luas bujur sangkar
 * 
 */ 
 import java.util.Scanner;
 
 class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukkan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+ "\nSatuannya adalah "+bs.hitungLuas(sisi));
	}
 }
 
 
 