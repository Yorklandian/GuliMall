package com.york.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.york.common.utils.PageUtils;
import com.york.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author york
 * @email 1627936869@qq.com
 * @date 2023-04-27 16:05:02
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

