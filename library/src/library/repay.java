package library;

public class repay extends book implements Runnable{  //��ƻ����߳�
	public void run() {
		synchronized (this) {
			if(inventory==capacity)  //�����ﵽ��������ʱ����ʾ���軹��
			{
					System.out.println("���軹�顣");
			}	
			else if(inventory<capacity)  //�����С����������ʱ������һ
			{
				inventory++;
				System.out.println("ͼ���ʣ���鱾���Ϊ��"+inventory+"����");
				notifyAll();
			}
		}
}
}
