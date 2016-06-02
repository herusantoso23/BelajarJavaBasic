package belajar.array;

public class Array2Dimensi {
	public static void main(String[] args){
		//array 2d
		String[][]kotak = new String[][]{
			{"indonesia","jakarta"},
			{"italia","roma"},
			{"prancis","paris"}
		};

		for(int x=0; x<kotak.length; x++){
			for(int y=0; y<kotak[x].length; y++){
				System.out.println("x " + kotak.length + " y " + kotak[x].length);
			};
		};
	}
}
