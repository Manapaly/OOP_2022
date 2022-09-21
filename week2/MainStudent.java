import java.util.Scanner;

public class MainStudent {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Student s1 = new Time(scan.next(), scan.nextInt());	
		
        System.out.println(s1.toString())


 		Student s2 = new Student();
		
		t2.setHour(15);
		t2.setMinute(98);
		t2.setSecond(62);
		System.out.println(t1.Standard());
		System.out.println(t2.Universal());
		t1.add(t2);
		t1.fixTime();
// 		t2.setTime();
		
		System.out.println(t1.Standard());
		System.out.println(t2.Universal());
	}
}