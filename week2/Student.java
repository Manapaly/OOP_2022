public class Student {
	private String name;
	private int id=10001;
	private int year_of_study;
	
	{
        id++;
    }
	Student(){
    }
	Student(String name){
		this.name = name;
	}

	Student(String name, int year){
		this(name);
		this.year_of_study = year;
	}
	public static string getName(){
        return this.name;
    }
	public static int getId(){
        return this.id;
    }
	public static void Increment_year(int year) {
		this.year_of_study += year;
	}
}