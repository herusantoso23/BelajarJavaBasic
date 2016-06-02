package belajar.parameterpadametode;

public class Orang {
	public static void main (String [] args){
		Orang udin = new Orang();
		udin.berjalan("prok prok", 25);
	}

	void berjalan(String suara, int angka){
		System.out.println("berjalan " + suara + " " + angka);
	}
}
