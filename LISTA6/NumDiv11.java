package lista6;

import java.util.Scanner;

public class NumDiv11 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int  i = 1000, cont = 0;

		while (cont <= 4) {
			
			i++;
			if ((i % 11) == 5) {
				
				cont++;

			}
			
		}

		System.out.printf("%d\n", i);
		num.close();
	}

}
