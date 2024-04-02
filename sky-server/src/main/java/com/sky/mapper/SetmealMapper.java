package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.Setmeal;
import com.sky.enumeration.OperationType;
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

    /**
     * 根据id动态修改套餐数据
     * @param setmeal
     */
    @AutoFill(OperationType.UPDATE)
    void update(Setmeal setmeal);
}
