package belajar.oop.encapsulation;

public class main {
	public static void main(String[] args){
		hewan h = new hewan();
		h.setTinggi(120);
		h.setWarna("hitam");
		System.out.println("tinggi " + h.getTinggi() + " warna " + h.getWarna());
	}
}
