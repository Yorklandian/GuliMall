package com.york.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.york.common.utils.PageUtils;
import com.york.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author york
 * @email 1627936869@qq.com
 * @date 2023-04-27 16:05:03
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

