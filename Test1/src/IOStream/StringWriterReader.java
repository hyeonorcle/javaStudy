package IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriterReader {

	public static void main(String[] args) {
		String ks = "공부에 있어서 돈이 꼭 필요한 것은 아니다.";
		String es = "Life is long if you know how to use it.";

		try(BufferedWriter bw =
				new BufferedWriter(new FileWriter("String1.txt"))) {
			bw.write(ks, 0, ks.length());
			bw.newLine();	// 줄 바꿈 문자를 삽입 
			bw.write(es, 0, es.length());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader("String1.txt"))) {
			String str;
			while(true) {
				str = br.readLine(); 		// 한 문장 읽어 들이기
				if(str == null)
					break;
				System.out.println(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
