package com.imooc.o2o.service;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 15/09/2018
 * Time: 21:59
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class AreaServiceTest extends BaseTest {
        
    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList() {
        List <Area> areas = areaService.getAreaList();

        System.out.println(areas);
    }
}