package algorythm_quiz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sumCost = in.nextInt();
		int purItems = in.nextInt();
		int cost = 0;
		int num = 0;
		int temp = 0;
		
		for(int i=0; i<purItems; i++) {
			cost = in.nextInt();
			num = in.nextInt();
			temp += cost*num;
		}
		
		if(sumCost == temp) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
