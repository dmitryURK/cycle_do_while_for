package com.dimaUKR;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){ // from 0 to 10
			System.out.println("round:"+i);
		}

		for(int i = 1; i <= 10; i++){ // from 1 to 10
			System.out.println("round2:"+i);
		}

		for(int i = 100; i >= 10; i-=10){ // 90 80 70 60 50 40 30 20 10
			System.out.println("round3:"+i);
		}

		int j=0;
		while (j < 10)              // from 0 to 10
		{
			System.out.println("while round:"+j);
			j++;
		}
		boolean isTrue = true;
		while(isTrue){                  // будє виконуватись до тих пір поки змінна не стане false
			System.out.println(j);
			j+=10;
			if (j>=100)
				isTrue=false;
		}

		int x=0;
		do {                            // перший раз виконается не залежно від умов вказаних у циклі while
			x++;
			System.out.println(x);

		}while (x < 0);

	}
}
