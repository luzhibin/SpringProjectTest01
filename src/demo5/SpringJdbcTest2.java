package demo5;

import domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext5.xml")
public class SpringJdbcTest2 {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Test
    public void test(){
        int update = jdbcTemplate.update("insert into account values (null,?,?)", "125555", 1880d);
        System.out.println(update);
    }

    @Test
    public void delete(){
        int update = jdbcTemplate.update("delete from account where id=?", 7);
        System.out.println(update);
    }
    @Test
    public void update(){
        jdbcTemplate.update("update account set name=?,money=? where id=?","ACE",11124d,5);
    }
    //查询单条记录
    @Test
    public void query(){
        String name = jdbcTemplate.queryForObject("select name from account where id=?", String.class, 1);
        System.out.println(name);
    }
    //查询记录的总数
    @Test
    public void queryCount(){
        Long count = jdbcTemplate.queryForObject("select count(*) from account",Long.class);
        System.out.println(count);
    }

    @Test
    public  void queryAccount(){
        Account account = jdbcTemplate.queryForObject("select * from account where id=?", new MyRowMap(), 1);
        System.out.println(account);
    }

    @Test
    public void queryAllAccount(){
        List<Account> query = jdbcTemplate.query("select * from account", new MyRowMap());
        for (Account account : query) {
            System.out.println(account);
        }
    }
}

class MyRowMap implements RowMapper<Account> {

    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setName(resultSet.getString("name"));
        account.setMoney(resultSet.getDouble("money"));
        return account;
    }
}
