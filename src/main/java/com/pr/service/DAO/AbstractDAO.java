package com.pr.service.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public abstract class AbstractDAO<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {

    /**
     * 根据某个字段 的值列表 查询  返回指定字段的列表
     *
     * @param columnFunc
     * @param columnFunc
     * @param columns
     * @return
     */
    @SafeVarargs
    public final List<T> listByColumnValues(Collection<? extends Serializable> valueList, SFunction<T, ?> columnFunc, SFunction<T, ?>... columns) {
        Assert.notNull(columns, "columns is not null");
        return getBaseMapper().selectList(Wrappers.<T>lambdaQuery().in(columnFunc, valueList).select(columns));
    }
}
