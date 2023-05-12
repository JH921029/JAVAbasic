package day15.api.io.output;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {
	public static void main(String[] args) {
		/*
		 * 1. 파일을 읽는데 사용하는 클래스는 FileInputStream
		 * 2. 생성자 매개변수에 읽을 파일의 경로가 들어갑니다.
		 * 
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
		
		
		try {
			InputStream is = new FileInputStream(path);
			

			//read()는 하나씩 데이터를 일고, 더 읽을 값이 없으면 -1을 반환 해줍니다.
//			System.out.println(is.read());
			
			
			
//			while(true) {
//				int result = is.read();
//				if(result == -1) break;
//				
//				System.out.println((char)result);
//			}
			
			//read(배열)
			byte[] arr = new byte[100];
//			
			int result = is.read(arr);//읽어들인 크기 반환
			System.out.println(result);
			
//			System.out.println(result);
//			System.out.println(Arrays.toString(arr));
			
			int i = 0;
			while(true) {
			
				if(arr[i]==0) {
					break;
				}
				System.out.print((char)arr[i]);
				
				
				i++;
			}
			int result2 = is.read(arr); //더 읽을 값이 없다면 -1반환
			System.out.println(result2);
			
			is.close();
			
		} catch (Exception e) {
		
		}
		
		
	}

}
