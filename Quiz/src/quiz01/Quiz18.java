package quiz01;

public class Quiz18 {

	public static void main(String[] args) {
		
		//배열 요소들 중 짝수인 값들의 합
		int[] arr = {54, 32, 3, 5, 7, 14, 20};
		int sum = 0;
		
		
		for(int i = 1; i<=arr.length; i++) {
			if(arr[i-1]%2==0) {
				
				sum+=arr[i-1];
			}
		}
		System.out.println(sum);
		
		
		
		System.out.println(arr[0]+arr[1]+arr[5]+arr[6]);
		
	}
}
