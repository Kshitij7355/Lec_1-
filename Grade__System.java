package lec1;
import java.util.*;
public class Grade__System {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int marks = s.nextInt();
		if(marks>=75) {
			System.out.println("Grade A");
		}else if(marks>=65 && marks<75) {
			System.out.println("Grade B");
		}else if(marks>=55 && marks<65) {
			System.out.println("Grade C");
		}else if(marks>=45 && marks<55){
			System.out.println("Grade D");
		}else {
			System.out.println("Fail");
		}
	}

}
