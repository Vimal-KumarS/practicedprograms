
public class CountTheNumberOfDigits {
public static void main(String[] args) {
	int a=2454326;
	int count=0;
	while(a>0) {
		int n=a%10;
		count++;
		a=a/10;
	}System.out.println(count);
}
}
