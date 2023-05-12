package quiz20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1.스캐너를 통해서 파일명을 입력 받습니다.
		 * 2.입력받은 파일을 filecopy로 복사해서 옮겨주면 됩니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String readpath = "C:\\Users\\user\\Desktop\\course\\java\\file\\file\\"+str;
		String writepath = "C:\\Users\\user\\Desktop\\course\\java\\file\\filecopy\\"+str;
		
		
		try (InputStream in = new FileInputStream(readpath);
			OutputStream out = new FileOutputStream(writepath)){
			
			byte[] arr = new byte[1024];
			int result;
			while((result = in.read(arr)) != -1) {
				out.write(arr, 0, result);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
				
			
	}
}
