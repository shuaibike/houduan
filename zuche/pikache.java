package zuche;

import java.util.*;

public class pikache extends car{
    int zuidazairen;
    int zuidazaihuo;
    static double a[]= {0,0};
    static double b[]= {0,0};
    public void set(int b,String c,int d,int e,int f) {
        xuhao=b;
        name=c;
        feiyong=d;
        zuidazairen=e;
        zuidazaihuo=f;
    }
    public double[] xunwen1(pikache p1) {
        System.out.println("请输入序号"+p1.xuhao+"（"+p1.name+"）的租用数量");
        Scanner in=new Scanner(System.in);
        a[0]=in.nextDouble();
        if(a[0]<0||(int)a[0]!=a[0]){
            System.out.println("输入错误");
            xunwen1(p1);
        }
        else if(a[0]>0)
        {
            System.out.println("请输入租借的天数");
            a[1]=in.nextDouble();
        }
        return a;
    }
    public double[] xunwen2(pikache p2) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入序号"+p2.xuhao+"（"+p2.name+"）的租用数量");
        b[0]=in.nextDouble();
        if(b[0]<0||(int)b[0]!=b[0]) {
            System.out.println("输入错误");
            xunwen2(p2);
        }
        else if(b[0]>0)
        {
            System.out.println("请输入租借的天数");
            b[1]=in.nextDouble();
        }
        return b;
    }
}
