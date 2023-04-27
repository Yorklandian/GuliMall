package com.york.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.york.common.utils.PageUtils;
import com.york.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author york
 * @email 1627936869@qq.com
 * @date 2023-04-27 16:17:41
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

