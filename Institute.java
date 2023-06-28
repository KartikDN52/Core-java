public class Institute {

    public static void main(String[] args) {

        //changing the  number of parameters 

        int addedValue = addition(10, 8);
        System.out.println(addedValue);

        int addedValue1 = addition(10, 8, 4);
        System.out.println(addedValue1);

        // changing the datatypes 

        float addedValue2 = addition(2, 3.9f);
        System.out.println(addedValue2);

        float addedValue3 = addition(2.3f, 3.9f);
        System.out.println(addedValue3);

        //changing the order of the datatype 

        int  addedValue4 = addition(2, (short)2);
        System.out.println(addedValue4);

        int  addedValue5 = addition((short)2, 2);
        System.out.println(addedValue5);

        //changing the  number of parameters

        int result = getProduct(10, 8);
        System.out.println(result);

        int result1 = getProduct(10, 8, 4);
        System.out.println(result1);

        // changing the datatypes 

        float result2 = getProduct(2.3f, 3.9f);
        System.out.println(result2);

        float result3 = getProduct(2.3f, (int)3);
        System.out.println(result3);

        //changing the order of the datatype 

        int  result4 = getProduct((byte)2, 3);
        System.out.println(result4);

        int  result5 = getProduct(3,(byte)4 );
        System.out.println(result5);

         //changing the  number of parameters 

        floatavg1 = getAverage(10f, 8f,10f);
        System.out.println(avg1);

        float avg2 = getAverage(10f, 8f, 4f,3f);
        System.out.println(avg2);

        // changing the datatypes 

        int avg3 = getAverage(2,3,4);
        System.out.println(avg3);

        double avg4 = getAverage(2.3d, 3.9d,4.9d);
        System.out.println(avg4);

        //changing the order of the datatype 

        float  avg5 = getAverage(2.2f,2.3f,(int)2);
        System.out.println(avg5);

        int  avg6  = getAverage((int)2,3.4f,5.5f);
        System.out.println(avg6);

    }

    // Addition 

    public static int addition(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    public static int addition(int value1, int value2, int value3) {
        int result = value1 + value2 + value3;
        return result;
    }

    public static float addition(int value1, float value2) {
        float result = value1 + value2;
        return result;
    }
    public static float addition(float value1,float value2){
        float result=value1 + value2;
        return result;
    }
    public static int addition(int value1, short value2){
        int result=value1 + value2; 
        return result;
    }
    public static int addition(short value1, int value2){
        int result=value1 + value2;
        return result;
    }

    // Multiplication 

    public static int getProduct(int value1, int value2 ){
        int result= value1 * value2;
        return result;
    }
    public static int getProduct(int value1, int value2, int value3){
        int result = value1 * value2 * value3;
        return result;
    }
    public static float getProduct(float value1, float value2){
        float result = value1 * value2;
        return  result;
    }
    public static float getProduct(float value1, int value2){
        float result = value1 * value2;
        return result;
    }
    public static  int getProduct(byte value1, int value2){
        int result = value1 * value2;
        return result;
    }
    public static int getProduct(int value1, byte value2){
        int result = value1 * value2;
        return result;
    }

    //Average 


    public static float getAverage(float a, float b, float c){
        float avg =(a+b+c)/3.0;
        return avg;
    }
    public static float getAverage(float a, float b,float c, float d){
        float avg=(a+b+c+d)/3.0;
        return avg;
    }
    public static int getAverage(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    publuc static double getAverage(double a,double b,double c){
        double avg=(a+b+c)/3.0;
        return avg;
    }
    public static float getAverage(float a,float b,int c){
        float avg=(a+b+c)/3.0;
        return avg;
    }
    public static float getAverage(int a,float b,float c){
        float avg=(a+b+c)/3.0;
        return avg;
    }
}