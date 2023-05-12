package quiz10;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("----------문제1----------");

		User user = new User("홍길동",123123,20);
		User user2 = new User("김길동", 456456, 30);

		System.out.println(user.getName()+" "+user.getRnn()+" "+user.getAge());
		//		System.out.println(user);

		user.getName();
		user.getRnn();
		user.getAge();

		//		String s = user.getName()+user.getRnn()+user.getAge();


		user2.getName();
		user2.getRnn();
		user2.getAge();

		//		String s2 = user2.getName()+user2.getRnn()+user2.getAge();

		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
		 */


		System.out.println("----------문제2----------");
		/* 문제2
		 * 1. 메인에서 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 메인에서 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. 메인에서 User배열에 두 객체를 저장하세요.
		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
		 * ex) User[] arr = new User[2];
		 */
		User[] arr = new User[2];

		arr[0] = user;
		arr[1] = user2;



		for(User a :arr) {


			System.out.println(a);          //toString 재정의해서 했는데 이거 안배움

		}




		System.out.println("----------문제3----------");
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		
		User[] user3 = new User[5];
		
		
		
		int i = 0;
		while(i<5) {
			
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			int rnn = sc.nextInt();
			int age = sc.nextInt();
			
			
			User us = new User(name, rnn, age);
			
			
			
			user3[i]=us;

			
			
			i++;
		}
		
		
		System.out.println(Arrays.toString(user3));


	}
}
