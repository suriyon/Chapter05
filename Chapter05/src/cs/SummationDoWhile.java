package cs;

public class SummationDoWhile {

	public static void main(String[] args) {
		int i=1, sum=0;
		do {
			sum = sum+i;
			i++;
		}while(i<=10);
		System.out.println("Increment\nSummation 1-10 : " + sum);
		
		i=10;
		sum=0;
		do {
			sum = sum+i;
			i--;
		}while(i>0);
		System.out.println("Decrement\nSummation 10-1 : " + sum);
	}
}
