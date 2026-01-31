package org.example.my_try.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 配置结果封装类
 */
@Data
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
public class PageResult<T> {

    /**
     * 这里要和接口文档保持一致
     */
    private Long total;
    private List<T> rows;
}
