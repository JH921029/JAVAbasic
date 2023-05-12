package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
	public static void main(String[] args) {
		
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test2.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
//			String result = br.readLine();//한줄씩 읽음
//			System.out.println(result);
			
			String result;
			while((result = br.readLine()) != null){
				
				System.out.println(result);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
