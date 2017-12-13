package cs;

public class SummationWhile {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i<=10){
			sum = sum+i;
			i++;
		}
		System.out.println("Increment\nSummation 1-10 : " +sum);
		
		sum = 0;
		i = 10;
		while(i>0) {
			sum = sum+i;
			i--;
		}
		System.out.println("Decrement\nSummation 10-1 : " +sum);
	}

}
