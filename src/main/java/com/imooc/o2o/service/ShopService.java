package com.imooc.o2o.service;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 17/09/2018
 * Time: 21:49
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface ShopService {
    ShopExecution addShop(Shop shop, File shopImg);
}