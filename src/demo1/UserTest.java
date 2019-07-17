package demo1;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    /*Spring-IoC[Inversion of Control（控制反转]基本使用
     *                     1.添加jar包
     *                     2.创建配置文件，通常起名为applicationContext.xml
     *                     3.添加配置文件
     *                     4.测试使用
      * */
    @Test
    public void test(){
        //1.加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.根据ID获取对象
        //UserDaoMysqlImpl userDao = (UserDaoMysqlImpl) applicationContext.getBean("userDao");这是实现类，我们要面向接口编程，所以写他的父类
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
        userDao.delete();
    }
    @Test
    public void test2(){
    /*    UserDaoOracleImpl userDaoOracle = new UserDaoOracleImpl();
        userDaoOracle.name="ORACLE.NAME";
        System.out.println(userDaoOracle.name);*/
    //使用DI 依赖注入：给spring管理类中依赖的属性，通过配置文件进行赋值的过程【即赋值不在代码里面实现，而是通过配置文件进行赋值】
        //1.加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoOracleImpl obj = (UserDaoOracleImpl) applicationContext.getBean("userDao");//接口 多态
        System.out.println(obj.name);
        System.out.println("使用依赖注入：给Spring管理类中依赖的属性，通过配置文件进行赋值的过程");

    }
}
