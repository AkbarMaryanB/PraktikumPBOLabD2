/**
 * File : MPoligon.java 15/03/23
 * Penulis : Akbar Maryan Bagaskara
 * Deskripsi : kelas yang berisi program untuk menjalankan kelas PersegiPanjang dan Segitiga.
 * 
 */ 

package org.main;

import org.bangundatar.*;

//public class MPoligon{
//	public static void main(String[] args){
//		PersegiPanjang persegi = new PersegiPanjang(20,20,4);
//		persegi.printInfo();
//		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
//	}
//}

public class MPoligon{
	public static void main(String[] args){
		Segitiga segitiga = new Segitiga(10,5,3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
	}
}