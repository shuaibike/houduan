package zuche;

import java.util.*;

public class zaikeche extends car{
    int zuidazairen;
    static double a[]= {0,0};  //记录用户租借小轿车的数量和天数
    static double b[]= {0,0};  //记录用户租借面包车的数量和天数
    static double c[]= {0,0};  //记录用户租借大巴车的数量和天数
    public void set(int b,String c,int d,int e) {
        xuhao=b;
        name=c;
        feiyong=d;
        zuidazairen=e;
    }
    public double[] xunwen1(zaikeche z1) {
        double j;
        System.out.println("请输入序号"+z1.xuhao+"（"+z1.name+"）的租用数量");
        Scanner in=new Scanner(System.in);
        a[0]=in.nextDouble();
        if(a[0]<0||(int)a[0]!=a[0]){       //当用户输入的租借数量为负数或者小数时就重新返回输入界面
            System.out.println("输入错误");
            xunwen1(z1);
        }
        else if(a[0]>0)
        {
            j=a[0];
            System.out.println("请输入租借的天数");
            a[1]=in.nextDouble();
        }
        return a;
    }
    public double[] xunwen2(zaikeche z2) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入序号"+z2.xuhao+"（"+z2.name+"）的租用数量");
        b[0]=in.nextDouble();
        if(b[0]<0||(int)b[0]!=b[0]) {
            System.out.println("输入错误");
            xunwen2(z2);
        }
        else if(b[0]>0)
        {
            System.out.println("请输入租借的天数");
            b[1]=in.nextDouble();
        }
        return b;
    }
    public double[] xunwen3(zaikeche z3) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入序号"+z3.xuhao+"（"+z3.name+"）的租用数量");
        c[0]=in.nextDouble();
        if(c[0]<0||(int)c[0]!=c[0]) {
            System.out.println("输入错误");
            xunwen3(z3);
        }
        else if(c[0]>0)
        {
            System.out.println("请输入租借的天数");
            c[1]=in.nextDouble();
        }
        return c;
    }
}
