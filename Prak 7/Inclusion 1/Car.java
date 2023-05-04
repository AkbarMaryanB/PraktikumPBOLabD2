/**
 * File      : Car.java 04/05/23
 * Penulis : Akbar Maryan Bagaskara
 * Deskripsi : Class untuk Car
 * 
 */

public class Car extends Vehicle{
	void calRent(int jarak, float harga){ 
		float fare=jarak*harga;
		fare=fare-1000.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}

