import java.util.*;
class prime 
{
    public static boolean prime(int n)
    {  
        int count=0;
        for (int i = 2; i <= n/2; i++)

            if(n % i == 0)
            {
                count++;
                break;

            }
        return (count == 0 && n!=1);
    }

    public static boolean twinPrime( int x, int y)
    {
        return ((x-y)==2);          
    }

    public static void palprimes(int x, int y)
    {
        if(y>x)
        {
            int tmp=x;
            x=y;
            y=tmp;
        }

        if(x<=-1 || y<= -1)
        {
            x=Math.abs(x);
            y=Math.abs(y);
        }

        int cnt=0,i=1,j=1;  
        while(y<=x)  
        {  
            j=1;  
            cnt=0;  
            while(j<=x)  
            {  
                if(i%j==0)  
                    cnt++;  
                j++;   
            }  
            if(cnt==2 && i<=x && i>=y)  
            {  
                System.out.println(i);
                y++;  
            }  
            i++;  
            if(i>x)
                break;
        }  

    }

    public static int [] generatePrime(int n) 
    {  
        int cnt=0,x=0,i=1,j=1;  
        int p[]=new int[n];
        while(x<n)  
        {  
            j=1;  
            cnt=0;  
            while(j<=i)  
            {  
                if(i%j==0)  
                    cnt++;  
                j++;   
            }  
            if(cnt==2)  
            {  
                p[x]=i;
                x++;  
            }  
            i++;  
        }  
        return p;
    }  

    public static boolean isEmirp(int n)  
    {  
        if (prime(n) == false)  
            return false;  
        int reverse = 0;  
        while (n != 0)   
        {  
            int digit = n % 10;  
            reverse = reverse * 10 + digit; 
            n = n/10;  
        } 
        return prime(reverse);  
    }  

} 
