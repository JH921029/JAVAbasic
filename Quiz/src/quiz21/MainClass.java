package quiz21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		//지역명, 규모구분, 연도, 분양가격 -> 1행 x 4800개
		/*
		 * 1. 버퍼리더 이용해서 한줄씩 읽습니다.
		 * 2. split(",", 5)를 사용해서 data객체에 한줄 단위로 저장을 하고
		 * 3. Data객체를 List<Data>에 하나씩 추가를 합니다.
		 * 
		 * 4. 람다식을 이용해서 (지역 : 서울, 4분기중 9~12월 분양 가격 : 2000이상)인 객체만 뽑아서 새로운 리스트로 변환
		 * 
		 * 
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz21\\주택도시보증공사_전국 평균 분양가격.csv";
		
		List<Data> list = new ArrayList<Data>();

		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"))) {

			br.readLine();
			
			String result;
			
			while((result = br.readLine())!=null) {
			
			String[] arr = result.split(",", 5);
			
			Data data = new Data(arr[0], arr[1], arr[2], arr[3], arr[4].replace(" ","").replace(",", "").replace("\"", "").replace("-", ""));
			list.add(data);
			
			
			list.stream().filter(a -> a.getRegion().equals("서울")).filter(a -> Integer.parseInt(a.getPrice())>2000).forEach(a -> System.out.println(a.getRegion()+" "+a.getSize()+" "+a.getYear()+" "+a.getMonth()+" "+a.getPrice() + " ")); 
			
			
			
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}