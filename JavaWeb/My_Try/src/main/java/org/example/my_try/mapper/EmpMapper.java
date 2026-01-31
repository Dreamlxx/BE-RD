package org.example.my_try.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.my_try.pojo.Emp;

import java.util.List;

/**
 * 员工信息的接口
 * */

@Mapper
public interface EmpMapper {

    /**
     * 查询总记录数
     * @return
     */
    @Select("select count(*) from emp e left join dept d on e.dept_id = d.id")
    public Long count();


    /**
     * 分页查询的方法
     * @return
     */

    @Select("select e.*,d.name deptName from emp e left join dept d on e.dept_id=d.id " +
            "order by update_time desc limit #{start},#{pageSize};")
    public List<Emp> list(Integer start,Integer pageSize);

}
