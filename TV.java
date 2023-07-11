public class TV{
    final String brand="Sony";
    final String origin="Japan";
    int price ;
    State state;
    Resolution resolution;


    public static void main(String[] args){

         TV myTv = new TV();
        System.out.println(myTv.brand);

        
         Resolution resolution=Resolution.UHD;
            System.out.println(resolution);

    }
}
enum State{
    ON,OFF;
}
enum Resolution{
    HD,FHD,UHD,QHD;
}