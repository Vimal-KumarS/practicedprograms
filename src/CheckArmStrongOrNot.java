
public class CheckArmStrongOrNot {
public static void main(String[] args) {
	int num=173;
	int temp=num;
	int arm=0;
	
	while(num>0) {
		int n=num%10;
		arm=arm+(n*n*n);
		num=num/10;
		
		}if(arm==temp) {
			System.out.println("The number is armstrong");
		}else {
			System.out.println("The number is not a armstrong");
		}
}
}
