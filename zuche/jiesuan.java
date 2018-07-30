package zuche;

public class jiesuan {
    double zuidazairen;
    double zuidazaihuo;
    double feiyong;
    double tianshu;
    double zucheshuliang;
    public void jisuan(double a1[],double a2[],double a3[],double b1[],double b2[],double b3[],double c1[],double c2[],zaikeche z1,zaikeche z2,zaikeche z3,zaihuoche y1,zaihuoche y2,zaihuoche y3,pikache p1,pikache p2) {
        zuidazairen=a1[0]*z1.zuidazairen+a2[0]*z2.zuidazairen+a3[0]*z3.zuidazairen+c1[0]*p1.zuidazairen+c2[0]*p2.zuidazairen;
        zuidazaihuo=b1[0]*y1.zuidazaihuo+b2[0]*y2.zuidazaihuo+b3[0]*y3.zuidazaihuo+c1[0]*p1.zuidazaihuo+c2[0]*p2.zuidazaihuo;
        feiyong=a1[0]*z1.feiyong*a1[1]+a2[0]*a2[1]*z2.feiyong+a3[0]*a3[1]*z3.feiyong+b1[0]*y1.feiyong*b1[1]+b2[0]*b2[1]*y2.feiyong+b3[0]*b3[1]*y3.feiyong+c1[0]*p1.feiyong*c1[1]+c2[0]*c2[1]*p2.feiyong;
        tianshu=a1[1]+a2[1]+a3[1]+b1[1]+b2[1]+b3[1]+c1[1]+c2[1];
        zucheshuliang=a1[0]+a2[0]+a3[0]+b1[0]+b2[0]+b3[0]+c1[0]+c2[0];
        System.out.println("总体租车的最大载人量为"+(int)zuidazairen+"人");
        System.out.println("总体租车的最大载货量为"+zuidazaihuo+"吨");
        System.out.println("总体租车费用为"+(int)feiyong+"元");
        System.out.println("总体租车天数为"+(int)tianshu+"天");
        System.out.println("租用车辆总数为"+(int)zucheshuliang+"辆");
        if(a1[0]!=0) {
            System.out.println(z1.name+"的租用数目为"+(int)a1[0]);
        }
        if(a2[0]!=0) {
            System.out.println(z2.name+"的租用数目为"+(int)a2[0]);
        }
        if(a3[0]!=0) {
            System.out.println(z3.name+"的租用数目为"+(int)a3[0]);
        }
        if(b1[0]!=0) {
            System.out.println(y1.name+"的租用数目为"+(int)b1[0]);
        }
        if(b2[0]!=0) {
            System.out.println(y2.name+"的租用数目为"+(int)b2[0]);
        }
        if(b3[0]!=0) {
            System.out.println(y3.name+"的租用数目为"+(int)b3[0]);
        }
        if(c1[0]!=0) {
            System.out.println(p1.name+"的租用数目为"+(int)c1[0]);
        }
        if(c2[0]!=0) {
            System.out.println(p2.name+"的租用数目为"+(int)c2[0]);
        }
    }
}
