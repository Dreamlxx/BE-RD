package org.example.my_try.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.my_try.pojo.Dept;
import org.example.my_try.pojo.Result;
import org.example.my_try.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j//日志,lombok提供

@RestController//将响应的数据类型转换为json
public class DeptController {

    @Autowired//自动注入依赖
    private DeptService deptService;

//    @RequestMapping(value = "/depts",method = RequestMethod.GET)//标志GET请求时的后面加的名儿
    @GetMapping("/depts")
    public Result list(){
//        System.out.println("查询全部部门数据");
        //改为logback的日志
        log.info("查询全部部门数据");
        List< Dept > deptList=deptService.findall();
        return Result.success(deptList);
    }


    //前端请求参数名和方法形参名称一致可以使用这个方法
    @DeleteMapping("/depts")
    public Result delete(Integer id){
//        System.out.println("删除的部门id为："+id);
        log.info("删除的部门id为：{}",id);
        deptService.deleteById(id);
        return Result.success();
    }


    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept){
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("depts/{id}")
    public Result getInfo(@PathVariable Integer id){
//        System.out.println("根据ID查询部门"+id);
        log.info("根据ID查询部门:{}",id);
        Dept dept= deptService.getInfo(id);
        return Result.success(dept);
    }

    @PostMapping("depts")
    public Result update(@RequestBody Dept dept)
    {
        deptService.update(dept);
        return  Result.success();
    }
}
