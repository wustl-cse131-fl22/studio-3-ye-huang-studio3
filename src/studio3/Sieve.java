package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter number of n:");
		int n = in.nextInt();
		int primes = 0;
		for (int i = 2; i<=n; i++) {
			boolean flag = false;
			for (int j = 2; j<i; j++) {
				if (i%j == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				primes ++;
				System.out.println(i);
			}
		}
		System.out.println("The total number of primes is:"+primes);
	}

}
