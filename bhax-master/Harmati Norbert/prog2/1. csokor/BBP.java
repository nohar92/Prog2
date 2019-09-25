

public class BBP
{
    String hexaJegyek;
    public BBP(int d)
    {
        double d16pi = 0.0d;
        double s1 = d16Sj(d,1);
        double s4 = d16Sj(d,4);
        double s5 = d16Sj(d,5);
        double s6 = d16Sj(d,6);

        d16pi = (4.0d * s1) - (2.0d * s4) - s5 - s6;
        d16pi = d16pi - Math.floor(d16pi);

        StringBuffer sb = new StringBuffer();
        Character hexaKarakter[] = {'A', 'B', 'C', 'D', 'E', 'F'};

        while(d16pi != 0.0d)
        {

            int szam = (int)Math.floor(16.0d*d16pi);

            if(szam<10)
                sb.append(szam);
            else
                sb.append(hexaKarakter[szam-10]);

            d16pi = (16.0d*d16pi) - Math.floor(16.0d*d16pi);
        }

        hexaJegyek = sb.toString();
    }

    public long n16MODk(int n, int k)
    {
        int t = 1;

        while(t <= n)
        {
            t = t * 2;
        }

        if(t > n)
            t = t/2;

        long r = 1;

        while(true)
        {
            if(n >= t)
            {
                r = (16*r) % k;
                n = n - t;
            }

            t = t/2;

            if(t < 1)
                break;

            r = (r*r) % k;
        }

        return r;
    }

    public double d16Sj(int d, int j)
    {
        double d16Sj = 0.0d;

        for(int i = 0; i <= d; ++i)
        {
            d16Sj += (double)(n16MODk(d - i, 8 * i + j))/(double)(8 * i + j);
        }

        for(int i = d+1; i <= 2*d; ++i)
        {
            d16Sj += Math.pow(16.0d, d - i) / (double)(8*i + j);
        }

        return d16Sj - Math.floor(d16Sj);
    }

    public String toString()
    {
        return hexaJegyek;
    }

    public static void Main(String args[])
    {
        System.out.println(new BBP(1000000));
    }
}
