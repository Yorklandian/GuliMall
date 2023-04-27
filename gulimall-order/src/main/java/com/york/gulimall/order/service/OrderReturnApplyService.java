package com.york.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.york.common.utils.PageUtils;
import com.york.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author york
 * @email 1627936869@qq.com
 * @date 2023-04-27 16:17:42
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

