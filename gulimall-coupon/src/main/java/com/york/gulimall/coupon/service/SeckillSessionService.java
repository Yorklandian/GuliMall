package com.york.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.york.common.utils.PageUtils;
import com.york.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author york
 * @email 1627936869@qq.com
 * @date 2023-04-27 15:45:51
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

