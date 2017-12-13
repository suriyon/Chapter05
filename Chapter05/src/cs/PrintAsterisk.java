package cs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintAsterisk {

	public static void main(String[] args) {		
		int row, column;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		try {
			System.out.print("Enter Number of Row: ");
			row = Integer.parseInt(br.readLine());
			System.out.print("Enter Number of Column: ");
			column = Integer.parseInt(br.readLine());
			
			for(int i=1; i<=row; i++) {
				for(int j=1; j<=column; j++) {
					System.out.print(" * ");
				}
				System.out.println();
			}
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
