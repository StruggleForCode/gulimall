package com.atiguigu.gulimall.product.service.impl;

import com.atiguigu.gulimall.product.dao.CategoryDao;
import com.atiguigu.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atiguigu.common.utils.PageUtils;
import com.atiguigu.common.utils.Query;

import com.atiguigu.gulimall.product.entity.CategoryEntity;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

}