package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 15/09/2018
 * Time: 23:10
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ShopDaoTest extends BaseTest {

    @Autowired
    private ShopDao shopDao;

    @Test
    public void testInsertShop() {
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();

        owner.setUserId(9L);
        area.setAreaId(3L);
        shopCategory.setShopCategoryId(10L);

        shop.setOwnerId(owner.getUserId());
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopDesc("test");
        shop.setShopAddr("test");
        shop.setPhone("test");
        shop.setShopImg("test");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("shenhezhong");
        shop.setShopName("shop");
        int effectNum = shopDao.insertShop(shop);
        System.out.println(effectNum);
    }

    @Test
    public void testUpdateShop() {
        Shop shop = new Shop();


        shop.setShopId(28L);
        shop.setShopDesc("ff");
        shop.setShopAddr("ff");
        shop.setPhone("fff");
        shop.setShopImg("fff");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("fff");
        shop.setShopName("shop");
        int effect = shopDao.updateShop(shop);
        System.out.println(effect);
    }
}