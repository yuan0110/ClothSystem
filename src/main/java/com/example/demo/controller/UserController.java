package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Log4j2
@RequestMapping("/user")
public class UserController {
//    public Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @RequestMapping("")
    List<User> getAll()
    {
        List<User> users = userService.getAll();
//        logger.info("User.getAll"+users);
        log.info(users.size());
        return users;

    }

    @RequestMapping("/reception")
    User getReception(){
        return userService.queryByRole("reception");
    }

    @RequestMapping("/deliveryman")
    User getDeliveryman(){
        return userService.queryByRole("deliveryman");
    }

    @RequestMapping("/administrator")
    User getAdministrator(){
        return userService.queryByRole("administrator");
    }
}
