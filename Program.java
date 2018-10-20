package hz;

import java.util.Scanner;

public class Program {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int m = scan.nextInt();
			int[][] x = new int[n][m];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					x[i][j] = scan.nextInt();
				}
			}

			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
			}
		}
	
}

