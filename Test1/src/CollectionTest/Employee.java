package CollectionTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		EmployeeMgmt mgmt = new EmployeeMgmt();
		Scanner sc = new Scanner(System.in);

		int menu;
		while(true) {
			System.out.println("menu �����ϼ���. 1:��ü��ȸ(����), 2:�ܰ���ȸ , 3:�Է� ,4:����, 5:��ü��ȸ(map), 6:����");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				//��ü����Ʈ
				mgmt.empListProc();
				break;
			case 2: 
				//�ܰ���ȸ 
				mgmt.empDTOProc();
				break;
			case 3:
				//insert
				mgmt.insertEmpProc();
				break;
			case 4:
				//update
				mgmt.updateEmpProc();
				break;
			case 5:
				mgmt.empListMap();
				break;
			case 6:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);

			}//end of switch

			
			
			
			//		EmployeeDAO dao = new EmployeeDAO();
			//		
			//		EmployeeDTO dto = dao.getEmpDTO("113");
			//		System.out.println(dto);

			//		List<EmployeeDTO> list = dao.getEmpList();
			//		
			//		for(EmployeeDTO dto : list )
			//			System.out.println(dto);
		}
	}

}//end of main
