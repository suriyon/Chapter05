package cs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummationAToB {

	public static void main(String[] args) {
		int sum = 0;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		
		try {
			System.out.print("Enter First Integer: ");
			int a = Integer.parseInt(br.readLine());
			System.out.print("Enter Second Integer: ");
			int b = Integer.parseInt(br.readLine());
			if(a>b) {
				int tmp = a;
				a = b;
				b = tmp;
			}
			for(int i=a;i<=b;i++) {
				sum = sum+i;
			}
			System.out.println("Summation " + a + " to " + b + " : " + sum);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
