
public class ReverseEachWordString {
public static void main(String[] args) {
	String s="welcome to java class today";
	String rev="";
	String s1[]=s.split(" ");
	for(String s2:s1) {
		String s3="";
		for(int i=s2.length()-1;i>=0;i--) {
		
			char c=s2.charAt(i);
			s3=s3+c;
		}rev=rev+s3+" ";
	}System.out.println(rev);
	
}
}
