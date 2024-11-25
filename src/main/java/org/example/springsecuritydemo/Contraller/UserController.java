package org.example.springsecuritydemo.Contraller;

import jakarta.annotation.Resource;
import org.example.springsecuritydemo.Entity.User;
import org.example.springsecuritydemo.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    public UserService userService;

    @GetMapping("/list")
    public List<User> getList(){
        return userService.list();
    }
    @GetMapping("/list2")
    public String getList2(){
        return "List2";
    }

    @PostMapping("/add")
public void add(@RequestBody User user){
    userService.saveUserDetails(user);
}
}
