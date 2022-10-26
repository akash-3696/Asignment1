
public class AsignmentFour {

	public static void main(String[] args) {
		int n=14;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n || i==n-1) {
					System.out.print("*");
				}else if(i<n/2) {
					System.out.print(" ");
				}else if((j<=(i-(n/2)+1) && j>=1) || (j>=(n+((n/2)-i)) && j<=n)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
