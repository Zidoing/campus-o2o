package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Area;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 15/09/2018
 * Time: 21:46
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface AreaDao {
    /**
     * 查询区域列表
     *
     * @return
     */
    List <Area> queryArea();
}