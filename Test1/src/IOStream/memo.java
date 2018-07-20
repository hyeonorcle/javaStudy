package IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class memo {

	public static void main(String[] args) throws IOException {

		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream("D:\\javaStudy\\memo.txt"));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("D:memo2.txt"))) {
			int data;
			
			while(true) {
				data = in.read();
				if(data == -1)
					break;
				
				out.write(data);
			
			}
			System.out.println("복사완료.");
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
