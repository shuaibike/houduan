package library;

public class repay extends book implements Runnable{  //设计还书线程
	public void run() {
		synchronized (this) {
			if(inventory==capacity)  //当库存达到容量上限时，显示无需还书
			{
					System.out.println("无需还书。");
			}	
			else if(inventory<capacity)  //当库存小于容量上限时，库存加一
			{
				inventory++;
				System.out.println("图书馆剩余书本库存为："+inventory+"本。");
				notifyAll();
			}
		}
}
}
