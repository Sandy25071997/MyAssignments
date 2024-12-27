package week1.day2;
 public class Fibonacci {

	public static void main(String[] args) {
	int range = 8;
	int p1 = 0;
	int p2 = 1;
	System.out.println((p1));
	for(int i=0; i<range; i++) {
		if(p1 + p2 > 13) {
			break;
		}
		System.out.println((p1+p2));
		
		int temp = p1;
		p1 = p2;
		p2 = p2 + temp;

	}

	}

}
