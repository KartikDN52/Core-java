public class iPad{

	public static void main(String[] args) {
		
	//using litrals

    String brand="Apple";
    String processor="A13 bionic";
    String color="Space gray";
    String warranty="1 yr";
    String screenType="IPS LCD";
    String screenSize="10.2 inches";
    String batteryCapacity="32.4 Wah";
    String bodyFrame="Aluminium";
    String operatingSystem="iPad OS";
    String productName="iPad 9th gen";
	
	// using new keyword

    String chargerType=  new String("lightning");
    String chargerOutput= new String("20 w");
    String displayResolution=new String("2160 x 1620");
    String displayType= new String("Retina display");
    String weight=new String("487 grams");
    String ram=new String(" 3GB");
    String ramType=new String("LPDDR4X SDRAM");
    String brightness=new String("500 nits max");
	String graphics= new String ("Apple-designed quad-core");
	String price= new String("Rs 30,000/-");
	
	int value= ramType.lastIndexOf("LPDDR4X SDRAM");
	System.out.println(value);

	String value2= color.replace('g','G');
	System.out.println(value2);
	
    String result= displayType.toLowerCase();
	System.out.println(result);

    String result1= productName.join("-","iPad","9th","gen");
    System.out.println(result1);
	
	boolean value3=ram.contains("e");
	System.out.println(value3);
	

	
	}
}
