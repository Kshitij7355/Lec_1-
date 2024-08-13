package lec1;
import java.util.*;
public class Print_Evendigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n!=0) {
			int r = n%10;
			if(r%2==0) {
				System.out.println(r);
			}n=n/10;
			
		}

	}

}
