package com.xqk.learn.springboot.mybatis.mapper;

import com.xqk.learn.springboot.data.jpa.common.Gender;
import com.xqk.learn.springboot.data.jpa.entity.User;
import com.xqk.learn.springboot.mybatis.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.base.select.SelectMapper;
import tk.mybatis.mapper.common.condition.SelectByConditionMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Mapper
public interface UserMapper extends SelectMapper<User>, SelectByConditionMapper<User>, SelectByExampleMapper<User> {
    @Select("SELECT * FROM user")
    List<UserDTO> findAllUser();
}