package BookStore;

import java.util.Scanner;

public class BookStoreMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BookStoreSwitch bss = new BookStoreSwitch();
		
		while(true) {
			System.out.println("menu 선택 : 1.상품  2.입출고  3.재고  4.창고" );
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 : 
				bss.ProductMenu();
				break;
			case 2 :
				bss.IOMenu();
				break;
			case 3 :
				break;
			case 4 :
				break;
				
			}
			
		}
		

		

	}

}
