import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.LinkedHashSet;
public class PrintVowelValuesString {
public static void main(String[] args) {
	String s="Hai this is Vimal kumar";
	char[]ch=s.toCharArray();
	
	Map<Character,Integer> mp= new TreeMap<Character,Integer>();
	for(int i=0;i<ch.length;i++) {
		char c=ch[i];
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			if(mp.containsKey(c)) {
				int inte=mp.get(ch[i]);
				mp.put(c, inte+1);
			}else {
				mp.put(c, 1);
			}
				
			}
		
		}
	Set<Entry<Character,Integer> > entry= mp.entrySet();
	for(Entry<Character,Integer> entryset: entry) {
System.out.println(entryset);
		
	}
}
}
