package demo1;

public class UserDaoOracleImpl implements UserDao{
    public String name;

    public void setName(String name) {
        this.name = name;
    }
    public void myinit(){
        System.out.println("UserDaoOracleImpl--init");
    }
    public void destroy(){
        System.out.println("UserDaoOracleImpl--destroy");
    }
    @Override
    public void save() {
        System.out.println("Oracle-save");
    }

    @Override
    public void delete() {
        System.out.println("Oracle-delete");
    }
}
