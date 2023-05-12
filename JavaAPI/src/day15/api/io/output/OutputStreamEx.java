package day15.api.io.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		
		/*
		 *1. 파일 쓸때 사용하는 클래스는 FileOutputStream입니다.
		 *2. 생성자 매개값으로 파일을 쓸 경로가 돌어갑니다.
		 *3. io패키지의 거의 모든 클래스들은 생성자에 throws가 있기때문에
		 *  반드시 예외처리 문장안에서 사용합니다.
		 * 
		 * 
		 */
		String path ="C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
	
//		FileOutputStream out = new FileOutputStream(path);
		try {
			OutputStream out = new FileOutputStream(path);
			
//			out.write(65);   한글자씩 씀
//			out.write(66);
//			out.write(67);
			
			
//			byte[] arr = {65,66,67,68,69};  배열에 들어있는 데이터를 한번에 씀
//			out.write(arr);
			
			
			String str = "abcdefghi";     //한글은 1바이트로 표현할수없어서 한글은 못씁니다.
			byte[] arr = str.getBytes();  //문자열을 바이트배열로 바꿔줌
			out.write(arr);
			out.close();

			
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	
	
	
	}

}
