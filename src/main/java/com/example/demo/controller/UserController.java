package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@Log4j2
@RequestMapping("/user")
public class UserController {
//    public Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @RequestMapping("")
    @ResponseBody
    List<User> getAll(Model model)throws Exception
    {
        List<User> users = userService.getAll();
//        logger.info("User.getAll"+users);
        log.info("User getALl():size="+users.size());
        model.addAttribute(users);
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
