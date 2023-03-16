/**
 * File : Segitiga.java 15/03/23
 * Penulis : Akbar Maryan Bagaskara
 * Deskripsi : kelas yang berisi program untuk membuat class segitiga beserta methodnya
 * 
 */ 

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
	private double alas,tinggi;
	
	public Segitiga(double alas,double tinggi,int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return alas * tinggi / 2;
	}
	
	public void printInfo(){
		System.out.println("Bangun Segitiga bersisi "+this.getJumlahSisi());
		
	}
	
}