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
        System.out.println("使用Oracle数据库的保存操作");
    }

    @Override
    public void delete() {
        System.out.println("删除操作---------");
        System.out.println("Oracle-delete");
    }
}
