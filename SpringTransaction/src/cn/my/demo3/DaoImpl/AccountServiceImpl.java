package cn.my.demo3.DaoImpl;


import cn.my.demo1.Dao.AccountDao;
import cn.my.demo1.Dao.AccountService;

public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;//注入持久层
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	/**
	 * 转账的方法
	 */
	@Override
	public void transfer(final String from, final String to, final Double money) {
		accountDao.out(from, money);
		//如果出现异常数据会回滚
	     int d=5/0;
		accountDao.in(to, money);
	}

}
