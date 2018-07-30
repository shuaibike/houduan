package zuche;

public class xianshi {
    public void zuchexinxi(zaikeche z1,zaikeche z2,zaikeche z3,zaihuoche y1,zaihuoche y2,zaihuoche y3,pikache p1,pikache p2) {
        System.out.println("                           载客车");
        System.out.println("序号     车辆名称     租车费用（元/（车.天））     最大载人（人）");
        System.out.println("  "+z1.xuhao+"        "+z1.name+"                        "+z1.feiyong+"                   "+z1.zuidazairen);
        System.out.println("  "+z2.xuhao+"        "+z2.name+"                        "+z2.feiyong+"                   "+z2.zuidazairen);
        System.out.println("  "+z3.xuhao+"        "+z3.name+"                        "+z3.feiyong+"                   "+z3.zuidazairen);
        System.out.println();
        System.out.println();
        System.out.println("                           载货车");
        System.out.println("序号     车辆名称     租车费用（元/（车.天））     最大载货（吨）");
        System.out.println("  "+y1.xuhao+"        "+y1.name+"                        "+y1.feiyong+"                   "+y1.zuidazaihuo);
        System.out.println("  "+y2.xuhao+"        "+y2.name+"                        "+y2.feiyong+"                   "+y2.zuidazaihuo);
        System.out.println("  "+y3.xuhao+"        "+y3.name+"                        "+y3.feiyong+"                   "+y3.zuidazaihuo);
        System.out.println();
        System.out.println();
        System.out.println("                                   皮卡车");
        System.out.println("序号     车辆名称      租车费用（元/（车.天））     最大载人（人）     最大载货（吨）");
        System.out.println("  "+p1.xuhao+"     "+p1.name+"                        "+p1.feiyong+"                "+p1.zuidazairen+"                "+p1.zuidazaihuo);
        System.out.println("  "+p2.xuhao+"     "+p2.name+"                        "+p2.feiyong+"                "+p2.zuidazairen+"                "+p2.zuidazaihuo);
        System.out.println();
        System.out.println();
    }
}
