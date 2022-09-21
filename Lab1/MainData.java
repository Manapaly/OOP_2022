import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		Data D = new Data();
		String S;
		while(S!="Q"){
		    Scanner scan = new Scanner(System.in);
		    D.add(scan.nextInt());
		}
		
        System.out.printf(Analyzer.GetAvarageFromData(D));
        System.out.printf(Analyzer.GetMaximumFromData(D));

		
	}
}
