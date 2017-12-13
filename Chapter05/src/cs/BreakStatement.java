package cs;

public class BreakStatement {

	public static void main(String[] args) {
		int sum = 0, i = 1;
		while(i<=5) {
			if(i==4)
				break;
			sum += i;
			i++;
		}
		System.out.println("Summation : " + sum);
	}
}
