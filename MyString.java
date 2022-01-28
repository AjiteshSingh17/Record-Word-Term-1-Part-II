import java.util.*;
class MyString
{
    public static int countWord(String sen)
    {
        int cnt=1;
        for(int i=0;i<sen.length();i++)
            if(sen.charAt(i)==' ')
                cnt++;
        return cnt;
    }

    public static int countChar(String sen, char ch)
    {
        int cnt=0;
        for(int i=0;i<sen.length();i++)
            if( ( sen.charAt(i)==ch))
                cnt++;
        return cnt;
    }

    public static int countSentence(String sen)
    {
        int cnt=0;
        for(int i=0;i<sen.length();i++)

            if( ( sen.charAt(i)=='?' || sen.charAt(i)=='!' || sen.charAt(i)=='.') && sen.charAt(i+1)==' ')
                cnt++;
        if( ( sen.charAt(sen.length()-1)=='?' || sen.charAt(sen.length()-1)=='!' || sen.charAt(sen.length()-1)=='.'))
            cnt++;
        return cnt;
    }

    public static String toggleCase(String sen)
    {
        String new_sen="";
        for(int i=0;i<sen.length();i++)

            if(Character.isUpperCase(sen.charAt(i)) ==true )
                new_sen=sen.replace(sen.charAt(i),Character.toUpperCase(sen.charAt(i)));

            else if(Character.isLowerCase(sen.charAt(i)) ==true )
                new_sen=sen.replace(sen.charAt(i),Character.toLowerCase(sen.charAt(i)));

        return new_sen ;
    }

    public static String titleCase(String sen)
    {
        sen=sen.toLowerCase();
        sen=sen.replace(sen.charAt(1),Character.toUpperCase(sen.charAt(0)));
        for(int i=0;i<sen.length();i++)

            if(sen.charAt(i)==' ')
                sen=sen.replace(sen.charAt(i),Character.toUpperCase(sen.charAt(i)));
        return sen;
    }

    public static int findChar(String s, char ch)
    {
        int cnt=0;
        for(int i=0;i<s.length();i++)

            if(s.charAt(i)==ch)
                cnt++;

        return cnt;
    }

    public static int findString(String s1, String s2)
    {
        int cnt=0;
        for(int i=0;i<s1.length();i++)

            if(s1.charAt(i)==s2.charAt(i) && s1.charAt(i+s2.length()-1)==s2.charAt(i+s2.length()-1))

                cnt++;

        return cnt;
    }

    public static String removeextraspace(String sen)
    {
        String word="";
        String l[]=my_split(sen);
        for(int n=0;n<l.length;n++)
            word=word+l[n];
        return word;
    }

    public static String alphabetical(String word)
    {
        char l[]=new char[word.length()];
        for(int x=0;x<word.length();x++)
            l[x]=word.charAt(x);
        char tmp;
        for(int i=0;i<l.length-1;i++)
            for(int j=0;j<l.length-1-i;j++)

                if(l[j]>l[j+1])
                {
                    tmp=l[j];
                    l[j]=l[j+1];
                    l[j+1]=tmp;
                }

        word="";
        for(int n=0;n<l.length;n++)
            word=word+l[n];
        return word;
    }

    public static String reverse(String sen)
    {
        String s="";
        String x[]=my_split(sen);        
        for(int i=x.length-1;i>=0;i--)
            s=s+" "+x[i];
        return s;
    }

    public static String sort(String sen)
    {
        String x[]=my_split(sen);
        String tmp,s="";

        int l[]=new int[x.length];
        int b;
        int cnt=0;
        for(int n=0;n<x.length;n++)
        {
            for(int a=0;a<x[n].length();a++)

                cnt=x[n].charAt(a)+cnt;

            l[n]=cnt;
            cnt=0;
        }

        for(int i=0;i<x.length-1;i++)
            for(int j=0;j<x.length-1-i;j++)

                if(l[j]<l[j+1])
                {
                    tmp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=tmp;

                    b=l[j];
                    l[j]=l[j+1];
                    l[j+1]=b;
                }

        for(int n=0;n<x.length;n++)
            s=x[n]+" "+s;
        return s;
    }

    public static String sortlength(String sen)
    {
        String x[]=my_split(sen);
        String tmp,s="";
        for(int i=0;i<x.length-1;i++)
            for(int j=0;j<x.length-1-i;j++)

                if(x[j].length()>x[j+1].length())
                {
                    tmp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=tmp;
                }

        for(int n=0;n<x.length;n++)
            s=s+x[n]+" ";
        return s;
    }

    public static String [] my_split(String sen)
    {
        sen+=" ";
        int pos=0, cnt=0;
        for(int j=0;j<sen.length();j++)
            if(sen.charAt(j)==' ')
                cnt++;
        String new_sen[]=new String[cnt];
        cnt=0;
        for(int i=0;i<sen.length();i++)
            if(sen.charAt(i)==' ')
            {
                new_sen[cnt++]=sen.substring(pos,i);
                pos=i+1;
            }
        return new_sen;
    }
}
