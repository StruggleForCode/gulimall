package com.atiguigu.gulimall.order.dao;

import com.atiguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author leehao
 * @email leehao99@163.com
 * @date 2023-02-18 12:53:04
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
