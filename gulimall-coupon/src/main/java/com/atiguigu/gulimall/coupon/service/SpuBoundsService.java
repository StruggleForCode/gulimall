package com.atiguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atiguigu.common.utils.PageUtils;
import com.atiguigu.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author leehao
 * @email leehao99@163.com
 * @date 2023-02-18 12:19:15
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

