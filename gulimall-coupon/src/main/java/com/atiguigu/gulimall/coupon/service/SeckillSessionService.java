package com.atiguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atiguigu.common.utils.PageUtils;
import com.atiguigu.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author leehao
 * @email leehao99@163.com
 * @date 2023-02-18 12:19:15
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

