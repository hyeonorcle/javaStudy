package BookStore;

import java.util.List;
import java.util.Scanner;

public class ProductMgmt {

	ProductDTO dto = new ProductDTO();
	ProductDAO dao = new ProductDAO();

	Scanner sc = new Scanner(System.in);


	public void insertProProc() {

		System.out.println("��ǰ ��ȣ�� �Է��ϼ���.");
		String pcode = sc.nextLine();
		System.out.println("��ǰ ���� �Է��ϼ���.");
		String pname = sc.nextLine();
		System.out.println("��ǰ ������ �Է��ϼ���.");
		String pcontent = sc.nextLine();
		System.out.println("��������� �Է��ϼ���.");
		String bstock = sc.nextLine();

		dto.setPcode(pcode);
		dto.setPname(pname);
		dto.setPcontent(pcontent);
		dto.setBstock(bstock);

		dao.insertProProc(dto);
	}

	public void getProdList() {


		List<ProductDTO> list = dao.getProdList();

		System.out.println("                < �� ǰ  �� �� Ʈ >                     ");
		System.out.println("==================================================");
		System.out.println("  ��ǰ ��ȣ          ��ǰ ��	      	��ǰ ����     	���� ���");
		System.out.println("==================================================");
		for(ProductDTO dto : list)
		{	
			System.out.println(dto);

		}

		System.out.println("==================================================");
		System.out.println();
	}
	public void getProdOneList() {

		System.out.print("��ȸ�� ��ǰ ��ȣ�� �Է��ϼ��� : ");
		String pcode = sc.nextLine();

		ProductDTO dto = dao.getProdOneList(pcode);

		System.out.println("                < �� ǰ  �� �� Ʈ >                     ");
		System.out.println("==================================================");
		System.out.println("  ��ǰ ��ȣ          ��ǰ ��	      	��ǰ ����     	���� ���");
		System.out.println("==================================================");
		System.out.println(dto);

		System.out.println("==================================================");
		System.out.println();
	}

	public void UpdateProProc() {

		getProdList();

		System.out.print("������ ��ǰ ��ȣ�� �Է��ϼ��� : ");
		String pcode = sc.nextLine();

		System.out.println("���ο� ��ǰ ���� �Է��ϼ���.");
		String pname = sc.nextLine();
		System.out.println("���ο� ��ǰ ������ �Է��ϼ���.");
		String pcontent = sc.nextLine();
		System.out.println("��������� �Է��ϼ���.");
		String bstock = sc.nextLine();

		dto.setPcode(pcode);
		dto.setPname(pname);
		dto.setPcontent(pcontent);
		dto.setBstock(bstock);
		
		dao.UpdateProProc(dto);

	}

}
