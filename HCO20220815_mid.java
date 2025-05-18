import java.util.Scanner;
public class HCO20220815_mid {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String hum, com ;
		
		System.out.print("당신의 선택은 ? === >");
		
		hum = s.next();
		
		
		String [] hands = {"가위", "바위", "보"};
		int rnd = (int) (Math.random()* hands.length);
		com = hands[rnd];
		
		System.out.println("컴퓨터의 선택은 ? ===> " +com);
		
		if (hum.equals("가위")) {
			if (com.equals("가위"))
				System.out.println("비김");
			else if (com.equals("바위"))
				System.out.println("짐");
			else if (com.equals("보"))
				System.out.println("이김");
		
		}
		else if (hum.equals("바위")) {
			if (com.equals("바위"))
				System.out.println("비김");
			else if (com.equals("보"))
				System.out.println("짐");
			else if (com.equals("가위"))
				System.out.println("이김");
		
		}
		else if (hum.equals("보")) {
			if (com.equals("가위"))
				System.out.println("짐");
			else if (com.equals("바위"))
				System.out.println("이김");
			else if (com.equals("보"))
				System.out.println("비김");
		
		}
		else { 
		System.out.println("셋 중에 하나를 선택해주세요!!!");
		}
		
		
	}	
 	
}

