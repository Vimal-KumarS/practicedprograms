
public class CheckPalindromeNumber {
public static void main(String[] args) {
	int num=123431;
 int temp=num;
	int rev=0;
	while(num>0) {
		int n=num%10;
		rev=(rev*10)+n;
		num=num/10;
	}if(rev==temp) {
		System.out.println("The number is palindrome");
	}else {
		System.out.println("The number is not a palindrome");
	}
}
}
