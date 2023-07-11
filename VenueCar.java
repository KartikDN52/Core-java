public class VenueCar{

    final int noOfWheels = 4;
    final String Category = "SUV";
    Model model;
    Color color;


    public static void main(String[] args){

        VenueCar type = new VenueCar();
        System.out.println(type.Category);

        Model model = Model.SX;
        System.out.println(model);

        Color color = Color.PHANTOM_BLACK;
        System.out.println(color);

    }
}
enum Model{

    E,S,SO,SX,SXO;
}
enum Color{

    POLAR_WHITE,DENIM_BLUE,PHANTOM_BLACK;

}