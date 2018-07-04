package com.dianmei.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bm_store")
public class Store {
    @Id
    @Column(name = "STOREID")
    private Integer storeid;

    @Column(name = "STORENAME")
    private String storename;

    @Column(name = "STORENUMBER")
    private Integer storenumber;

    @Column(name = "STORESHORTNUM")
    private String storeshortnum;

    @Column(name = "CODE")
    private String code;

    @Column(name = "VERSION")
    private Long version;

    @Column(name = "MEMO")
    private String memo;

    @Column(name = "CREATEDATE")
    private Date createdate;

    @Column(name = "UPDATEDATE")
    private Date updatedate;

    @Column(name = "STOREPROVINCE")
    private Integer storeprovince;

    @Column(name = "STORECITY")
    private Integer storecity;

    @Column(name = "STOREDISTRICT")
    private Integer storedistrict;

    @Column(name = "STORESTREET")
    private String storestreet;

    @Column(name = "STOREAREACODE")
    private String storeareacode;

    @Column(name = "STOREADDRESS")
    private String storeaddress;

    @Column(name = "STORELAT")
    private String storelat;

    @Column(name = "STORELNG")
    private String storelng;

    @Column(name = "LEVELTYPE")
    private Integer leveltype;

    @Column(name = "STOREPHONE")
    private String storephone;

    @Column(name = "STORETYPE")
    private Integer storetype;

    /**
     * 门店项目活动图片列表
     */
    @Column(name = "ACTIVITYIMAGES")
    private String activityimages;

