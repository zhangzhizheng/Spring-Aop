package cn.aspectj;
/**
 * 被增强的类
 * @author Administrator
 *
 */
public class InfoDao {
	public void add(){
		System.out.println("增加信息");
	}
	public void update(){
		//int i=3/0;//设置的异常
		System.out.println("更新信息");
	}
	public void find(){
		System.out.println("查找信息");
	}
	public void delete(){
		System.out.println("删除信息");
	}
}
