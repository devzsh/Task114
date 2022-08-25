package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

import jm.task.core.jdbc.model.User;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDaoHibernateImpl();

        User user1 = new User("Ivan", "Ivanov", (byte) 25);
        User user2 = new User("Dima", "Petrov", (byte) 30);
        User user3 = new User("Alex", "Zaycev", (byte) 35);
        User user4 = new User("Stas", "Volkov", (byte) 40);



        userDao.createUsersTable();





       userDao.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.println("User с именем " + user1.getName() +  "добавлен в базу данных");
        userDao.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.println("User с именем " + user2.getName() +  "добавлен в базу данных");
        userDao.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println("User с именем " + user3.getName() +  "добавлен в базу данных");
        userDao.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println("User с именем " + user4.getName() +  "добавлен в базу данных");


        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();


    }
}
