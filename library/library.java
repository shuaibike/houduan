package library;

public class library {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b=new book();
		b.set(3, 1);    //������Ϊһ���飬����Ϊ����
		borrow b1=new borrow();
		borrow b2=new borrow();
		borrow b3=new borrow();   //�������borrow����
		borrow b4=new borrow();
		borrow b5=new borrow();
		repay r1=new repay();
		repay r2=new repay();
		repay r3=new repay();     //�������repay����
		repay r4=new repay();
		repay r5=new repay();
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b2);
		Thread t3=new Thread(b3);
		Thread t4=new Thread(b4);   //������������߳�
		Thread t5=new Thread(b5);
		Thread t6=new Thread(r1);
		Thread t7=new Thread(r2);
		Thread t8=new Thread(r3);
		Thread t9=new Thread(r4);   //������������߳�
		Thread t10=new Thread(r5);
		t1.start();
		t2.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();   //�����߳�
		t3.start();
		t4.start();
		t10.start();
		t5.start();
	}

}
