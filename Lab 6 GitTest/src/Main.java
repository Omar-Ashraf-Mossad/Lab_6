import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.print("Please Enter Your Number: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		String result = isPrime(n)?"prime":"not prime";
		System.out.println("Your number is "+ result);
		

	}
	
	public static boolean isPrime(int n) {
		for(int i=2;i*i<n;i++) {
			if(n%i==0)
				return false;
		}
		return n>1;
	}

}
