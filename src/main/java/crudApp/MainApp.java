package crudApp;

import crudApp.config.AppConfiguration;
import crudApp.dao.UserDaoImpl;
import crudApp.model.User;
import crudApp.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import crudApp.service.UserService;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        UserServiceImpl userService = context.getBean(UserServiceImpl.class);


        userService.add(new User("User1", "Lastname1"));
        userService.add(new User("User2", "Lastname2"));
        userService.add(new User("User3", "Lastname3"));
        userService.add(new User("User4", "Lastname4"));
//        System.out.println(userService.getUserById(3));
    }
}
