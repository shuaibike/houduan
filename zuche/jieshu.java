package zuche;

import java.util.*;

public class jieshu {
    public void cxjs() {
        System.out.println();
        System.out.print("请输入回车键结束程序");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        if(str.length()==0) {   //当输入为回车键时，字符串就为空，就可以结束程序
            System.out.println("程序结束");
        }
        else
            cxjs();   //如果输入输入的不是空格就重新返回输入界面
    }
}
