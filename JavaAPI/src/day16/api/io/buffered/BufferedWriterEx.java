package day16.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterEx {
	public static void main(String[] args) {
		/*
		 * Buffered가 붙으면 입출력을 빠르게 하는 성능향상 스트림 (보조)
		 * 
		 * 보조스트림이라 부르고 Reader, Writer, InputStream, OutputStream
		 * 과 같이 사용됩니다.
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test.txt";
		
		
//		Writer fw = new FileWriter(path);
//		BufferdWriter bw = new BufferedWriter(fw);
		
		//writer 객체 두번째 매개변수에 true를 주면, 기존파일에 추가합니다.
		
		
		try(BufferedWriter bw = new BufferedWriter (new FileWriter(path, true))) { //패스 옆에 트루때문에 문자열을 이어서 쓸수있다
		
			String str = "오늘은 날씨가 맑습니다.\n내일은 쉽니다.";
			bw.write(str);
			
		} catch (Exception e) {

		
		}
	
	}
	
}
