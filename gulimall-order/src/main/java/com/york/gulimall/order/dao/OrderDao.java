package com.york.gulimall.order.dao;

import com.york.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author york
 * @email 1627936869@qq.com
 * @date 2023-04-27 16:17:41
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
