package org.example.springsecuritydemo.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.springsecuritydemo.Entity.User;

public interface UserService extends IService<User> {
    void saveUserDetails(User user);
}
