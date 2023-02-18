package com.atiguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atiguigu.common.utils.PageUtils;
import com.atiguigu.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author leehao
 * @email leehao99@163.com
 * @date 2023-02-18 12:19:15
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

