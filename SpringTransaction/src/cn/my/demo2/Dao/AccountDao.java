package cn.my.demo2.Dao;

public interface AccountDao {
	/**
	 * 转出方法
	 * @param from ：转出人
	 * @param money ：转入金额
	 */
	public void out(String from,Double money);
	/**
	 * 转入方法
	 * @param to ：转入的人
	 * @param money：要转账金额
	 */
	public void in(String to,Double money);
}
