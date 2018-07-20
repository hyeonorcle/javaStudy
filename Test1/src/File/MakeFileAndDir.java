package File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MakeFileAndDir {

	public static void main(String[] args) throws IOException {
		Path fp = Paths.get("C:\\Users\\User\\git\\javaStudy\\Test1\\empty.txt");
		fp = Files.createFile(fp);	//颇老 积己
		
		Path dp1 = Paths.get("C:\\Users\\User\\git\\javaStudy\\Test1\\Empty");
		dp1 = Files.createDirectory(dp1);	// 叼泛配府 积己
		
		Path dp2 = Paths.get("C:\\Users\\User\\git\\javaStudy\\Test2\\Empty");
		dp2 = Files.createDirectories(dp2);	// 版肺狼 葛电 叼泛配府 积己
		
		System.out.println("Files : " + fp);
		System.out.println("Files : " + dp1);
		System.out.println("Files : " + dp2);
	}

}
