//1.Write a program(WAP) to print INEURON using pattern programming logic.

public class AsignmentINEURON {

	public static void main(String[] args) {
		int n=5,m=5;
		//Printing for I
		for(int i=1;i<=n;i++) {
			System.out.println("*");
		}
		System.out.println();
		//Printing for N
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(j==n || j==1 || j==i ) {
					System.out.print("*");
				}else  {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//Printing for E
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i%2!=0 || j==1 ) {
					System.out.print("*");
				}else  {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//Printing for U
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(j==n || j==1 ||  i==5) {
					System.out.print("*");
				}else  {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//Printing for R
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(j==1 || i==3 || i==1 ||(i==4 && j==3) || (i==5 && j==5) || (i==2 && j==5)) {
					System.out.print("*");
				}else  {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//Printing for O
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(j==n || j==1 ||  i==5 || i==1) {
					System.out.print("*");
				}else  {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("");
		//Printing for N
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(j==n || j==1 || j==i ) {
					System.out.print("*");
				}else  {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
