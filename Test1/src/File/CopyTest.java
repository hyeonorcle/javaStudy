package File;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

class CopyTest {
	
	public void extCopy(String s, String d) throws IOException {
		ByteBuffer buf = ByteBuffer.allocate(2048);
		Path src = Paths.get(s);
		Path dst = Paths.get(d);
		
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
		
//		Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("복사 완료.");
		
	}
	

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("대상 파일 : ");
		String src = sc.nextLine();
		
		System.out.print("사본 이름 : ");
		String dst = sc.nextLine();
		
		CopyTest ct = new CopyTest();
		
		ct.extCopy(src, dst);

	}

}
