package cn.my.demo2.DaoImpl;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import cn.my.demo1.Dao.AccountDao;
import cn.my.demo1.Dao.AccountService;

public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;//注入持久层
	private TransactionTemplate transactionTemplate;//注入事务管理模板
//	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
//		this.transactionTemplate = transactionTemplate;
//	}
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	/**
	 * 转账的方法
	 */
	@Override
	public void transfer(final String from, final String to, final Double money) {
		// TODO Auto-generated method stub
		//参数是TransactionCallback<Object> arg0，一个接口；然后通过它的实现类TransactionCallbackWithoutResult
//		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//			
//			@Override
//			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
//				// TODO Auto-generated method stub
//				accountDao.out(from, money);
//				//如果出现异常数据会回滚，
//			//	int d=5/0;
//				accountDao.in(to, money);
//			}
//		});
		accountDao.out(from, money);
		//如果出现异常数据会回滚，
	 //	int d=5/0;
		accountDao.in(to, money);
	}

}
