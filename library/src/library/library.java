package library;

public class library {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b=new book();
		b.set(3, 1);    //定义库存为一本书，容量为三本
		borrow b1=new borrow();
		borrow b2=new borrow();
		borrow b3=new borrow();   //创建五个borrow对象
		borrow b4=new borrow();
		borrow b5=new borrow();
		repay r1=new repay();
		repay r2=new repay();
		repay r3=new repay();     //创建五个repay对象
		repay r4=new repay();
		repay r5=new repay();
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b2);
		Thread t3=new Thread(b3);
		Thread t4=new Thread(b4);   //产生五个借书线程
		Thread t5=new Thread(b5);
		Thread t6=new Thread(r1);
		Thread t7=new Thread(r2);
		Thread t8=new Thread(r3);
		Thread t9=new Thread(r4);   //产生五个还书线程
		Thread t10=new Thread(r5);
		t1.start();
		t2.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();   //运行线程
		t3.start();
		t4.start();
		t10.start();
		t5.start();
	}

}
