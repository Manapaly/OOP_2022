import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Data D = new Data();
		boolean ok = true;
		while(ok){
		    Scanner sc = new Scanner(System.in);
		    String S = sc.nextLine();
		    if(S!="Q"){
		        D.AddData(Integer.parseInt(S));
		    }else{
		        ok = false;
		    }
		}
		
        System.out.println(Analyzer.GetAvarageFromData(D));
        System.out.println(Analyzer.GetMaximumFromData(D));

		
	}
}
