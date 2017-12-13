package cs;

public class SummationFor {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum = sum+i;
			//System.out.println("i = " + i + " sum = " + sum);
		}
		System.out.println("Increment\nSummation 1-10 : " + sum);
		
		sum = 0;
		int i=10;
		for(;i>0;) {
			sum = sum+i;
			i--;
			//System.out.println("i = " + i + " sum = " + sum);
		}
		System.out.println("Decrement\nSummation 10-1 : " + sum);
	}

}
