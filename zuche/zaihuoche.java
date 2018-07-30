package zuche;

import java.util.*;

public class zaihuoche extends car{
    double zuidazaihuo;
    static double a[]= {0,0};
    static double b[]= {0,0};
    static double c[]= {0,0};
    public void set(int b,String c,int d,double e) {
        xuhao=b;
        name=c;
        feiyong=d;
        zuidazaihuo=e;
    }
    public double[] xunwen1(zaihuoche y1) {
        System.out.println("请输入序号"+y1.xuhao+"（"+y1.name+"）的租用数量");
        Scanner in=new Scanner(System.in);
        a[0]=in.nextDouble();
        if(a[0]<0||(int)a[0]!=a[0]){
            System.out.println("输入错误");
            xunwen1(y1);
        }
        else if(a[0]>0)
        {
            System.out.println("请输入租借的天数");
            a[1]=in.nextDouble();
        }
        return a;
    }
    public double[] xunwen2(zaihuoche y2) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入序号"+y2.xuhao+"（"+y2.name+"）的租用数量");
        b[0]=in.nextDouble();
        if(b[0]<0||(int)b[0]!=b[0]) {
            System.out.println("输入错误");
            xunwen2(y2);
        }
        else if(b[0]>0)
        {
            System.out.println("请输入租借的天数");
            b[1]=in.nextDouble();
        }
        return b;
    }
    public double[] xunwen3(zaihuoche y3) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入序号"+y3.xuhao+"（"+y3.name+"）的租用数量");
        c[0]=in.nextDouble();
        if(c[0]<0||(int)c[0]!=c[0]) {
            System.out.println("输入错误");
            xunwen3(y3);
        }
        else if(c[0]>0)
        {
            System.out.println("请输入租借的天数");
            c[1]=in.nextDouble();
        }
        return c;
    }
}
