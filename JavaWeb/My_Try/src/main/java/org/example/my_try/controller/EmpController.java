package org.example.my_try.controller;


import lombok.extern.slf4j.Slf4j;
import org.example.my_try.pojo.Emp;
import org.example.my_try.pojo.PageResult;
import org.example.my_try.pojo.Result;
import org.example.my_try.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;
    /**
     * 分页查询
     * @return
     */
    @GetMapping
    //设置默认初始值1，10.
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                        @RequestParam(defaultValue = "10") Integer pageSize){
        log.info("分页查询：{}，{}",page,pageSize);
        PageResult<Emp> empPageResult= empService.page(page,pageSize);
        return  Result.success(empPageResult);
    }
}
