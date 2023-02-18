package com.atiguigu.gulimall.member.feign;

import com.atiguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FeignClient 告诉SpringCloud这是一个远程调用客户端
 * 这是一个声明式的远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeginService {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
