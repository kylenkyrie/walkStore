package com.xzsd.app.clientOrder.entity;

import java.util.List;

/**
 * 订单实体类
 */
public class ClientOrderInfo {
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 订单详情id
     */
    private String orderGoodsId;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 商品价格
     */
    private String goodsPrice;
    /**
     * 客户选择的商品数量，与编号对应
     */
    private String clientGoodsNum;
    /**
     * 单个商品购买数量乘与商品价格
     */
    private String theGoodsAllPrice;
    /**
     * 订单状态
     */
    private String orderStateId;
    /**
     * 一页多少条
     */
    private int pageSize;
    /**
     * 第几页
     */
    private int pageNum;
    /**
     * 订单总价
     */
    private String orderAllCost;
    /**
     * 订单总购买数
     */
    private int orderAllGoodsCount;
    /**
     * 版本号
     */
    private String version;
    /**
     * 创建时间
     */
    private String crateTime;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 门店id
     */
    private String storeId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getClientGoodsNum() {
        return clientGoodsNum;
    }

    public void setClientGoodsNum(String clientGoodsNum) {
        this.clientGoodsNum = clientGoodsNum;
    }

    public String getOrderStateId() {
        return orderStateId;
    }

    public void setOrderStateId(String orderStateId) {
        this.orderStateId = orderStateId;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }


    public String getOrderAllCost() {
        return orderAllCost;
    }

    public void setOrderAllCost(String orderAllCost) {
        this.orderAllCost = orderAllCost;
    }

    public int getOrderAllGoodsCount() {
        return orderAllGoodsCount;
    }

    public void setOrderAllGoodsCount(int orderAllGoodsCount) {
        this.orderAllGoodsCount = orderAllGoodsCount;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(String crateTime) {
        this.crateTime = crateTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(String orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public String getTheGoodsAllPrice() {
        return theGoodsAllPrice;
    }

    public void setTheGoodsAllPrice(String theGoodsAllPrice) {
        this.theGoodsAllPrice = theGoodsAllPrice;
    }
}
