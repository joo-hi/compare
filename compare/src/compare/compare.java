package compare;
import java.util.Scanner;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 입력하시오: ");
		int num_arr[];
		num_arr = new int[2];
		
		for(int i=0; i<2; i++) {
			int num = scan.nextInt();
			num_arr[i] = num;
		}

		if(num_arr[0]==num_arr[1])
			System.out.println("=");
		else if(num_arr[0]>num_arr[1])
			System.out.println(">");
		else
			System.out.println("<");
	}
}
