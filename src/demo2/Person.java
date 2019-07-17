package demo2;

public class Person {
    public String name;

    public void setName(String name) {
        this.name = name;
    }
    public  void init(){
        System.out.println("Person--init");
    }
    public void destory(){
        System.out.println("Person--destory");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