    @Column(name = "DETAIL")
    private String detail;

    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "UPDATER")
    private String updater;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "STOREDOORIMAGE")
    private String storedoorimage;

    @Column(name = "STOREMANID")
    private Integer storemanid;

    @Column(name = "PRODUCTGROUPID")
    private Integer productgroupid;

    @Column(name = "STORELOGO")
    private String storelogo;

    @Column(name = "STARTTIME")
    private Date starttime;

    @Column(name = "CLOSINGTIME")
    private Date closingtime;

    @Column(name = "BRANDID")
    private Integer brandid;

    @Column(name = "STOREMANAGER")
    private String storemanager;

    @Column(name = "STOREUSERID")
    private Integer storeuserid;

    /**
     * 0为正常，1为关闭
     */
    @Column(name = "STORESTATUS")
    private Integer storestatus;

    @Column(name = "COMPANYID")
    private Integer companyid;

    @Column(name = "STORECIRCLE")
    private Integer storecircle;

    /**
     * 此表同时可以作为部门使用，此字段用来把店用来不显示，比如顶级公司有一个默认店，用来放临时员工，不需要显示
     */
    @Column(name = "STOREISSHOW")
    private Integer storeisshow;

    /**
     * 0不可议价1可议价
     */
    @Column(name = "is_bargain")
    private Integer isBargain;

    @Column(name = "roser_time")
    private Date roserTime;

    /**
     * 轮排规则 1:1,2,3,4  2:1,3,4  3:2,3,4  4:3,4
     */
    @Column(name = "roster_rule")
    private String rosterRule;

    /**
     * 签退地址
     */
    @Column(name = "sign_url")
    private String signUrl;

    @Column(name = "supplyCompanyId")
    private Integer supplycompanyid;

    /**
     * 门店控制员工提现途径. 1:提工资,2:提提成,3:提补贴,4:补贴和提成.其他默认不可提
     */
    @Column(name = "salary_control")
    private Integer salaryControl;

    /**
     * 门店调用当面付短路控制 0:默认正常 1:如果门店存在并且状态正确直接返回成功
     */
    @Column(name = "pay_route")
    private Integer payRoute;

    /**
     * 床数
     */
    private Integer bed;

    /**
     * 椅子数
     */
    private Integer chair;

    /**
     * 桶数
     */
    private Integer bucket;

    /**
     * 房间数
     */
    private Integer room;

    /**
     * 是否接受项目下发，0：不允许，1：允许
     */
    @Column(name = "distribution_permit")
    private Integer distributionPermit;

    @Column(name = "STOREIMAGE")
    private String storeimage;

    private String roser1;

    private String roser2;

    private String roser3;

    private String roser4;

    private String roser5;

    /**
     * @return STOREID
     */
    public Integer getStoreid() {
        return storeid;
    }

    /**
     * @param storeid
     */
    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    /**
     * @return STORENAME
     */
    public String getStorename() {
        return storename;
    }

    /**
     * @param storename
     */
    public void setStorename(String storename) {
        this.storename = storename;
    }

    /**
     * @return STORENUMBER
     */
    public Integer getStorenumber() {
        return storenumber;
    }

    /**
     * @param storenumber
     */
    public void setStorenumber(Integer storenumber) {
        this.storenumber = storenumber;
    }

    /**
     * @return STORESHORTNUM
     */
    public String getStoreshortnum() {
        return storeshortnum;
    }

    /**
     * @param storeshortnum
     */
    public void setStoreshortnum(String storeshortnum) {
        this.storeshortnum = storeshortnum;
    }

    /**
     * @return CODE
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return VERSION
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * @return MEMO
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @return CREATEDATE
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return UPDATEDATE
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * @param updatedate
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * @return STOREPROVINCE
     */
    public Integer getStoreprovince() {
        return storeprovince;
    }

    /**
     * @param storeprovince
     */
    public void setStoreprovince(Integer storeprovince) {
        this.storeprovince = storeprovince;
    }

    /**
     * @return STORECITY
     */
    public Integer getStorecity() {
        return storecity;
    }

    /**
     * @param storecity
     */
    public void setStorecity(Integer storecity) {
        this.storecity = storecity;
    }

    /**
     * @return STOREDISTRICT
     */
    public Integer getStoredistrict() {
        return storedistrict;
    }

    /**
     * @param storedistrict
     */
    public void setStoredistrict(Integer storedistrict) {
        this.storedistrict = storedistrict;
    }

    /**
     * @return STORESTREET
     */
    public String getStorestreet() {
        return storestreet;
    }

    /**
     * @param storestreet
     */
    public void setStorestreet(String storestreet) {
        this.storestreet = storestreet;
    }

    /**
     * @return STOREAREACODE
     */
    public String getStoreareacode() {
        return storeareacode;
    }

    /**
     * @param storeareacode
     */
    public void setStoreareacode(String storeareacode) {
        this.storeareacode = storeareacode;
    }

    /**
     * @return STOREADDRESS
     */
    public String getStoreaddress() {
        return storeaddress;
    }

    /**
     * @param storeaddress
     */
    public void setStoreaddress(String storeaddress) {
        this.storeaddress = storeaddress;
    }

    /**
     * @return STORELAT
     */
    public String getStorelat() {
        return storelat;
    }

    /**
     * @param storelat
     */
    public void setStorelat(String storelat) {
        this.storelat = storelat;
    }

    /**
     * @return STORELNG
     */
    public String getStorelng() {
        return storelng;
    }

    /**
     * @param storelng
     */
    public void setStorelng(String storelng) {
        this.storelng = storelng;
    }

    /**
     * @return LEVELTYPE
     */
    public Integer getLeveltype() {
        return leveltype;
    }

    /**
     * @param leveltype
     */
    public void setLeveltype(Integer leveltype) {
        this.leveltype = leveltype;
    }

    /**
     * @return STOREPHONE
     */
    public String getStorephone() {
        return storephone;
    }

    /**
     * @param storephone
     */
    public void setStorephone(String storephone) {
        this.storephone = storephone;
    }

    /**
     * @return STORETYPE
     */
    public Integer getStoretype() {
        return storetype;
    }

    /**
     * @param storetype
     */
    public void setStoretype(Integer storetype) {
        this.storetype = storetype;
    }

    /**
     * 获取门店项目活动图片列表
     *
     * @return ACTIVITYIMAGES - 门店项目活动图片列表
     */
    public String getActivityimages() {
        return activityimages;
    }

    /**
     * 设置门店项目活动图片列表
     *
     * @param activityimages 门店项目活动图片列表
     */
    public void setActivityimages(String activityimages) {
        this.activityimages = activityimages;
    }

    /**
     * @return DETAIL
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * @return CREATOR
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return UPDATER
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * @param updater
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * @return NUMBER
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return STOREDOORIMAGE
     */
    public String getStoredoorimage() {
        return storedoorimage;
    }

    /**
     * @param storedoorimage
     */
    public void setStoredoorimage(String storedoorimage) {
        this.storedoorimage = storedoorimage;
    }

    /**
     * @return STOREMANID
     */
    public Integer getStoremanid() {
        return storemanid;
    }

    /**
     * @param storemanid
     */
    public void setStoremanid(Integer storemanid) {
        this.storemanid = storemanid;
    }

    /**
     * @return PRODUCTGROUPID
     */
    public Integer getProductgroupid() {
        return productgroupid;
    }

    /**
     * @param productgroupid
     */
    public void setProductgroupid(Integer productgroupid) {
        this.productgroupid = productgroupid;
    }

    /**
     * @return STORELOGO
     */
    public String getStorelogo() {
        return storelogo;
    }

    /**
     * @param storelogo
     */
    public void setStorelogo(String storelogo) {
        this.storelogo = storelogo;
    }

    /**
     * @return STARTTIME
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * @param starttime
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * @return CLOSINGTIME
     */
    public Date getClosingtime() {
        return closingtime;
    }

    /**
     * @param closingtime
     */
    public void setClosingtime(Date closingtime) {
        this.closingtime = closingtime;
    }

    /**
     * @return BRANDID
     */
    public Integer getBrandid() {
        return brandid;
    }

    /**
     * @param brandid
     */
    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    /**
     * @return STOREMANAGER
     */
    public String getStoremanager() {
        return storemanager;
    }

    /**
     * @param storemanager
     */
    public void setStoremanager(String storemanager) {
        this.storemanager = storemanager;
    }

    /**
     * @return STOREUSERID
     */
    public Integer getStoreuserid() {
        return storeuserid;
    }

    /**
     * @param storeuserid
     */
    public void setStoreuserid(Integer storeuserid) {
        this.storeuserid = storeuserid;
    }

    /**
     * 获取0为正常，1为关闭
     *
     * @return STORESTATUS - 0为正常，1为关闭
     */
    public Integer getStorestatus() {
        return storestatus;
    }

    /**
     * 设置0为正常，1为关闭
     *
     * @param storestatus 0为正常，1为关闭
     */
    public void setStorestatus(Integer storestatus) {
        this.storestatus = storestatus;
    }

    /**
     * @return COMPANYID
     */
    public Integer getCompanyid() {
        return companyid;
    }

    /**
     * @param companyid
     */
    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    /**
     * @return STORECIRCLE
     */
    public Integer getStorecircle() {
        return storecircle;
    }

    /**
     * @param storecircle
     */
    public void setStorecircle(Integer storecircle) {
        this.storecircle = storecircle;
    }

    /**
     * 获取此表同时可以作为部门使用，此字段用来把店用来不显示，比如顶级公司有一个默认店，用来放临时员工，不需要显示
     *
     * @return STOREISSHOW - 此表同时可以作为部门使用，此字段用来把店用来不显示，比如顶级公司有一个默认店，用来放临时员工，不需要显示
     */
    public Integer getStoreisshow() {
        return storeisshow;
    }

    /**
     * 设置此表同时可以作为部门使用，此字段用来把店用来不显示，比如顶级公司有一个默认店，用来放临时员工，不需要显示
     *
     * @param storeisshow 此表同时可以作为部门使用，此字段用来把店用来不显示，比如顶级公司有一个默认店，用来放临时员工，不需要显示
     */
    public void setStoreisshow(Integer storeisshow) {
        this.storeisshow = storeisshow;
    }

    /**
     * 获取0不可议价1可议价
     *
     * @return is_bargain - 0不可议价1可议价
     */
    public Integer getIsBargain() {
        return isBargain;
    }

    /**
     * 设置0不可议价1可议价
     *
     * @param isBargain 0不可议价1可议价
     */
    public void setIsBargain(Integer isBargain) {
        this.isBargain = isBargain;
    }

    /**
     * @return roser_time
     */
    public Date getRoserTime() {
        return roserTime;
    }

    /**
     * @param roserTime
     */
    public void setRoserTime(Date roserTime) {
        this.roserTime = roserTime;
    }

    /**
     * 获取轮排规则 1:1,2,3,4  2:1,3,4  3:2,3,4  4:3,4
     *
     * @return roster_rule - 轮排规则 1:1,2,3,4  2:1,3,4  3:2,3,4  4:3,4
     */
    public String getRosterRule() {
        return rosterRule;
    }

    /**
     * 设置轮排规则 1:1,2,3,4  2:1,3,4  3:2,3,4  4:3,4
     *
     * @param rosterRule 轮排规则 1:1,2,3,4  2:1,3,4  3:2,3,4  4:3,4
     */
    public void setRosterRule(String rosterRule) {
        this.rosterRule = rosterRule;
    }

    /**
     * 获取签退地址
     *
     * @return sign_url - 签退地址
     */
    public String getSignUrl() {
        return signUrl;
    }

    /**
     * 设置签退地址
     *
     * @param signUrl 签退地址
     */
    public void setSignUrl(String signUrl) {
        this.signUrl = signUrl;
    }

    /**
     * @return supplyCompanyId
     */
    public Integer getSupplycompanyid() {
        return supplycompanyid;
    }

    /**
     * @param supplycompanyid
     */
    public void setSupplycompanyid(Integer supplycompanyid) {
        this.supplycompanyid = supplycompanyid;
    }

    /**
     * 获取门店控制员工提现途径. 1:提工资,2:提提成,3:提补贴,4:补贴和提成.其他默认不可提
     *
     * @return salary_control - 门店控制员工提现途径. 1:提工资,2:提提成,3:提补贴,4:补贴和提成.其他默认不可提
     */
    public Integer getSalaryControl() {
        return salaryControl;
    }

    /**
     * 设置门店控制员工提现途径. 1:提工资,2:提提成,3:提补贴,4:补贴和提成.其他默认不可提
     *
     * @param salaryControl 门店控制员工提现途径. 1:提工资,2:提提成,3:提补贴,4:补贴和提成.其他默认不可提
     */
    public void setSalaryControl(Integer salaryControl) {
        this.salaryControl = salaryControl;
    }

    /**
     * 获取门店调用当面付短路控制 0:默认正常 1:如果门店存在并且状态正确直接返回成功
     *
     * @return pay_route - 门店调用当面付短路控制 0:默认正常 1:如果门店存在并且状态正确直接返回成功
     */
    public Integer getPayRoute() {
        return payRoute;
    }

    /**
     * 设置门店调用当面付短路控制 0:默认正常 1:如果门店存在并且状态正确直接返回成功
     *
     * @param payRoute 门店调用当面付短路控制 0:默认正常 1:如果门店存在并且状态正确直接返回成功
     */
    public void setPayRoute(Integer payRoute) {
        this.payRoute = payRoute;
    }

    /**
     * 获取床数
     *
     * @return bed - 床数
     */
    public Integer getBed() {
        return bed;
    }

    /**
     * 设置床数
     *
     * @param bed 床数
     */
    public void setBed(Integer bed) {
        this.bed = bed;
    }

    /**
     * 获取椅子数
     *
     * @return chair - 椅子数
     */
    public Integer getChair() {
        return chair;
    }

    /**
     * 设置椅子数
     *
     * @param chair 椅子数
     */
    public void setChair(Integer chair) {
        this.chair = chair;
    }

    /**
     * 获取桶数
     *
     * @return bucket - 桶数
     */
    public Integer getBucket() {
        return bucket;
    }

    /**
     * 设置桶数
     *
     * @param bucket 桶数
     */
    public void setBucket(Integer bucket) {
        this.bucket = bucket;
    }

    /**
     * 获取房间数
     *
     * @return room - 房间数
     */
    public Integer getRoom() {
        return room;
    }

    /**
     * 设置房间数
     *
     * @param room 房间数
     */
    public void setRoom(Integer room) {
        this.room = room;
    }

    /**
     * 获取是否接受项目下发，0：不允许，1：允许
     *
     * @return distribution_permit - 是否接受项目下发，0：不允许，1：允许
     */
    public Integer getDistributionPermit() {
        return distributionPermit;
    }

    /**
     * 设置是否接受项目下发，0：不允许，1：允许
     *
     * @param distributionPermit 是否接受项目下发，0：不允许，1：允许
     */
    public void setDistributionPermit(Integer distributionPermit) {
        this.distributionPermit = distributionPermit;
    }

    /**
     * @return STOREIMAGE
     */
    public String getStoreimage() {
        return storeimage;
    }

    /**
     * @param storeimage
     */
    public void setStoreimage(String storeimage) {
        this.storeimage = storeimage;
    }

    /**
     * @return roser1
     */
    public String getRoser1() {
        return roser1;
    }

    /**
     * @param roser1
     */
    public void setRoser1(String roser1) {
        this.roser1 = roser1;
    }

    /**
     * @return roser2
     */
    public String getRoser2() {
        return roser2;
    }

    /**
     * @param roser2
     */
    public void setRoser2(String roser2) {
        this.roser2 = roser2;
    }

    /**
     * @return roser3
     */
    public String getRoser3() {
        return roser3;
    }

    /**
     * @param roser3
     */
    public void setRoser3(String roser3) {
        this.roser3 = roser3;
    }

    /**
     * @return roser4
     */
    public String getRoser4() {
        return roser4;
    }

    /**
     * @param roser4
     */
    public void setRoser4(String roser4) {
        this.roser4 = roser4;
    }

    /**
     * @return roser5
     */
    public String getRoser5() {
        return roser5;
    }

    /**
     * @param roser5
     */
    public void setRoser5(String roser5) {
        this.roser5 = roser5;
    }
}