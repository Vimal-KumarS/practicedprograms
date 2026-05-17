import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class UniqueCharectersPresent {
public static void main(String []args) {
	
	String s="javascriptj65";
	char []ch=s.toCharArray();
	Map<Character,Integer> mp= new LinkedHashMap();
	for(int i=0;i<=ch.length-1;i++) {
		char c=ch[i];
			if(mp.containsKey(c)) {
				int inte=mp.get(c);
				mp.put(c, inte+1);
			}else {
				mp.put(c, 1);
			}
//		Set<Entry<Character,Integer>> entryset = mp.entrySet();
//		for(Entry<Character,Integer> entry: entryset) {
//			System.out.println(entry);
//		}
	}
	
	System.out.println(mp);
}
}
