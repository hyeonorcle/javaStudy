package Test01;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MyTest2 {
	
	//¹®Á¦ 2¹ø

	public static void main(String[] args) throws IOException {

		ByteBuffer buf = ByteBuffer.allocate(1024);
		
		Path src = Paths.get("D:\\javaStudy\\sample.txt");
		Path dst = Paths.get("D:\\sample.txt");

		try(FileChannel ifc = FileChannel.open(src,  StandardOpenOption.READ);
				FileChannel ofc = FileChannel.open(dst,  StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {

			int num;
			while(true) {
				num = ifc.read(buf);	

				if(num == -1)
					break;

				buf.flip();		
				ofc.write(buf);	
				buf.clear(); 	
			}

		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}
}