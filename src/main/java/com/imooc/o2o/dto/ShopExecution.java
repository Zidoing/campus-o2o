package com.imooc.o2o.dto;

import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.enums.ShopStateEnum;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 17/09/2018
 * Time: 21:33
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ShopExecution {
    // 结果转台
    private int state;
    // 状态表示
    private String stateInfo;

    private int count;

    private Shop shop;

    private List <Shop> shopList;


    public ShopExecution() {
    }

    //失败构造器
    public ShopExecution(ShopStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    //成功构造器
    public ShopExecution(ShopStateEnum stateEnum, Shop shop) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shop = shop;

    }

    //成功构造器
    public ShopExecution(ShopStateEnum stateEnum, List <Shop> shopList) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shopList = shopList;

    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List <Shop> getShopList() {
        return shopList;
    }

    public void setShopList(List <Shop> shopList) {
        this.shopList = shopList;
    }
}