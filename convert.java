import java.util.Scanner;
class convert
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        print("         MENU  ");

        print("1. Decimal to Binary");
        print("2. Decimal to Octal");
        print("3. Decimal to Hexadecimal");

        print("4. Binary to Decimal");
        print("5. Binary to Octal");
        print("6. Binary to Hexadecimal");

        print("7. Octal to Binary");
        print("8. Octal to Decimal");
        print("9. Octal to Hexadecimal");

        print("10. Hexadecimal to Binary");
        print("11. Hexadecimal to Decimal");
        print("12. Hexadecimal to Ocatal");

        print(" Enter opt.");
        int opt=sc.nextInt();

        long d;
        String b;
        switch(opt)
        {
            //decimal
            case 1:
            print("Enter the value");
            d=sc.nextLong();
            print(deciBin(d));
            break;

            case 2:
            print("Enter the value");
            d=sc.nextLong();
            print(deciOct(d)+"");
            break;

            case 3:
            print("Enter the value");
            d=sc.nextLong();
            print(deciHexa(d));
            break;

            //binary
            case 4:
            print("Enter the value");
            b=sc.next();
            System.out.println(binDeci(b));
            break;

            case 5:
            print("Enter the value");
            b=sc.next();
            System.out.println(binOct(b));
            break;

            case 6:
            print("Enter the value");
            b=sc.next();
            System.out.println(binHexa(b));
            break;

            //Octal
            case 7:
            print("Enter the value");
            d=sc.nextLong();
            print(octBin(d));
            break;

            case 8:
            print("Enter the value");
            d=sc.nextLong();
            print(octDeci(d)+"");
            break;

            case 9:
            print("Enter the value");
            d=sc.nextLong();
            print(octHexa(d)+"");
            break;

            //hexadecimal
            case 10:
            print("Enter the value");
            b=sc.next();
            print(hexaBin(b));
            break;

            case 11:
            print("Enter the value");
            b=sc.next();
            System.out.println(hexaDeci(b));
            break;

            case 12:
            print("Enter the value");
            b=sc.next();
            System.out.println(hexaOct(b));
            break;
        }

    }

    private static void print(String sen)
    {
        System.out.println(sen);
    }

    public static String deciBin(long d)
    {

        String b="";
        for(int i =1;d!=0;i++)
        {
            b=(d%2)+b;
            d=d/2;
        }

        return b;
    }

    public static long deciOct(long d)
    {

        long oct=0;
        long n=1;
        for(int i =1;d!=0;i++)
        {
            oct= ( ( d % 8 ) * n ) + oct ;
            d/=10;
            n*=10;
        }

        return oct;
    }

    public static String deciHexa(long d)
    {
        return binHexa(deciBin(d));
    }

    public static long binDeci(String b)
    {
        long d = 0, i = 0;
        long rem;
        long num=Long.parseLong(b);
        while (num != 0) {
            rem = num % 10;
            num /= 10;
            d += rem * Math.pow(2, i);
            ++i;
        }
        return d;
    }

    public static long binOct(String b)
    {
        return deciOct(binDeci(b));
    }

    public static String binHexa(String s)
    {

        String s1="",hexnum="";
        int R=s.length() % 4;
        for(int x=0;x<R;x++)
            s="0"+s;  
        int pos=0;
        for(int x=0;x<s.length()-1;x=pos)
        {
            pos=x+4;
            s1=s.substring(x,pos);
            long b=binDeci(s1);
            if(b<=9)
                hexnum+=b;
            else
                hexnum+=(char)(b+55);
        }
        return hexnum;
    }

    public static long octDeci(long oct)  
    {
        long d = 0, i = 0;
        long rem;
        while (oct != 0) {
            rem = oct % 10;
            oct /= 10;
            d += rem * Math.pow(8, i);
            ++i;
        }

        return d;
    }

    public static String octBin(long oct)
    {
        return deciBin(octDeci(oct));
    }

    public static String hexaBin(String h)
    {
        String hexa_digits = "0123456789ABCDEF";
        h = h.toUpperCase();
        int val = 0;
        for (int i = 0; i < h.length(); i++)
        {
            char ch = h.charAt(i);
            int d = hexa_digits.indexOf(ch);
            val = 16*val + d;

        }

        return deciBin(val);
    }

    public static long hexaDeci(String h)
    {
        String hexa_digits = "0123456789ABCDEF";
        h = h.toUpperCase();
        long deci = 0;
        for (int i = 0; i < h.length(); i++)
        {
            char ch = h.charAt(i);
            int d = hexa_digits.indexOf(ch);
            deci = 16*deci + d;

        }

        return deci;
    }

    public static long hexaOct(String h)
    {
        String hexa_digits = "0123456789ABCDEF";
        h = h.toUpperCase();
        long val = 0;
        for (int i = 0; i < h.length(); i++)
        {
            char ch = h.charAt(i);
            int d = hexa_digits.indexOf(ch);
            val = 16*val + d;

        }

        return deciOct(val);
    }

    public static String octHexa(long oct)
    {
        return binHexa(octBin(oct));
    }
}
