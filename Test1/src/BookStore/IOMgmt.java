package BookStore;

import java.util.List;
import java.util.Scanner;

public class IOMgmt {

	IODAO dao = new IODAO();
	IODTO dto = new IODTO();
	
	Scanner sc = new Scanner(System.in);
	
	public void getIOList() {
		
	
		List<IODTO> list = dao.getIOList();
		
		System.out.println("                  < 입 출 고  리 스 트 >                     ");
		System.out.println("====================================================");
		System.out.println("  입출고 번호          상품 번호	       입출고 재고량     		창고");
		System.out.println("====================================================");
		for(IODTO dto : list)
		{	
			System.out.println(dto);
			
		}
		
		System.out.println("====================================================");
		System.out.println();
	}

	public void insertIOProc() {

		System.out.println("상품 번호를 입력하세요.");
		String pcode = sc.nextLine();
		System.out.println("입출고 수량을 입력하세요.(+ : 입고 , - : 출고)");
		String io_amount = sc.nextLine();
		System.out.println("창고 번호를 입력하세요.");
		String storecode = sc.nextLine();
		
		dto.setPcode(pcode);
		dto.setIo_amount(io_amount);
		dto.setStorecode(storecode);
				
		dao.insertIOProc(dto);
	}
	
	


}
