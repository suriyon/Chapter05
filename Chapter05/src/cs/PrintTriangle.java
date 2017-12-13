package cs;

public class PrintTriangle {

	public static void main(String[] args) {
		System.out.println("Rectangle");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("Triangle Type One");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("Triangle Type Two");
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("Triangle Type Three");
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=5; j++) {
				if(j>=i)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println("Triangle Type Four");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<i)
					System.out.print("   ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
