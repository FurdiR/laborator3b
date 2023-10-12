public class parabola {
    private int a;
    private int b;
    private int c;
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public parabola(int a, int b, int c, int x1, int x2, int y1, int y2) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;


    }

    public String toString()
    {
        return (a+"x^2+"+b+"x+"+c);
    }

    public String varf1()
    {
        int x;
        int y;
        x=-b/2*a;
        y=(b*b+4*a*c)/4*a;
        return "["+x+","+y+"]";

    }
    //  public String calcul()
    //  {
    //      return "";
    //  }
    public String mijloc()
    {

        double x = (x1 + x2) / 2;
        double  y=(y1+y2)/2;
        return "["+x+","+y+"]";

    }
    public double lung()
    {
        double lungime;
        lungime = ((x1 - x2)*(x1-x2)) + ((y1 - y2)*(y1-y2));
        return lungime;
    }

}
