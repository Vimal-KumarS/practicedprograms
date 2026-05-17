import java.util.LinkedHashMap;
import java.util.Map;

public class Starprogram {
public static void main(String [] args) {
	
     String s = "Selenium";
     
     char[]c = s.toCharArray();
     
     Map<Character,Integer> mp =new LinkedHashMap<>();
     
     for(int i=0; i<c.length;i++) {
    	 
    	 char ch = c[i];
    	 
    	 if(mp.containsKey(ch)){
    		 
    		 Integer integer = mp.get(ch);
    		 
    		 mp.put(ch, integer+1);
    	 }else {
    		 mp.put(ch,1);
    	 }
    	 
     }
     System.out.println(mp);
}


}
