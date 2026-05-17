import java.util.LinkedHashMap;
import java.util.Map;

public class ProgramTest {
 public static void main(String[] args) {
	 String s="Nisha surya kumar Nisha Test";
	 String[] split = s.split(" "); 
	 for(int i=0; i<split.length; i++)
	 {
		 
		 for(int j=i+1; i<split.length; j++)
		 {
			if(split[i]==split[j]) {
				String str="";
				split[j]=str;
			}
		 }
	 }
	 System.out.println("After the removal of duplicates");
	 for(int i=0; i<split.length; i++)
	 {
		 System.out.println(split[i]);
	 }
}
}
