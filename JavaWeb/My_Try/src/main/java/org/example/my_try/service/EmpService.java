package org.example.my_try.service;

import org.example.my_try.pojo.Emp;
import org.example.my_try.pojo.PageResult;

public interface EmpService {
    /**
     * 分页查询的方法
     * @param page
     * @param pageSize
     * @return
     */
    PageResult<Emp> page(Integer page, Integer pageSize);
}
