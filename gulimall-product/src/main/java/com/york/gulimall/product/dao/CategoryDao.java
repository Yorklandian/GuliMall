package com.york.gulimall.product.dao;

import com.york.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author york
 * @email 1627936869@qq.com
 * @date 2023-04-27 12:59:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
