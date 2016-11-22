package CarreParfait;

import java.io.IOException;
	 
	public class carreparfait { 

	    public static void main(String[] args) throws IOException {

	        int starting_number = 1;

	        int ending_number = 100;

	        System.out.println("Nombres Parfait entre "+starting_number+ " et "+ending_number);

	        for (int i = starting_number; i <= ending_number; i++) {

	 
	            int number = i;
	 

	            int sqrt = (int) Math.sqrt(number);

	            if (sqrt * sqrt == number) {

	                System.out.println(number+ " = "+sqrt+"*"+sqrt);

	            }

	        }

	    }

	}