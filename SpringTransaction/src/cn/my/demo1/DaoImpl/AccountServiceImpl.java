package cn.my.demo1.DaoImpl;

import cn.my.demo1.Dao.AccountDao;
import cn.my.demo1.Dao.AccountService;

public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	/**
	 * 
	 */
	@Override
	public void transfer(String from, String to, Double money) {
		// TODO Auto-generated method stub
		accountDao.out(from, money);
		accountDao.in(to, money);
	}

}
