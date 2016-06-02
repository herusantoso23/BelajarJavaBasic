package belajar.staticc;

public class Orang {
	static int tinggi;
	String nama;

	public static void main(String[] args){
		tinggi = 200;
		System.out.println(getTinggi());
	}

	static int getTinggi(){
		return tinggi;
	}

	// static = sifat yang  bisa diberikan kepada metode atau data, yang gunanya kita tidak perlu membuat objek terlebih dahulu sebelum memanggil sautu data atau metode
	// kelemahan : hanya bisa diduganakan pada metode yang static
}
