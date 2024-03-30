package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SetmealMapper {

    /**
     * 根据套餐id查询分类
     * @param categoryId
     * @return
     */
    @Select("select count(*) from setmeal where id = #{categoryId}")
    Integer countByCategoryId(Long categoryId);
}
