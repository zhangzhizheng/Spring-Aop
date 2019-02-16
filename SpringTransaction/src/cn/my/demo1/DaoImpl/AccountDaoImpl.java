package cn.my.demo1.DaoImpl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import cn.my.demo1.Dao.AccountDao;
/**
 * 账户dao层
 * @author Administrator
 *
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {


	public void out(String from, Double money) {
		String sql = "update account set money = money - ? where name  = ?";
		this.getJdbcTemplate().update(sql, money,from);
		
	}

	@Override
	public void in(String to, Double money) {
		String sql = "update account set money = money + ? where name  = ?";
		this.getJdbcTemplate().update(sql, money , to);
		
	}

}
