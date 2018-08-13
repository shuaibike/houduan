package serversocket;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class serversocket {
    public static  void main(String args[]){
        try {
            ServerSocket ss = new ServerSocket(3203);  //
            Socket s = ss.accept();   //链接客户端
            String ip = s.getInetAddress().getHostAddress();  //获取客户端IP地址
            int port = s.getLocalPort();//获取客户端端口号
            System.out.println(ip);//打印IP地址表示与客户端连接成功
            BufferedReader bufrin =
                    new BufferedReader(new InputStreamReader(s.getInputStream()));  //建立读取缓冲区输入流
            PrintWriter out =
                    new PrintWriter(new FileWriter("d:/Server.txt"), true);  //建立写入文件流
            String line = null;
            while ((line = bufrin.readLine()) != null) {
                Date date = new Date();//获取当前时间
                String dateStr = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);//将时间转化为yyyy-MM-dd hh:mm:ss格式
                System.out.println(line);//打印客户端发送的信息表示接收成功
                out.print("时间:" + dateStr + "     ");
                out.print("ip:" + ip + "     ");
                out.print("端口:" + port + "     ");
                out.println(line);
            }
            out.close();
            s.close();
            ss.close();
        }catch(Exception e){
            System.out.println("发生异常"+e);
            e.printStackTrace();
        }

    }

}
