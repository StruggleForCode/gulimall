package com.atiguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atiguigu.common.utils.PageUtils;
import com.atiguigu.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author leehao
 * @email leehao99@163.com
 * @date 2023-02-18 12:19:15
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

