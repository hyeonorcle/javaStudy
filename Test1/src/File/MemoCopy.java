package File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MemoCopy {

	public static void main(String[] args) throws IOException {
		Path src = Paths.get("C:\\Users\\User\\git\\javaStudy\\Test1\\memo.txt");
		Path dst = Paths.get("C:\\Users\\User\\git\\javaStudy\\Test1\\memo3.txt");
		
		//src가 지시하는 파일을 dst가 지시하는 위치와 이름으로 복사
		Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
		}

}


