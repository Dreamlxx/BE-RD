package org.example.my_try.service;

import org.example.my_try.pojo.Dept;

import java.util.List;

public interface DeptService {
    //查询所有的部门数据
    List<Dept> findall();

    void deleteById(Integer id);

    void add(Dept dept);

    Dept getInfo(Integer id);

    void update(Dept dept);
}
