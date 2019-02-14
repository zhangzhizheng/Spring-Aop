package cn.aspectj2;
/**
 * 增强类
 * @author Administrator
 *
 */
public class ProductDao {
	public void add(){
		System.out.println("增加产品");
	}
	public void update(){
		//int i=3/0;//设置的异常
		System.out.println("更新产品");
	}
	public void find(){
		System.out.println("查找产品");
	}
	public void delete(){
		System.out.println("删除产品");
	}
}
