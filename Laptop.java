public class Laptop{
    final int noOfFuncKeys=12;
    final String numpadPlaced="Right Side";
    int noOfKeys;
    String keyboardType;
    Os os;
    Graphics gpu;



    public static void main(String[] args){

        Laptop laptop = new Laptop();
            System.out.println(laptop.noOfFuncKeys);

        
        Os os=Os.WINDOWS;
            System.out.println(os);

        Graphics gpu = Graphics.RTX;
            System.out.println(gpu);

    }
}

enum Os{
    WINDOWS,LINUX,MACOS
}
enum Graphics{
    GTX,RTX,RADEON;
}