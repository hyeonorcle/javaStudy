package IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriterReader {

	public static void main(String[] args) {
		String ks = "���ο� �־ ���� �� �ʿ��� ���� �ƴϴ�.";
		String es = "Life is long if you know how to use it.";

		try(BufferedWriter bw =
				new BufferedWriter(new FileWriter("String1.txt"))) {
			bw.write(ks, 0, ks.length());
			bw.newLine();	// �� �ٲ� ���ڸ� ���� 
			bw.write(es, 0, es.length());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader("String1.txt"))) {
			String str;
			while(true) {
				str = br.readLine(); 		// �� ���� �о� ���̱�
				if(str == null)
					break;
				System.out.println(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
