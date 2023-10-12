import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fisier = new Scanner(new File("apa.txt"));
        List<parabola> Arraylist = new ArrayList<>();
        String a = "";
        String b = "";
        String c = "";
        while (fisier.hasNextLine()) {
            a = fisier.nextLine();
            b = fisier.nextLine();
            c = fisier.nextLine();

        }
        int d, e, f, g, h, j, k;
        d = Integer.parseInt(a);
        e = Integer.parseInt(b);
        f = Integer.parseInt(c);
        Scanner sc = new Scanner(System.in);
        System.out.print("x1= ");
        int x1 = sc.nextInt();
        System.out.print("\nx2= ");
        int x2 = sc.nextInt();
        System.out.print("\ny1= ");
        int y1 = sc.nextInt();
        System.out.print("\ny2= ");
        int y2 = sc.nextInt();
        sc.close();
        g = Integer.parseInt(String.valueOf(x1));
        h = Integer.parseInt(String.valueOf(x2));
        j = Integer.parseInt(String.valueOf(y1));
        k = Integer.parseInt(String.valueOf(y2));
        Scanner scanner = new Scanner(System.in);
        Arraylist.add(new parabola(d, e, f, g, h, j, k));
        //  Scanner sc=new Scanner(System.in);
        //     System.out.print("x1= ");
        //        double x1=sc.nextInt();
        //        System.out.print("\nx2= ");
        //        double x2=sc.nextInt();
        //        System.out.print("\ny1= ");
        //        double y1=sc.nextInt();
        //        System.out.print("\ny2= ");
        //        double y2=sc.nextInt();
        //        sc.close();
        for (int i = 0; i < Arraylist.size(); i++) {
            System.out.println(Arraylist.toString());
            System.out.println(Arraylist.get(i).varf1());
            System.out.println(Arraylist.get(i).mijloc());
            System.out.println(Arraylist.get(i).lung());

        }
    }
}