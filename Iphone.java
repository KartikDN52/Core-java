public class Iphone {
    
    final String brand = "apple";
    final String os = "ios";
    String modelName;
    int price;
    IphoneColor color;
    Variant variant;

    public static void main(String[] args) {
        Iphone myIphone = new Iphone();
        System.out.println(myIphone.brand);

        
         IphoneColor color=IphoneColor.RED;
            System.out.println(color);

        Variant variant = Variant.PRO_MAX;
            System.out.println(variant);


    }
}

enum IphoneColor{

    RED,BLACK,WHITE;
}

enum Variant{
    PLUS,PRO,PRO_MAX;
}

