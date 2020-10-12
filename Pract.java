import java.util.Scanner;

class Pract
	{
		public static void main ( String[] args) {
           //First
           double b = 5;
           double a = 5;
           double c = 4;
           double x = 10;
           double y = 3;
           double value1 = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)/(2*a) - Math.pow(a, 3) + Math.pow(b, -2);
           double value2 = Math.pow(Math.E, x)-(Math.pow(y, 2)+ (12 * x * y) - (3 * Math.pow(x, 2))); 
           System.out.println("№1:\n");
           System.out.println("Первая формула\n при b = "+ b +"\n a ="+a+" \n c = "+c+" \n :" + value1);
           System.out.println("Вторая формула\n при х = "+ x +" ,y ="+y+" ,e = "+ Math.E +" \n :" + value2);

           //Second
           System.out.println("№2:");
           int a1 = 4256;
            double even = 1;
            double odd = 1;
            boolean isOdd = false;
            while (a1 > 0) 
            {
                int digit = a1 % 10;
                if (isOdd) 
                {
                    odd *= digit;
                } 
                else 
                {
                    even *= digit;
                }
                isOdd = !isOdd;
                a1 /= 10;
            }
        System.out.println(even/odd);

        //Third
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int input = in.nextInt();
        String s = "";
        while (input >= 1000) {
            s += "M";
            input -= 1000;        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        } 

        System.out.print("Введите римское число: ");
        String comparison = cmp.nextLine();
        System.out.println(s.equals(comparison));

        //Fourth
        double x1, y1;
        System.out.println("Inpuy");
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        if((y1 >= -x1 + 5) && (y1 <= -x + 9) && (y>=x - 3) &&(y <= x +3))
        {
            System.out.println("True");
        }


    }
    
}