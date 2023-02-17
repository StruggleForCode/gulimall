package com.atiguigu.gulimall.product.service.impl;

import com.atiguigu.gulimall.product.dao.CommentReplayDao;
import com.atiguigu.gulimall.product.service.CommentReplayService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atiguigu.common.utils.PageUtils;
import com.atiguigu.common.utils.Query;

import com.atiguigu.gulimall.product.entity.CommentReplayEntity;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplayEntity> page = this.page(
                new Query<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}