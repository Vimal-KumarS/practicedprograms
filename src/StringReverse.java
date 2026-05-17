
public class StringReverse {
public static void main(String[] arg) {
	String s = "welcome to java class";
	String output="";
	String s2[]=s.split(" ");
	for(int i=s2.length-1;i>=0;i--) {
		output=output+s2[i]+" ";
	}
	System.out.println(output);
}
}
