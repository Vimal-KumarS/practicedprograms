
public class PalindromeString {
public static void main(String[] args) {
	String s="Malayaam";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		char c=s.charAt(i);
		rev=rev+c;
	}if(s.equalsIgnoreCase(rev)) {
		System.out.println("The string is palindrome");
		
	}else {
		System.out.println("The string not a palindrome");
	}
}
}
