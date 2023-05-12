package quiz22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz03 {

	public static void main(String[] args) {

		/*
		 * 1. 버퍼리더를 사용해서 건담.txt파일을 읽어들입니다.
		 * 2. readline으로 한줄씩 읽어줍니다.
		 * 3. 정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 정규표현식으로 패턴분석
		 *  Product객체에 저장하고, 리스트에 저장
		 *  
		 * 4. 외부 라이브러리(POI)-자바에서 액셀 파일형태로 쓸수 있도록 하는 기능
		 *   하나의 시트에 가 행데이터를 엑셀파일로 출력
		 * 
		 * 
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.txt";

		String day = null;
		String store = null;
		String grade = null;
		String detail = null;
		String price = null;

		Product product = new Product(day, store, grade, detail, price);
		
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {

			String str;

			while((str = br.readLine()) != null) {

				System.out.println(str);

				day = "\\d{8}-\\d{2}-\\[0-9]+";

			}

		} catch (Exception e) {

			e.printStackTrace();
		}


	}
}
