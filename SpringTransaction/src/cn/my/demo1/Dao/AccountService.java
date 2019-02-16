package cn.my.demo1.Dao;

public interface AccountService {
	/**
	 * 转账的方法
	 * @param  from:从哪转出
	 * @param to:转入的人
	 * @param money:转账金额
	 */
	public void transfer(String from,String to,Double money);
}
