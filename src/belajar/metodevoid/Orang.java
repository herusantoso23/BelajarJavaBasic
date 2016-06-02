package belajar.metodevoid;

public class Orang {
	int tinggi = 180;
	int berat = 60;
	String kulit = "Sawo Matang";

	void berjalan(){
		System.out.println("Orang bisa berjalan");
	}

	public static void main(String [] args){
		Orang udin = new Orang();
		udin.berjalan();
	}
}
