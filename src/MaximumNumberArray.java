
public class MaximumNumberArray {
	public static void main(String[] args) {
		int ar[]=new int[5];
		ar[0]=800;
		ar[1]=200;
		ar[2]=100;
		ar[3]=600;
		ar[4]=500;
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			
		}System.out.println(ar[0]);
	}
}
