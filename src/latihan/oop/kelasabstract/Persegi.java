package latihan.oop.kelasabstract;

public class Persegi extends BangunDatar {
	int sisi;

	public Persegi (int s) {
		this.sisi = s;
	}

	@Override
	public int hitungKeliling() {
		// TODO Auto-generated method stub
		int keliling = 4 * sisi;
		return keliling;
	}

	@Override
	public int hitungLuas() {
		// TODO Auto-generated method stub
		int luas = sisi * sisi;
		return luas;
	}



	public static void main(String[]args) {
		Persegi p = new Persegi(10);
		int luas = p.hitungLuas();
		System.out.println("Luas nya adalah " + luas);

		int keliling = p.hitungKeliling();
				System.out.println("Keliling nya adalah " + keliling);
	}
}
