package BookStore;

import java.util.List;
import java.util.Scanner;

public class ProductMgmt {

	ProductDTO dto = new ProductDTO();
	ProductDAO dao = new ProductDAO();

	Scanner sc = new Scanner(System.in);


	public void insertProProc() {

		System.out.println("상품 번호를 입력하세요.");
		String pcode = sc.nextLine();
		System.out.println("상품 명을 입력하세요.");
		String pname = sc.nextLine();
		System.out.println("상품 설명을 입력하세요.");
		String pcontent = sc.nextLine();
		System.out.println("기초재고량을 입력하세요.");
		String bstock = sc.nextLine();

		dto.setPcode(pcode);
		dto.setPname(pname);
		dto.setPcontent(pcontent);
		dto.setBstock(bstock);

		dao.insertProProc(dto);
	}

	public void getProdList() {


		List<ProductDTO> list = dao.getProdList();

		System.out.println("                < 상 품  리 스 트 >                     ");
		System.out.println("==================================================");
		System.out.println("  상품 번호          상품 명	      	상품 설명     	기초 재고");
		System.out.println("==================================================");
		for(ProductDTO dto : list)
		{	
			System.out.println(dto);

		}

		System.out.println("==================================================");
		System.out.println();
	}
	public void getProdOneList() {

		System.out.print("조회할 상품 번호를 입력하세요 : ");
		String pcode = sc.nextLine();

		ProductDTO dto = dao.getProdOneList(pcode);

		System.out.println("                < 상 품  리 스 트 >                     ");
		System.out.println("==================================================");
		System.out.println("  상품 번호          상품 명	      	상품 설명     	기초 재고");
		System.out.println("==================================================");
		System.out.println(dto);

		System.out.println("==================================================");
		System.out.println();
	}

	public void UpdateProProc() {

		getProdList();

		System.out.print("수정할 상품 번호를 입력하세요 : ");
		String pcode = sc.nextLine();

		System.out.println("새로운 상품 명을 입력하세요.");
		String pname = sc.nextLine();
		System.out.println("새로운 상품 설명을 입력하세요.");
		String pcontent = sc.nextLine();
		System.out.println("기초재고량을 입력하세요.");
		String bstock = sc.nextLine();

		dto.setPcode(pcode);
		dto.setPname(pname);
		dto.setPcontent(pcontent);
		dto.setBstock(bstock);
		
		dao.UpdateProProc(dto);

	}

}
