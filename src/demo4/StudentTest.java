package demo4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class StudentTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student)applicationContext.getBean("student");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.dog.name);
        System.out.println(student.dog.age);
        System.out.println(student.dog.color);

        //打印数组
        System.out.println(Arrays.toString(student.attr));
        //打印list集合
        System.out.println(student.mylist);
        //打印Set集合
        System.out.println(student.mySet);
        //打印map[键值对]
        System.out.println(student.myMap);
    }
}
