package BookStore;

import java.util.Scanner;

class BookStoreSwitch {

	Scanner sc = new Scanner(System.in);
	int menu ;
	
	
	public void ProductMenu() {
		
		ProductMgmt mgmt = new ProductMgmt();
		
		while(true ) {
			System.out.println("��ǰ menu ���� : 1.��ü ��ǰ  ��ȸ 2.��ǰ ��ȸ  3.�߰�  4.����  5.����  6.���� �޴��� �̵�");
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
			System.out.println("����� menu ���� : 1.����� ��ü ��ȸ 2.��ȸ 3.�߰� 4.���� 5.���� 6.���� �޴��� �̵�");
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