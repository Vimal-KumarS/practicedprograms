
public class CheckTheNumberPrimeOrNot {
public static void main(String[] args) {
	int a=11;
	int count=0;
	for(int i=2;i<=a/2;i++) {
		
		if(a%i==0) {
			count++;
		}
	}if(count==0) {
		System.out.println("The number is prime");
	}else {
		System.out.println("The number is not a prime");
	}
}
}
