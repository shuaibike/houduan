package library;

public class borrow extends book implements Runnable{   //��ƽ����߳�
	public void run() {
		synchronized (this) {  //��һ���߳�����ʱ���Թ�����Դ����
			if(inventory>0)  //��������һʱ������һ
			{
				inventory=inventory-1;
				System.out.println("ͼ���ʣ���鱾���Ϊ��"+inventory+"����");
			}
			else if(inventory==0)  //�����Ϊ��ʱ���ȴ�һ�������߳̽���ʱ����������������߳�
			{
				try {
					System.out.println("�����鱾�ɽ����");
					wait();
				}catch(InterruptedException e) {}
			}
		}
	}
}
