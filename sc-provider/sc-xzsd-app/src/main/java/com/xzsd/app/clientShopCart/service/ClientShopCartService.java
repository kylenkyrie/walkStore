package com.xzsd.app.clientShopCart.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzsd.app.clientShopCart.dao.ClientShopCartDao;
import com.xzsd.app.clientShopCart.entity.ClientShopCartInfo;
import com.xzsd.app.util.AppResponse;
import com.xzsd.app.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class ClientShopCartService {
    @Resource
    private ClientShopCartDao clientShopCartDao;
    /**
     * 新增购物车
     * @param clientShopCartInfo
     * @return
     * @author xiekai
     * @time 2020-4-15
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addShoppingCart(ClientShopCartInfo clientShopCartInfo){
        //生成购物车id
        clientShopCartInfo.setShopCartId(StringUtil.getCommonCode(2));
        int count = clientShopCartDao.addShoppingCart(clientShopCartInfo);
        if(0 == count){
            return AppResponse.bizError("新增购物车失败");
        }
        return AppResponse.success("新增购物车成功");
    }
    /**
     * 查询购物车
     * @param clientShopCartInfo
     * @return
     * @author xiekai
     * @time 2020-4-15
     */
    public AppResponse listShoppingCarts(ClientShopCartInfo clientShopCartInfo){
        //分页
        PageHelper.startPage(clientShopCartInfo.getPageNum(), clientShopCartInfo.getPageSize());
        List<ClientShopCartInfo> listShoppingCart = clientShopCartDao.listShoppingCarts(clientShopCartInfo);
        PageInfo<ClientShopCartInfo> pageData = new PageInfo<ClientShopCartInfo>(listShoppingCart);
        return AppResponse.success("查询购物车列表成功", pageData);
    }
    /**
     * 修改购物车商品购买数量
     * @param clientShopCartInfo
     * @return
     * @author xiekai
     * @time 2020-4-15
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateShoppingCart(ClientShopCartInfo clientShopCartInfo){
        int count = clientShopCartDao.updateShoppingCart(clientShopCartInfo);
        if(0 == count){
            return AppResponse.bizError("修改购物车商品购买数量失败");
        }
        return AppResponse.success("修改购物车商品购买数量成功");
    }
    /**
     * 删除购物车
     * @param shopCartId
     * @return
     * @author xiekai
     * @time 2020-4-15
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteShoppingCart(String shopCartId, String userId){
        List<String> listCode = Arrays.asList(shopCartId.split(","));
        int count = clientShopCartDao.deleteShoppingCart(listCode, userId);
        if(0 == count){
            return AppResponse.bizError("删除购物车失败");
        }
        return AppResponse.success("删除购物车成功");
    }
}
