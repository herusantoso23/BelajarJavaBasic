package belajar.oop.polimorfisme;

public class main {
	public static void main(String[] args){
		hewan h = new hewan();
		h.suara();
		hewan k = new kucing();
		k.suara();
		hewan a = new anjing();
		a.suara();
	}
}