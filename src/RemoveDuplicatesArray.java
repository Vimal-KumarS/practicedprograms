import java.util.Set;
import java.util.LinkedHashSet;
public class RemoveDuplicatesArray {
public static void main(String[] args) {
	int ar[]=new int[10];
	ar[0]=10;
	ar[1]=10;
	ar[2]=10;
	ar[3]=10;
	ar[4]=10;
	ar[5]=10;
	ar[6]=10;
	ar[7]=10;
	ar[8]=10;
	ar[9]=10;
	
	Set<Integer> s= new LinkedHashSet<Integer>();
for(int i=0;i<ar.length;i++) {
	s.add(ar[i]);
}for(Integer b:s) {
	System.out.println(b);
}
	
}
}
