package org.example.my_try.mapper;

import org.apache.ibatis.annotations.*;
import org.example.my_try.pojo.Dept;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Mapper
public interface DeptMapper {

    //起别名让数据得以封装，与Dept实体类名称一样
//    @Select("select id, name, create_time as createTime, update_time as updateTime from dept order by update_time desc")

    //实际生产中使用驼峰命名开关即可，在yaml文件中
    //按照更新时间进行倒序排序order by update_time desc
    @Select("select id, name, create_time , update_time  from dept order by update_time desc")
    List<Dept> findall();

    /**
     * 根据id删除部门，使用占位符防止sql注入
     * @param id
     */
    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);


    @Insert("insert into dept(name, create_time, update_time) VALUES (#{name},#{createTime},#{updateTime})")
    void add(Dept dept);

    @Select("select id, name, create_time, update_time from dept where id =#{id}")
    Dept getInfo(Integer id);

    @Update("update dept set name =#{name},update_time=#{updateTime} where id=#{id}")
    void update(Dept dept);
}
