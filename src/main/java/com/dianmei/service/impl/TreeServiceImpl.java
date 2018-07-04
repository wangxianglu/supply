package com.dianmei.service.impl;

import com.dianmei.dao.UserPermissionMapper;
import com.dianmei.dto.TreeDto;
import com.dianmei.model.UserPermission;
import com.dianmei.service.TreeService;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 *  树结构操作实现
 *@ClassName TreeServiceImpl
 *@Description TODO
 *@Author lout
 *@Date 2018/7/4 9:48
 *@Version 1.0
 **/
public class TreeServiceImpl implements TreeService {

    @Autowired
    private UserPermissionMapper userPermissionMapper;

  /*  public List<TreeDto> loadTree(Integer userId) {
        List<UserPermission> userPermissions = userPermissionMapper.findByUser(userId);
        if(userPermissions == null || userPermissions.size() <= 0) {
            StaffInfo staffInfo = staffInfoAccessService.findStaffInfoByUserId(userId);
            Store store = storeAccessService.findByStoreId(staffInfo.getStoreId());
            List<Store> stores = new ArrayList<>();
            if(store != null) stores.add(store);
            return this.merge(new ArrayList<Company>(), stores, true);
        }
        return loadByUserPermission(userPermissions);
    }

    *//**
     *  如果当前用户白名单配置不存在,默认加载所属门店配置.如果存在重新组织结构
     * @param userPermissions
     * @return
     *//*
    protected List<TreeDto> loadByUserPermission(List<UserPermission> userPermissions) {
        Map<Integer, Set<Integer>> maps = this.constructPermission(userPermissions);
        Set<Integer> companyIds = new HashSet<>();
        Set<Integer> storeIds = new HashSet<>();
        Iterator<Integer> mapKeys = maps.keySet().iterator();
        while (mapKeys.hasNext()) {
            Integer key = mapKeys.next();
            companyIds.add(key);
            storeIds.addAll(maps.get(key));
        }
        companyIds.remove(0); //移除无效公司
        storeIds.remove(0); //移除无效门店
        List<Company> companies = null ;
        List<Store> stores = null;
        if(companyIds.size() > 0) companies = companyAccessService.findBySetIds(companyIds);
        if(storeIds.size() > 0)  stores = storeAccessService.findByIds(storeIds);
        return constructRelation(companies, stores);
    }

    *//**
     *  将公司和门店转换为TREE模型并进行组织,组织条件store.companyid=company.id;
     * @param companies 公司集合
     * @param stores 门店集合
     * @return
     *//*
    protected List<TreeDto> constructRelation(List<Company> companies, List<Store> stores) {
        if(companies == null || companies.size() <= 0) return null;
        List<ZtreeDto> treeDtos = new ArrayList<>();
        for(Company company : companies) {
            ZtreeDto treeDto = new ZtreeDto();
            treeDto.setId(company.getCompanyId());
            treeDto.setName(company.getNumber() + company.getCompanyName());
            treeDto.setParent(true);
            treeDto.setOptional(true);
            if(stores == null || stores.size() <= 0) {
                treeDtos.add(treeDto);
                continue;
            }
            for(Store store : stores) {
                if(store.getCompanyId() == company.getCompanyId()) {
                    ZtreeDto storeTreeDto = new ZtreeDto();
                    storeTreeDto.setId(store.getId());
                    storeTreeDto.setName(store.getStoreName());
                    storeTreeDto.setOptional(true);
                    storeTreeDto.setpId(store.getCompanyId()); // 放门店ID
                    treeDto.getChildren().add(storeTreeDto);
                    treeDto.setOptional(false); //初始化如果拥有子节点 设置为不可选择
                }
            }
            treeDtos.add(treeDto);
        }
        return treeDtos;
    }*/

}
