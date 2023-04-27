package com.york.gulimall.member.dao;

import com.york.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author york
 * @email 1627936869@qq.com
 * @date 2023-04-27 16:05:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
