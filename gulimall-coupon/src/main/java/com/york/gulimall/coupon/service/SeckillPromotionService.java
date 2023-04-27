package com.york.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.york.common.utils.PageUtils;
import com.york.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author york
 * @email 1627936869@qq.com
 * @date 2023-04-27 15:45:51
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

