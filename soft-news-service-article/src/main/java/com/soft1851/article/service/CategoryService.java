package com.soft1851.article.service;

import com.soft1851.pojo.Category;

import java.util.List;

/**
 * @ClassName: sad
 * @Description: TODO
 * @Author: WangLinLIN
 * @Date: 2020/11/24 19:10:08 
 * @Version: V1.0
 **/
public interface CategoryService {
    /**
     * 查询所有文章分类
     * @return
     */
    List<Category> selectAll();
}