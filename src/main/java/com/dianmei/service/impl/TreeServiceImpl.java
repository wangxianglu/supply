package com.dianmei.service.impl;

import com.dianmei.dao.StaffMapper;
import com.dianmei.dao.UserPermissionMapper;
import com.dianmei.dto.TreeDto;
import com.dianmei.enums.CompanyType;
import com.dianmei.model.Company;
import com.dianmei.model.Staff;
import com.dianmei.model.Store;
import com.dianmei.model.UserPermission;
import com.dianmei.service.CompanyService;
import com.dianmei.service.StoreService;
import com.dianmei.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 *  树结构操作实现
 *@ClassName TreeServiceImpl
 *@Description TODO
 *@Author lout
 *@Date 2018/7/4 9:48
 *@Version 1.0
 **/
@Service
@Transactional
public class TreeServiceImpl implements TreeService {

    @Autowired
    private UserPermissionMapper userPermissionMapper;
    @Autowired
    private StaffMapper staffMapper;
    @Autowired
    private StoreService storeService;
    @Autowired
    private CompanyService companyService;

    public List<TreeDto> loadTree(Integer userId) {
        List<UserPermission> userPermissions = userPermissionMapper.findByUser(userId);
        if(userPermissions == null || userPermissions.size() <= 0) {
            Staff staff = staffMapper.findByUserId(userId);
            if(staff == null) {
                return null;
            }
            Store store = storeService.findById(staff.getStoreid());
            List<Store> stores = new ArrayList<>();
            if(store != null) stores.add(store);
            return this.merge(new ArrayList<Company>(), stores, true);
        }
        return loadByUserPermission(userPermissions);
    }

    /**
     *  将公司 ,和 门店转换为 同一级的树结构模型
     * @param companies 公司集合
     * @param stores 门店集合
     * @param isParent 公司是否默认为父节点
     * @return
     */
    protected List<TreeDto> merge(List<Company> companies, List<Store> stores, boolean isParent) {
        List<TreeDto> treeDtos = new ArrayList<>();
        if(companies != null) {
            for (Company company : companies) {
                TreeDto treeDto = new TreeDto();
               /* treeDto.setId(company.getCompanyId());
                treeDto.setName(company.getNumber() + company.getCompanyName());
                treeDto.setParent(isParent);
                treeDto.setOptional(true);*/
                treeDto.setText(company.getNumber() + company.getCompanyname());
                treeDtos.add(treeDto);
            }
        }
        if(stores != null) {
            for(Store store : stores) {
                TreeDto treeDto = new TreeDto();
                /*treeDto.setId(store.getId());
                treeDto.setpId(store.getCompanyId());
                treeDto.setName(store.getStoreShortnum() + store.getStoreName());
                treeDto.setOptional(true);*/
                treeDto.setText(store.getStoreshortnum() + store.getStorename());
                treeDtos.add(treeDto);
            }
        }

        return treeDtos;
    }

    /**
     *  如果当前用户白名单配置不存在,默认加载所属门店配置.如果存在重新组织结构
     * @param userPermissions
     * @return
     */
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
        if(companyIds.size() > 0) companies = companyService.findByIdsAndType(CompanyType.HAIR, companyIds);
        if(storeIds.size() > 0)  stores = storeService.findByIds(storeIds);
        return constructRelation(companies, stores);
    }

    /**
     *  将白名单进行有效筛选,筛选条件
     *  1:companyId 不重复, 公司对应的门店不重复
     *  2:如果出现包含配置,只存储最上层配置
     *  3: 如果storeID为0表示含有子节点,否则没有子节点
     * @param userPermissions
     * @return Map<Integer, Set<Integer>>, 利用Map->Key不可重复和SET不可重复
     *         K:白名单配置的公司ID; V: 公司ID对应配置的门店ID集合,如果storeId为0代表所有门店
     */
    protected Map<Integer, Set<Integer>> constructPermission(List<UserPermission> userPermissions) {
        Map<Integer, Set<Integer>> complexIds = new HashMap<>();
        for(UserPermission userPermission : userPermissions) {
            Set<Integer> storeIds = complexIds.get(userPermission.getCompanyId()) == null
                    ? new HashSet<Integer>() : complexIds.get(userPermission.getCompanyId());
            if(storeIds.contains(0)) continue;
            storeIds.add(userPermission.getStoreId());
            complexIds.put(userPermission.getCompanyId(), storeIds);
        }
        return complexIds;
    }

    /**
     *  将公司和门店转换为JSTREE模型并进行组织,组织条件store.companyid=company.id;
     * @param companies 公司集合
     * @param stores 门店集合
     * @return
     */
    protected List<TreeDto> constructRelation(List<Company> companies, List<Store> stores) {
        if(companies == null || companies.size() <= 0) return null;
        List<TreeDto> treeDtos = new ArrayList<>();
        for(Company company : companies) {
            TreeDto treeDto = new TreeDto();
            /*treeDto.setId(company.getCompanyId());
            treeDto.setName(company.getNumber() + company.getCompanyName());
            treeDto.setParent(true);
            treeDto.setOptional(true);*/
            if(stores == null || stores.size() <= 0) {
                treeDtos.add(treeDto);
                continue;
            }
            for(Store store : stores) {
                if(store.getCompanyid() == company.getCompanyid()) {
                    TreeDto storeTreeDto = new TreeDto();
                    /*storeTreeDto.setId(store.getId());
                    storeTreeDto.setName(store.getStoreName());
                    storeTreeDto.setOptional(true);
                    storeTreeDto.setpId(store.getCompanyId()); // 放门店ID
                    treeDto.getChildren().add(storeTreeDto);
                    treeDto.setOptional(false); //初始化如果拥有子节点 设置为不可选择*/
                }
            }
            treeDtos.add(treeDto);
        }
        return treeDtos;
    }

}
