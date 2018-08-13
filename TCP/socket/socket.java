package socket;

import java.io.*;
import java.net.*;

public class socket {

    public static void main(String args[]) throws IOException {
        Socket s=new Socket("127.0.0.1",3203);    //定义IP地址和端口号
        BufferedReader bufr=
                new BufferedReader(new InputStreamReader(System.in));   //将键盘输入的信息写入缓冲区输入流
        BufferedWriter bufw=
                new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));  //将信息写入socket缓冲区输出流
        String line=null;
        while((line=bufr.readLine())!=null){
            bufw.write(line);    //发送信息
            bufw.newLine();  //换行操作，用于读取
            bufw.flush();  //将缓冲区的内容刷新
        }
        bufr.close();
        s.close();
    }
}
