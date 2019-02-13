package cn.aop2;
/**
 * 目标对象--（创建代理对象）
 * @author Administrator
 *
 */
public class OrderDao {

	public void add() {
		System.out.println("增加订单");
	}


	public void update() {
		System.out.println("更新订单");
	}


	public void find() {
		System.out.println("查找订单");

	}

	
	public void delete() {
		System.out.println("删除订单");

	}
}
