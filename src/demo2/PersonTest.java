package demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    @Test
    public void Test(){
        //加载核心配置文件  会帮你创建对象  所有对象都会创建
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.name);

        //使用单例关闭工厂-->（所有对象都会销毁）
        //使用多例设计模式-->
        applicationContext.close();
    }
}
