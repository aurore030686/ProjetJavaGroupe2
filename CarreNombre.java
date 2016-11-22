package Methodo;

import java.util.ArrayList;

public class CarreNombre {

	public static ArrayList<Integer> listResult = new ArrayList<>();
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			if (isPremier(i)) {
				listResult.add(i);
			}
		}
		
		for (Integer integer : listResult) {
			System.out.println(integer);
		}
	}

	public static boolean isPremier(int n) {
		boolean isPremier = true;
		if (n < 0) {
			isPremier = false;
		} else if (n != 0 && n != 1) {
			for (int i = 2; i <= n / 2; i++) {
				if (n != i && n % i == 0) {
					isPremier = false;
					break;
				}
			}
		}
		return isPremier;
	}
}