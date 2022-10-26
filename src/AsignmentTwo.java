
public class AsignmentTwo {

	public static void main(String[] args) {
		int n=14;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n || i==1) {
					System.out.print("*");
				} else if((j<=(n/2-i+1) && j>=1) || (j>=(n/2+i-1) && j<=n)) {
					System.out.print("*");
				}else if(i> n/2 && (j== 1 || j==n)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		

	}

}
