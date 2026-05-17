import java.util.*;
public class StringWords {
	public static void main(String [] args) {
		String s= "Welcome to Java and Java Script";
		String []s1=s.split(" ");
		
		Set<String> set = new LinkedHashSet<>();
		
		for(int i=0;i<s1.length;i++) {
			
			String v=s1[i];
			
			set.add(v);
			
		
		}String string =String.join(" ", set);
		
		System.out.println(string);
	}

}
