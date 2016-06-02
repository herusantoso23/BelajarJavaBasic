package belajar.overriding_super;

class herbivora extends binatang{
	/*overriding = teknik dengan data dan metode denagn nama yang sama, maka otomatis akan menjalankan apa yang ada dalam kelasnya sendiri
	 *System.out.println(h.umur);
	 * */
	int umur = 18;

	//kata super digunakan untuk mengambil umur dari kelas utama

	int getUmur(){
		return super.umur;
	}

	public static void main(String[] args){
		herbivora h = new herbivora();
		System.out.println(h.getUmur());
	}
}