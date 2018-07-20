package File;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class FileCopierVerNIO {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ���� : ");
		Path src = Paths.get(sc.nextLine());
		
		System.out.print("�纻 �̸� : ");
		Path dst = Paths.get(sc.nextLine());
		
		//�ϳ��� ���� ����
		ByteBuffer buf = ByteBuffer.allocate(1024);
		
		// try���� �� ���� ä�� ����
		try(FileChannel ifc = FileChannel.open(src,  StandardOpenOption.READ);
				FileChannel ofc = FileChannel.open(dst,  StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
			Instant start = Instant.now();
			int num;
			while(true) {
				num = ifc.read(buf);		// ä�� ifc ���� ���۷� �о����
				if(num == -1)	// �о� ���� �����Ͱ� ���ٸ�
					break;
				
				buf.flip();		//  ��� ��ȯ!
				ofc.write(buf);	// ���ۿ��� ä�� ofc �� ������ ����
				buf.clear(); 	// ���� �����
			}
			Instant end = Instant.now();
			System.out.println(Duration.between(start, end).toMillis());
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
