package org.example.springsecuritydemo.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.springsecuritydemo.Entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
