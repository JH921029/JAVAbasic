package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class FileQuiz02 {

	public static void main(String[] args) {

		//1. Date클래스를 이용해서 File경로에 하위폴더로 20230504file 폴더를 생성합니다
		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date);
		System.out.println(now);


		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+now;

		File file = new File(path);
		file.mkdir();


		//2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("text 제목 > ");
		String txt = sc.nextLine();
		String path2 = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+now+"\\"+txt+".txt";

		//3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
		//\r\n을 적절하게 이용해서 파일 출력을 완료 
		try(BufferedWriter bw = new BufferedWriter (new FileWriter(path2, true))) {
			System.out.println("메모 > ");
			while(true) {

				String str = sc.nextLine();

				if(str.equals("그만")) {

					break;
				}

				bw.write(str);
				bw.write("\n");


			}

		}catch (Exception e) {

			e.printStackTrace();

		}
		
		//4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.

		try(BufferedReader br = new BufferedReader(new FileReader(path2))) {
			String result;
			while((result = br.readLine()) != null) {
				System.out.println(result);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
}
