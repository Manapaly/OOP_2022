import java.util.Vector;
public class Cabinet {
	public int NumOfStudentsEnteringInCabinet;
	static final int CabinetsСaunt = 5;
	public static int NumOfSeatsInCabinet;
	static  int NumOfCabinets;
	static String NameOfCabinet;
	String RoomsHead;
	String StudentsName;
	static Vector<Cabinet> cabinets;
	static{
		cabinets = new Vector<Cabinet>();
	}
	{
	    cabinets.add(this);
	    if(cabinets.size()>5){
	        System.out.println(this.NameOfCabinet + " ARTYK");
	    }
	}
	Cabinet(){
	}
	Cabinet(String NameOfCabinet){
	    this.NameOfCabinet = NameOfCabinet;
	}
    Cabinet(String NameOfCabinet, int NumOfCabinets){
        this(NameOfCabinet);
        this.NumOfCabinets = NumOfCabinets;
    }
    Cabinet(String NameOfCabinet, int NumOfCabinets, String RoomsHead, int NumOfSeatsInCabinet){
        this(NameOfCabinet, NumOfCabinets);
        this.RoomsHead = RoomsHead;
        this.NumOfSeatsInCabinet = NumOfSeatsInCabinet;
    }	
	
	public String toString(){
	    return NameOfCabinet + " " + NumOfCabinets + " " + RoomsHead + " " + NumOfCabinets;
	}
}
