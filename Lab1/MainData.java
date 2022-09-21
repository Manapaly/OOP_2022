import java.util.Scanner;

public class MainData{
	public static void main(String[] args) {

		Data D = new Data();
		Analyzer A = new Analyzer();
		
		while(true){
		    Scanner sc = new Scanner(System.in);
		    String S = sc.nextLine();
		    if(S.equals("Q")){
		        break;
		    }else{
		        D.AddData(Double.parseDouble(S));
		    }
		}

        System.out.println(A.GetAvarageFromData(D));
        System.out.println(A.GetMaximumFromData(D));

	}
}
