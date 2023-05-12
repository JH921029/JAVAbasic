package programers;

public class Solution {
	int[] arr;

	public int[] solution(int[] arr, int[] query) {

		this.arr =arr;

		for (int i = 0; i < query.length; i++) {
			if(query[i]%2==0) {
				this.arr[query[i]+1]=0;

				int[] temp = new int[arr.length-1];
				for (int k = query[i]+1; k <= temp.length; k++) {
					
					if(k!=temp.length)
					{
					arr[k]=arr[k+1];
					temp=arr;
					this.arr=temp;
					temp=null;
					}

				}


			}else if(query[i]%2!=0) {
				this.arr[query[i]-1]=0;
				int[] temp = new int[arr.length-1];
				for (int k = query[i]-1; k <= temp.length; k++) {
					
					if(k!=temp.length) {

					arr[k]=arr[k+1];
					temp=arr;
					this.arr=temp;
					temp=null;
					}
				}
			}
		}



		int[] answer = this.arr;
		return answer;
	}



}
