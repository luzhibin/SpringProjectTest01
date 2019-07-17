package demo1;

public class UserDaoMysqlImpl implements UserDao{

    public  String name;
    @Override
    public void save() {
        System.out.println("mysql-save");
    }

    @Override
    public void delete() {
        System.out.println("mysql-delete");
    }
}
