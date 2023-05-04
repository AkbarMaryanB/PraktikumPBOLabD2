/**
 * File      : Vehicle.java 04/05/23
 * Penulis : Akbar Maryan Bagaskara
 * Deskripsi : class sebagai superclass dari Car dan Bus
 *
 */

public class Vehicle {
	void calRent(int distance,float price){
		float fare=distance* price;
		System.out.println("vehicle price = "+fare);
	}
}
