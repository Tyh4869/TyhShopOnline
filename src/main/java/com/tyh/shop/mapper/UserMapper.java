package com.tyh.shop.mapper;

import com.tyh.shop.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select({"select * from user"})
    List<User> queryAllUsers();

    @Select({"select * from user where name = #{name}"})
    User queryUserByName(@Param("name")String name);

    @Select({"select * from user where id = #{id}"})
    User queryUserById(@Param("id")int id);

    @Insert({"insert into user(id, name, sex, viplevel) values (#{id}, #{name}, #{sex}, #{viplevel})"})
    int addUser(User user);

    @Delete({"delete from user where id = #{id}"})
    int deleteUserById(@Param("id") int id);

    @Update({"update user set viplevel = #{viplevel} where id = #{id}"})
    int updateVipLevel(@Param("id") int id, @Param("viplevel") int vipLevel);
}
