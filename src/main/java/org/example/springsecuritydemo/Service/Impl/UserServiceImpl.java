package org.example.springsecuritydemo.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.springsecuritydemo.Entity.User;
import org.example.springsecuritydemo.Mapper.UserMapper;
import org.example.springsecuritydemo.Service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
