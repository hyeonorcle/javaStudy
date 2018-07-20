package BookStore;

import java.util.Scanner;

class BookStoreSwitch {

	Scanner sc = new Scanner(System.in);
	int menu ;
	
	
	public void ProductMenu() {
		
		ProductMgmt mgmt = new ProductMgmt();
		
		while(true ) {
			System.out.println("상품 menu 선택 : 1.전체 상품  조회 2.상품 조회  3.추가  4.수정  5.삭제  6.상위 메뉴로 이동");
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1:
				mgmt.getProdList();
				break;
			case 2:
				mgmt.getProdOneList();
				break;
			case 3:
				mgmt.insertProProc();
				break;
			case 4:
				mgmt.UpdateProProc();
				break;
			case 6:
				return ;
								
			}
		}
	}
	public void IOMenu() {
		
		IOMgmt mgmt = new IOMgmt();
		
		while(true) {
			System.out.println("입출고 menu 선택 : 1.입출고 전체 조회 2.조회 3.추가 4.수정 5.삭제 6.상위 메뉴로 이동");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				mgmt.getIOList();
				break;
			case 2:
				break;
			case 3:
				mgmt.insertIOProc();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				return;
			}
		}
	}
	
	
}