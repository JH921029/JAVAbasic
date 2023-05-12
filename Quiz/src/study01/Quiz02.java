package study01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값과 최소값을 찾고 
		 * 각각 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		 * 예를 들어, 서로 다른 9개의 자연수
		 * 3, 29, 38, 12, 57, 74, 40, 85, 61
		 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이고 최소값은 3, 이 값은 1번째 수이다.
		 * (입력)
		 * 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
		 * (출력)
		 * 첫째 줄에 최댓값과 몇 번째 수인지를 출력하고, 둘째 줄에는 최소값과 몇 번째 수인지 쉼표로 구분하여 출력한다.
		 * (예제 입력)
		 * 3
		 * 29
		 * 38
		 * 12
		 * 57
		 * 74
		 * 40
		 * 85
		 * 61
		 * (예제 출력)
		 * 최댓값: 35, 3번째
		 * 최소값: 3 , 1번째
		 */
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int[] arr2 = Arrays.copyOf(arr, arr.length); //배열을 깊은복사 해줍니다.


		Arrays.sort(arr);//arr을 배열을 솔트정렬합니다.




		System.out.print("최대값 : "+arr[arr.length-1]); //length-1은 최대값입니다.

		int count = 0;
		for (int i = 0; i < arr2.length; i++) { //arr2 복사한 배열에서 최대값과 같은 숫자가 있는 곳까지 count올려줍니다 
			if(arr2[i]==arr[arr.length-1]) {
				System.out.println(" "+(count+1)+"번쨰");
			}
			count++;

		}



		System.out.print("최소값 : "+arr[0]);//0번째는 최소값입니다.

		int count2 = 0;
		for (int i = 0; i < arr2.length; i++) { //arr2 복사한 배열에서 최소값과 같은 숫가자 있는 곳까지 count올려줍니다.
			if(arr2[i]==arr[0]) {
				System.out.print(" "+(count2+1)+"번쨰");
			}
			count2++;

		}
	}

}
