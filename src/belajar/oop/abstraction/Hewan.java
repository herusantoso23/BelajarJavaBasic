package belajar.oop.abstraction;

public class Hewan extends MakhlukHidup{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakhlukHidup h = new Hewan();
		h.tidur();
	}

	@Override
	void tidur() {
		// TODO Auto-generated method stub
		System.out.println("Makhluk hidup membutuhkan tidur");
	}

	/*	1. Kelas abstrak adalah kelas yang  mengandung satu metode abstrak atau lebih
	 *	2. Digunakan untuk mendaklarasikan beberapa metode tanpa ada implementasinyalangsung*/
}
