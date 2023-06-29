public class Chair{
	int salary;
	char grade;
	float Mileage;
	int numberOfChairs;
	String carName;
	
	
	public Chair(){	
    System.out.println("----------------------------------");
	System.out.println("Default Constructor");
    System.out.println("----------------------------------");
    System.out.println(salary);	
	System.out.println(grade);
	System.out.println(Mileage);
	System.out.println(numberOfChairs);
	System.out.println(carName);
    System.out.println("----------------------------------");
	}

    public Chair(int salary1 , char grade1, float Mileage1, int numberOfChairs1, String carName1){
		salary = salary1;
		grade = grade1;
		Mileage = Mileage1;
		numberOfChairs = numberOfChairs1;
		carName = carName1;	
	}
	
	public static void main(String[] args){
		new Chair();
	    System.out.println("Parameterised Constructor1");
        System.out.println("----------------------------------");
		Chair chair = new Chair(25000, 'S' , 18.1f ,10 , "Verna");
		System.out.println(chair.salary);
		System.out.println(chair.grade);
		System.out.println(chair.Mileage);
		System.out.println(chair.numberOfChairs);
		System.out.println(chair.carName);
        System.out.println("----------------------------------");
	}
}




		
