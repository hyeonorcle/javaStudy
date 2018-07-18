package Test;

public class arr90 {

	public static void main(String[] args) {

		int arr[][] = new int[5][5];
		int a = 0;

		for(int i = 0; i<5; i++) {
			for(int j =0; j<5; j++) {
				arr[i][j] = a++;
			}
		}
		for(int i = 0; i<5; i++) {
			for(int j =0; j<5; j++) {
				System.out.print(arr[i][j]+ " \t");
				if(j==4)
					System.out.println();
			}
		}

		System.out.println("---------------------------------------");
		System.out.println("<90도회전 배열>");

		a = 0;

		for(int j= 0; j<5; j++) {
			for(int i=4 ;i>-1;i-- ) {
				arr[i][j] = a++;
			}
		}

		for(int i = 0; i<5; i++) {
			for(int j =0; j<5; j++) {
				System.out.print(arr[i][j]+ " \t");
				if(j==4)
					System.out.println();
			}
		}
		System.out.println("---------------------------------------");
		a = 0;
		for(int i= 0; i<5; i++) {
			for(int j=0 ;j<5;j++ ) {
				arr[4-j][i] = a++;
			}
		}

		for(int i = 0; i<5; i++) {
			for(int j =0; j<5; j++) {
				System.out.print(arr[i][j]+ " \t");
				if(j==4)
					System.out.println();
			}
		}
	}

}
