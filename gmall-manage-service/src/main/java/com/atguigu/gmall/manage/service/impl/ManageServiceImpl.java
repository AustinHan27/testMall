package com.atguigu.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.*;
import com.atguigu.gmall.service.ManageService;

import java.util.List;
import java.util.Map;

@Service
public class ManageServiceImpl implements ManageService {

    @Override
    public List<BaseCatalog1> getCatalog1() {
        return null;
    }

    @Override
    public List<BaseCatalog2> getCatalog2(String catalog1Id) {
        return null;
    }

    @Override
    public List<BaseCatalog3> getCatalog3(String catalog2Id) {
        return null;
    }

    @Override
    public List<BaseAttrInfo> getAttrList(String catalog3Id) {
        return null;
    }

    @Override
    public BaseAttrInfo getBaseAttrInfo(String attrId) {
        return null;
    }

    @Override
    public void saveAttrInfo(BaseAttrInfo baseAttrInfo) {

    }

    @Override
    public List<BaseSaleAttr> getBaseSaleAttrList() {
        return null;
    }

    @Override
    public void saveSpuInfo(SpuInfo spuInfo) {

    }

    @Override
    public List<SpuInfo> getSpuList(String catalog3Id) {
        return null;
    }

    @Override
    public List<SpuImage> getSpuImageList(String spuId) {
        return null;
    }

    @Override
    public List<SpuSaleAttr> getSpuSaleAttrList(String spuId) {
        return null;
    }

    @Override
    public void saveSkuInfo(SkuInfo skuInfo) {

    }

    @Override
    public SkuInfo getSkuInfo(String skuId) {
        return null;
    }

    @Override
    public List<SpuSaleAttr> getSpuSaleAttrListCheckSku(String skuId, String spuId) {
        return null;
    }

    @Override
    public Map getSkuValueIdsMap(String spuId) {
        return null;
    }

    @Override
    public List<BaseAttrInfo> getAttrList(List attrValueIdList) {
        return null;
    }
}
