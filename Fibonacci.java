class Fibonacci
{
    private static boolean isPrime(int num)
    {
        boolean chk=true;
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                chk=false;
                break;
            }

        }
        return chk;
    }

    public static int[] Fiboseries(int n) 
    {
        int fs[]=new int[n];
        fs[0]=0;
        fs[1]=1;
        System.out.println(fs[0]);
        System.out.println(fs[1]);
        for(int i=2;i<n;i++)
        {
            fs[i]=fs[i-1]+fs[i-2];
        }
        return fs;
    }

    public static void Fiboseriesodd(int n)
    {
        int fs[]=new int[n];
        fs[0]=0;
        fs[1]=1;

        System.out.println(fs[1]);
        for(int i=2;i<n;i++)
        {
            fs[i]=fs[i-1]+fs[i-2];
            if(fs[i]%2!=0)
                System.out.println(fs[i]);
        }
    }

    public static void Fiboserieseven(int n)
    {
        int fs[]=new int[100];
        fs[0]=0;
        fs[1]=1;
        System.out.println(fs[0]);
        int cnt=1;
        for(int i=2;cnt!=n;i++)
        {

            if((fs[i-1]+fs[i-2])%2==0)
            {

                System.out.println(fs[i-1]+fs[i-2]);
                cnt++;
            }
        }
    }

    public static void FibosereiesBuzz(int n)
    {
        int fs[]=new int[n];
        fs[0]=0;
        fs[1]=1;
        for(int i=2;i<n;i++)
        {
            fs[i]=fs[i-1]+fs[i-2];
            if(fs[i] !=0 || fs[i] !=1)
            {
                if(isPrime(fs[i]) && (fs[i]%7==0 || fs[i]%10==7))
                    System.out.println(fs[i]);
            }
        }

    }

    public static void FibosereiesPrime(int n)
    {
        int fs[]=new int[n];
        fs[0]=0;
        fs[1]=1;

        for(int i=2;i<n;i++)
        {
            fs[i]=fs[i-1]+fs[i-2];

            if(isPrime(fs[i]))
                System.out.println(fs[i]);

        }
    }

    public static int fiboterm (int n)
    {
        int fs[]=new int[n+1];
        fs[0]=0;
        fs[1]=1;
        for(int i=2;i<fs.length;i++)
            fs[i]=fs[i-1]+fs[i-2];
        return fs[n];
    }

    public static int[ ] fiboprime(int n)
    {
        int fs[]=new int[100];
        fs[0]=0;
        fs[1]=1;

        int cnt=0,x=2,j=1;  
        int p[]=new int[n];
        for(int i=2;cnt!=n;i++)
        {
            fs[i]=fs[i-1]+fs[i-2];

            if(isPrime(fs[i]))
                p[cnt++]=fs[i];

        }
        return p;

    }

    public static boolean fibonumber(int n)
    {
        int chk=0;
        int fs[]=new int[n];
        fs[0]=0;
        fs[1]=1;

        for(int i=2;i<n;i++)
        {
            fs[i]=fs[i-1]+fs[i-2];
        }
        for(int i=0;i<n;i++)
        {
            if(fs[i]==n)
                chk=1; 
            else
                chk=0;
        }
        if(chk==1)
            return true;  
        else
            return false;
    }

}

