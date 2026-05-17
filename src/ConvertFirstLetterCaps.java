
public class ConvertFirstLetterCaps {
public static void main(String[] args) {
	String s="welcome to java class today";
	String s1="";
	String s2[]=s.split(" ");
	
	for(String s3:s2) {
		char []ch=s3.toCharArray();
		
			char c=ch[0];
			char a=Character.toUpperCase(c);
			String b = s3.substring(1);
			s1=s1+a+b+" ";
	}
	System.out.println(s1);
}
}
