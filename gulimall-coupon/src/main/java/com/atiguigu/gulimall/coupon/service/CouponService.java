package com.atiguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atiguigu.common.utils.PageUtils;
import com.atiguigu.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author leehao
 * @email leehao99@163.com
 * @date 2023-02-18 12:19:15
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

