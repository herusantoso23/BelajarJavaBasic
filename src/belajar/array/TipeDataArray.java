package belajar.array;

public class TipeDataArray {
	public static void main(String[] args){

		//1.Contoh penulisan array
		int[] kotak = new int[3];
		kotak[0] = 100;
		kotak[1] = 200;
		kotak[2] = 300;
		System.out.println(kotak[0] +"\n");


		//lihat tutorial looping
		for(int i=0; i<3; i++){
			System.out.println(kotak[i]);
		}

		//2.Contoh penulisan array
		int[] kotak2 = {1, 2, 3};

		System.out.println("\n" + kotak2[0] + "\n");
		for(int a = 0; a < 3; a++){
			System.out.println(kotak2[a]);
		}



	}
}
