package zuche;

public class zuche {
    public static void main(String[] args) {
        zaikeche z1=new zaikeche();
        z1.set(1, "小轿车", 40, 4);   //定义各个型号车辆的租借信息
        zaikeche z2=new zaikeche();
        z2.set(2, "面包车", 65, 7);
        zaikeche z3=new zaikeche();
        z3.set(3, "大巴车", 180, 20);
        zaihuoche y1=new zaihuoche();
        y1.set(4, "低栏车", 30, 1.5);
        zaihuoche y2=new zaihuoche();
        y2.set(5, "高栏车", 47, 2.5);
        zaihuoche y3=new zaihuoche();
        y3.set(6, "厢式车", 80, 4.5);
        pikache p1=new pikache();
        p1.set(7, "日式皮卡车", 60, 5, 1);
        pikache p2=new pikache();
        p2.set(8, "美式皮卡车", 60, 2, 3);
        xianshi x1=new xianshi();
        x1.zuchexinxi(z1, z2, z3, y1, y2, y3, p1, p2);
        jiesuan j=new jiesuan();
        j.jisuan(z1.xunwen1(z1), z2.xunwen2(z2), z3.xunwen3(z3), y1.xunwen1(y1), y2.xunwen2(y2), y3.xunwen3(y3), p1.xunwen1(p1), p2.xunwen2(p2),z1,z2,z3,y1,y2,y3,p1,p2);
        jieshu s=new jieshu();
        s.cxjs();
    }
}
