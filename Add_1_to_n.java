package lec1;
import java.util.*;
public class Add_1_to_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int sum=0;
		while(i<=n) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);

	}

}
