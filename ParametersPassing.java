public class ParametersPassing{


    public static void main(String[] args) {
        int smallestNo = smallestNumber(10, 20);
        System.out.println("\nSmallest number: " + smallestNo);
		
		int largestNo = largestNumber(5, 16);
        System.out.println("\nlargest number: " + largestNo);
		
        String evenOdd = checkEvenOrOdd(7);
        System.out.println("\nNumber is: " + evenOdd);

        String result = getResult(25);
        System.out.println("\nResult: " + result);
		
		int sum = add(5, 7);
		System.out.println("\nSum:"+sum);
		
		int diff = sub(10, 8);
		System.out.println("\nDifference: " + diff);
		
        boolean color = isRed("Green");
		System.out.println("\n" +color);
		
		boolean neg = isNegative(28);
		System.out.println("\nis Negative: " + neg);
		
        double avg = average(5, 8, 5);
		System.out.println("\nAverage: " + avg);
		
        int pow = power(6, 9);
		System.out.println("\nPower: " + pow);
    }

    public static int largestNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
	public static int smallestNumber(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static String checkEvenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }


    public static String getResult(int score) {
        if (score >= 79) {
            return "First Class";
        } else if (score >= 59) {
            return "Second Class";
        } else if (score >=49) {
            return "Average";
        } else if (score >=39) {
            return "Below Average";
        } else {
            return "Fail";
        }
    }
	public static int add(int a, int b) {
        if (a >= 0 && b >= 0) {
            return a + b;
        } else {
            return 0;
        }
    }
    public static double average(int a, int b, int c) {
        if (a >= 0 && b >= 0 && c >= 0) {
            return (a + b + c) / 3.0;
        } else {
            return 0.0;
        }
    }
	public static int sub(int a, int b) {
        if (a >= 0 && b >= 0) {
            return a - b;
        } else {
            return 0;
        }
    }
	public static boolean isRed(String color) {
        if (color== "Red") {
            return true;
        } else {
            return false;
        }
    }
	public static boolean isNegative(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }
	public static int power(int base, int exponent){
		if(exponent>0){
			int result=1;
			for(int i=0;i<=exponent;i++){
				result*=base;}
				return result;
		}
		else{
			return 1;
		}
	}
}



