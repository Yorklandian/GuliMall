package com.york.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.york.gulimall.product.entity.BrandEntity;
import com.york.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
       /* *//*BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("huawei");
        brandService.save(brandEntity);*//*

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("aaaaaaa");
        brandService.save(brandEntity);
        System.out.println("save success!!!!!!!!!!!!!");*/

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
        list.forEach((item) ->{
            System.out.println(item.getName());
        });
    }

}
