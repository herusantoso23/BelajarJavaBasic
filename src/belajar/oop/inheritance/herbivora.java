package belajar.oop.inheritance;

class herbivora extends binatang{
	public static void main(String[] args){
		herbivora h = new herbivora();
		h.setUmur(20);
		System.out.println(h.getUmur());
	}
}

/*Inherintance adalah konsep dimana kita bisa mewariskan suatu kelas pada kelas baru, dan kelas baru bisa mengakses metode-metode dan  objek objek pada kelas utama
 * */