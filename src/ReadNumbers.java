import java.util.Scanner;

public class ReadNumbers
{
    public static void main(String[] args)
    {
        // abc - first, second, third;

        int number, divisionFirst, divisionSecond, divisionThird=0, divisionFour=0;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a number: ");
        number=scanner.nextInt();

        while (number>1000)
        {
            System.out.print("Enter a number: ");
            number=scanner.nextInt();
        }

        if (number<10)
        {
            if (number==0)
            {
                System.out.println("Zero");
            }
            else
            {
                System.out.println(third(number));
            }
        }
        else if (number<21)
        {
            System.out.println(second(number));
        }
        else if (number<100)
        {
            divisionFirst=number/10;        //Lấy được số đầu tiên trong 2 số.
            divisionSecond=number%10;       //Lấy được số thứ 2 trong 2 số.
            System.out.println(first(divisionFirst)+" "+third(divisionSecond));
        }
        else if (number<1000)
        {
            divisionFirst=number/100;   //Lấy được số đầu tiên trong 3 số.
            divisionSecond=number%100;  //Lấy được 2 số sau số đầu tiên trong 3 số.

            if (divisionSecond>9 && divisionSecond<21)
            {
                System.out.println((third(divisionFirst))+" hundred "+second(divisionSecond));
            }
            else if (divisionSecond==0)
            {
                System.out.println(third(divisionFirst)+" hundred");
            }
            else if (divisionSecond>0 && divisionSecond<10)
            {
                divisionFour=number%100;        //Lấy số cuối cùng trong 3 số;
                System.out.println((third(divisionFirst))+" hundred "+first(divisionThird)+" "+third(divisionFour));
            }
            else
            {
                divisionThird=divisionSecond/10;        //Lấy được số đầu tiên trong 2 số.
                divisionFour=divisionSecond%10;         //Lấy được số thứ 2 trong 2 số.

                System.out.println(third(divisionFirst)+" hundred "+first(divisionThird)+" "+third(divisionFour));
            }
        }
    }

    public static String third(int number)
    {
        switch (number)
        {
//            case 0:
//                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String second(int number)
    {
        switch (number)
        {
            case 0:
                return "zero";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
            default:
                return "";
        }
    }

    public static String first(int number)
    {
        switch (number)
        {
            case 0:
                return "and";
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }
}