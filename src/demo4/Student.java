package demo4;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    public String name;
    public Integer age;
    public Dog dog;

    //集合类型
    //数组
    public String attr[];

    //List集合
    public List mylist;

    //set集合
    public Set mySet;

    //map-->键值对
    public Map myMap;

    public void setMyMap(Map myMap) {
        this.myMap = myMap;
    }

    public void setMySet(Set mySet) {
        this.mySet = mySet;
    }

    public void setMylist(List mylist) {
        this.mylist = mylist;
    }

    public void setAttr(String[] attr) {
        this.attr = attr;
    }

    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
    /*    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }*/
}
