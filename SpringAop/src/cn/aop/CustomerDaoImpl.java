package cn.aop;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void add() {
		System.out.println("增加人员");
	}

	@Override
	public void update() {
		System.out.println("更新人员");
	}

	@Override
	public void find() {
		System.out.println("查找人员");

	}

	@Override
	public void delete() {
		System.out.println("删除人员");

	}

}
