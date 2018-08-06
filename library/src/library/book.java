package library;

public class book{
	static int capacity;   //图书馆的图书容量
	static int inventory;  //图书馆的图书库存
	public void set(int capacity,int inventory) {  //set方法对容量和库存赋值
		this.capacity=capacity;
		this.inventory=inventory;
	}
}
