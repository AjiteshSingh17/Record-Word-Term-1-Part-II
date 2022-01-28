import java.util.Scanner;
public class Myarray {
    int N[];
    int len;
    Scanner sc = new Scanner(System.in);

    public Myarray(int n)
    {
        this.N = new int[n];
        this.len = n;
    }

    public Myarray(int m[])
    {
        this.N = m;
        this.len = m.length;
    }

    public Myarray(Myarray obj)
    {
        this.N = obj.N;
        this.len = obj.len;
    }

    void accept()
    {
        System.out.println("Enter " + this.len + " values for the array");
        for(int i = 0; i<this.len; i++)
        {
            this.N[i] = sc.nextInt();
        }
    }

    void display()
    {
        for(int i = 0; i<this.len; i++)
        {
            System.out.println(N[i]);
        }
    }

    void display(int m, int n)
    {
        for(;m<n; m++)
            System.out.println(this.N[m]);
    }

    void Bsort(int i)
    {
        for(int x = 0; x<len; x++)

            for(int y = 0; y<len-1; y++)

                if(i == 0) 
                    if (N[y] > N[y + 1]) {
                        N[y] = N[y] + N[y + 1];
                        N[y + 1] = N[y] - N[y + 1];
                        N[y] = N[y] - N[y + 1];
                    }
                    else 
                    if (N[y] < N[y + 1]) {
                        N[y] = N[y] + N[y + 1];
                        N[y + 1] = N[y] - N[y + 1];
                        N[y] = N[y] - N[y + 1];
                    }
    }
    void Selsort(int n)
    {
        for (int i = 0; i < len - 1; i++)  // ascending order
        {  
            int tmp= i;  
            for (int j = i + 1; j < len; j++){  
                if (N[j] < N[tmp]){  
                    tmp = j;
                }  
            }  
            int num = N[tmp];   
            N[tmp] = N[i];  
            N[i] = num;  
        } 
    }

    int Bsearch(int srch_element)
    {
        int pos, first = 0, last = this.len - 1;
        while(first <= last)
        {
            pos = (first + last) / 2;
            if(this.N[pos] == srch_element)
                return pos;
            else if(this.N[pos] > srch_element)
                last = pos - 1;
            else
                first = pos + 1;
        }
        return -1;
    }

    void Acopy(int m[])
    {
        for(int i = 0; i<this.len; i++)
        {
            this.N[i] = m[i];
        }
    }

    boolean equals(Myarray obj)
    {
        if(this.len != obj.len)
            return false;
        for(int i = 0; i<this.len; i++)
        {
            if(this.N[i] != obj.N[i])
                return false;
        }
        return true;
    }

    Myarray Intersect(Myarray obj)
    {
        Myarray output = new Myarray(obj.len);
        for(int i = 0, x = 0; i<this.len; i++)
        {
            for(int j = 0; j<this.len; j++) {
                if (this.N[i] == obj.N[j]) {
                    output.N[x++] = this.N[i];
                }
            }
        }
        output.len = output.N.length;
        return output;
    }

    Myarray merge(Myarray obj)
    {
        Myarray output = new Myarray((this.len + obj.len));

        boolean exit = false;
        for(int i = 0, j = 0; exit == false; i++)
        {
            if(i >= this.len && exit == false) // or we can just add !exit instead of ( exit == false )
            {
                output.N[i] = obj.N[j++];
                if(j == obj.len)
                    exit = true;
            }
            else
                output.N[i] = this.N[i];
        }
        return output;
    }
}
