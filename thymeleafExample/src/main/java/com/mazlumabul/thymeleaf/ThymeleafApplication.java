package com.mazlumabul.thymeleaf;

import com.mazlumabul.thymeleaf.model.User;
import com.mazlumabul.thymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafApplication.class, args);
    }

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        /*
        userService.save(new User("Ricardo","Queresma"));
        userService.save(new User("Anderson","Talisca"));
        userService.save(new User("Mario","Gomez"));
        userService.save(new User("Vincent","Aboubakar"));
        userService.save(new User("Jose","Sosa"));
        */

    }
}
