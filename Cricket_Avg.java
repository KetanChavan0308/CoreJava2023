import java.util.Scanner;

public class Cricket_Avg {

	public static void main(String[] args) {
		int m = 5;// match
		int r = 367;// run
		int i = 7;// inning
		int n = 2;// not out
		int r1 = 10;// run given by bowlers
		int w = 8;// wicket
		int ch;
		System.out.println("Enter your choice:");
		System.out.println("1.Batting");
		System.out.println("2.Bowling");
		System.out.println("3.All Rouder");
		Scanner s = new Scanner(System.in);
		ch = s.nextInt();
		switch (ch) {
		case 1: {
			System.out.println("***********This is for Batting Section****************");
			double a = r / (i - n);
			System.out.println("Batting Average is:" + a);
			break;
		}
		case 2: {
			System.out.println("************This is for Bowling Section**************** ");
			double b = (r1 / w);
			System.out.println("Bowler Average is:" + b);
			break;
		}
		case 3:{
			System.out.println("***********This is for All rouder  Section****************");
			double a = r / (i - n);
			System.out.println("Batting Average is:" + a);
			double b = (r1 / w);
			System.out.println("Bowler Average is:" + b);
			break;
		}
			
		default: {
			System.out.println("sorry its Wrong Choice ");
		}
		}

	}

}
