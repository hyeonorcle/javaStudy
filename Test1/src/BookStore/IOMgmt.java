package BookStore;

import java.util.List;
import java.util.Scanner;

public class IOMgmt {

	IODAO dao = new IODAO();
	IODTO dto = new IODTO();
	
	Scanner sc = new Scanner(System.in);
	
	public void getIOList() {
		
	
		List<IODTO> list = dao.getIOList();
		
		System.out.println("                     		       < �� ü �� �� Ʈ >                                                ");
		System.out.println("�ޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡ�");
		System.out.println(" Iocode	Pcode	Io_amount	Storecode");
		System.out.println("�ޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡ�");
		for(IODTO dto : list)
		{	
			System.out.println(dto);
			System.out.println("---------------------------------------------------------------------------------------------");
		}
		
		System.out.println("�ޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡ�");
		System.out.println();
	}

	public void insertIOProc() {

		System.out.println("��ǰ ��ȣ�� �Է��ϼ���.");
		String pcode = sc.nextLine();
		System.out.println("����� ������ �Է��ϼ���.(+ : �԰� , - : ���)");
		String io_amount = sc.nextLine();
		System.out.println("â�� ��ȣ�� �Է��ϼ���.");
		String storecode = sc.nextLine();
		
		dto.setPcode(pcode);
		dto.setIo_amount(io_amount);
		dto.setStorecode(storecode);
				
		dao.insertIOProc(dto);
	}
	
	


}
