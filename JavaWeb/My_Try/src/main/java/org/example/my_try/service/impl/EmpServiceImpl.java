package org.example.my_try.service.impl;

import org.example.my_try.mapper.EmpMapper;
import org.example.my_try.pojo.Emp;
import org.example.my_try.pojo.PageResult;
import org.example.my_try.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageResult<Emp> page(Integer page, Integer pageSize) {
        //1.调用mapper接口，查询总记录数
        Long total = empMapper.count();

        //2.查询结果列表
//        list第一个索引是起始页码，用公式计算
        Integer start=(page-1)*pageSize;
        List<Emp> rows = empMapper.list(start, pageSize);

        //3.将结果封装成Result
        return new PageResult<Emp>(total,rows);
    }
}
