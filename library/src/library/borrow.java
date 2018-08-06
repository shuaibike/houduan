package library;

public class borrow extends book implements Runnable{   //设计借书线程
	public void run() {
		synchronized (this) {  //当一个线程运行时，对共享资源加锁
			if(inventory>0)  //当库存大于一时，库存减一
			{
				inventory=inventory-1;
				System.out.println("图书馆剩余书本库存为："+inventory+"本。");
			}
			else if(inventory==0)  //当库存为零时，等待一个还书线程结束时，再运行这个借书线程
			{
				try {
					System.out.println("暂无书本可借出。");
					wait();
				}catch(InterruptedException e) {}
			}
		}
	}
}
