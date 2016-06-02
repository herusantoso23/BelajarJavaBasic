//belajar super pada konstuktor

package belajar.overriding_super;

class pohon extends tumbuhan{
	int umur;

	public pohon(int umur) {
		super(20);
		this.umur = umur;
		// TODO Auto-generated constructor stub

	}

	void test(){
		System.out.println(super.getUmur());
	}

	public static void main(String[] args){
		pohon p = new pohon(12);
		p.test();
	}

}
