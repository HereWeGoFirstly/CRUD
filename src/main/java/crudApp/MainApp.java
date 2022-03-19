package crudApp;

import crudApp.config.AppConfiguration;
import crudApp.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import crudApp.service.UserService;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        UserService userService = context.getBean(UserService.class);

        userService.add(new User("User1", "Lastname1"));
        userService.add(new User("User2", "Lastname2"));
        userService.add(new User("User3", "Lastname3"));
        userService.add(new User("User4", "Lastname4"));
//        System.out.println(userService.getUserById(3));
    }
}
