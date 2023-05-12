package study02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Account {

	int account;

	int[] coinUnit = {10000, 5000, 1000, 500, 100, 50, 10};
	int[] coin     = { 2,    4,    0,    5,   5,   5, 5};

	String[] fruit = {"사과", "메론", "바나나", "딸기", "수박", "블루베리", "참외", "포도", "배"};
	int[] price =    {4990,  7890,   3990,  14990,17990,    9990,   1990, 24990, 4590};


	Account(int account) {
		this.account = account;
	}

	public void account() {
		System.out.println("시제 : 43300원");
	}

	public void receipt() {

		String[] str = new String[9];
		for (int i = 0; i < fruit.length; i++) {
			str[i]= this.fruit[i]+"/"+this.price[i];
		}

		for (int i = 0; i < str.length; i++) {

			int ran = (int)(Math.random()*9);
			int ran2 = (int)(Math.random()*9);

			String temp;

			temp = str[ran];
			str[ran]=str[ran2];
			str[ran2]=temp;
		}
		System.out.println(Arrays.toString(str));

		int sum = 0;
		System.out.println("=========영수증===========");
		for (int i = 0; i < 5; i++) {

			int a = str[i].indexOf("/");

			System.out.print(str[i].substring(0,a)+" - ");
			System.out.println(str[i].substring(a+1,str[i].length())+"원");
			sum += Integer.parseInt(str[i].substring(a+1,str[i].length()));
			System.out.println(sum);
		}
		System.out.println("=========================");
		System.out.println("받은돈 : "+this.account);
		System.out.println("거스름돈 : "+(this.account-sum));


		calculate(this.account, sum);

	}



	public void calculate(int money, int total) {
		System.out.println("=======거스름돈 내역========");

		int exchange = money-total;

		if((exchange)>43300) {
			System.out.println("사장님 시제 보충해주세요!!!");
		} else {

			for (int i = 0; i < coin.length; i++) {
				if(i==2) {  //1000원이 0개라고 주어져있어서 지정해서 출력해줌
					System.out.print(coinUnit[i]+"원 : ");
					System.out.println(coin[i]+"개");
				} else if(i!=2) {
					if(exchange/coinUnit[i] > coin[i]) {
						exchange = exchange-(coinUnit[i]*(coin[i]));

						System.out.print(coinUnit[i] +"원 : ");
						System.out.println(coin[i]+"개");


					} else if(exchange/coinUnit[i]<=coin[i] && exchange/coinUnit[i]>0) {

						System.out.print(coinUnit[i] +"원 : ");
						System.out.println(exchange/coinUnit[i]+"개");

						exchange = exchange-(coinUnit[i]*(exchange/coinUnit[i]));

					}
				}
			}
		}
	}





}
