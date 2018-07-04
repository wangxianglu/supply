package com.dianmei.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bm_company")
public class Company {
    @Id
    @Column(name = "COMPANYID")
    private Integer companyid;

    @Column(name = "SHORTNAME")
    private String shortname;

    @Column(name = "COMPANYNAME")
    private String companyname;

    @Column(name = "COMENGNAME")
    private String comengname;

    @Column(name = "PARENTID")
    private Integer parentid;

    @Column(name = "into_s3")
    private Boolean intoS3;

    /**
     * 通过品牌确定公司业务的机构
     */
    @Column(name = "BRANDID")
    private Integer brandid;

    private Integer status;

    /**
     * 1,为理发连锁公司，2，用户公司，3,为商品供应商 , 4,为媒体， 5，为频道；
     */
    @Column(name = "COMPANYTYPE")
    private Integer companytype;

    /**
     * 公司的级别，与parantid，体现公司的上下级关系
     */
    @Column(name = "COMPANYLEVEL")
    private Integer companylevel;

    @Column(name = "CODE")
    private String code;

    /**
     * 0不可改价1可改价
     */
    @Column(name = "is_bargain")
    private Integer isBargain;

    @Column(name = "VERSION")
    private Long version;

    @Column(name = "CREATEDATE")
    private Date createdate;

    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "UPDATEDATE")
    private Date updatedate;

    @Column(name = "UPDATER")
    private String updater;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "ENGLISHNAME")
    private String englishname;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "INVOICEADDRESS")
    private String invoiceaddress;

    @Column(name = "COMLICENSE")
    private String comlicense;

    @Column(name = "TAXATION")
    private String taxation;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PRINCIPAL")
    private String principal;

    @Column(name = "COMPROVINCE")
    private Integer comprovince;

    @Column(name = "COMCITY")
    private Integer comcity;

    @Column(name = "COMDISTRICT")
    private Integer comdistrict;

    @Column(name = "COMADDRESS")
    private String comaddress;

    @Column(name = "COMAREACODE")
    private String comareacode;

    @Column(name = "COMPANYLOGO")
    private String companylogo;

    @Column(name = "PRODUCTGROUPID")
    private Integer productgroupid;

    /**
     * 管理员用户ID
     */
    @Column(name = "ADMINID")
    private Integer adminid;

    /**
     * 系统认定的公司级别，用来给予什么政策
     */
    @Column(name = "COMSYSLEVEL")
    private Integer comsyslevel;

    /**
     * 价格表使用的公司ID，用来快速索引产品价格
     */
    @Column(name = "PRODUCTCOMID")
    private Integer productcomid;

    @Column(name = "supplyCompanyId")
    private Integer supplycompanyid;

    /**
     * 公司网址
     */
    private String website;

    /**
     * 公司法人
     */
    private String legalperson;

    /**
     * 税号
     */
    private String dutysign;

    /**
     * 执照
     */
    private String license;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 对应职位
     */
    private Integer companyrankid;

    /**
     * 联系人电话
     */
    private String contactsphone;

    /**
     * 联系人邮箱
     */
    private String contactsemail;

    /**
     * 联系人微信
     */
    private String contactswechat;

    private String businesshours;

    /**
     * 是否接受项目下发，0：不允许，1：允许
     */
    @Column(name = "distribution_permit")
    private Integer distributionPermit;

    @Column(name = "MEMO")
    private String memo;

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
     * @return SHORTNAME
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * @param shortname
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    /**
     * @return COMPANYNAME
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * @param companyname
     */
    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    /**
     * @return COMENGNAME
     */
    public String getComengname() {
        return comengname;
    }

    /**
     * @param comengname
     */
    public void setComengname(String comengname) {
        this.comengname = comengname;
    }

    /**
     * @return PARENTID
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * @param parentid
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * @return into_s3
     */
    public Boolean getIntoS3() {
        return intoS3;
    }

    /**
     * @param intoS3
     */
    public void setIntoS3(Boolean intoS3) {
        this.intoS3 = intoS3;
    }

    /**
     * 获取通过品牌确定公司业务的机构
     *
     * @return BRANDID - 通过品牌确定公司业务的机构
     */
    public Integer getBrandid() {
        return brandid;
    }

    /**
     * 设置通过品牌确定公司业务的机构
     *
     * @param brandid 通过品牌确定公司业务的机构
     */
    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取1,为理发连锁公司，2，用户公司，3,为商品供应商 , 4,为媒体， 5，为频道；
     *
     * @return COMPANYTYPE - 1,为理发连锁公司，2，用户公司，3,为商品供应商 , 4,为媒体， 5，为频道；
     */
    public Integer getCompanytype() {
        return companytype;
    }

    /**
     * 设置1,为理发连锁公司，2，用户公司，3,为商品供应商 , 4,为媒体， 5，为频道；
     *
     * @param companytype 1,为理发连锁公司，2，用户公司，3,为商品供应商 , 4,为媒体， 5，为频道；
     */
    public void setCompanytype(Integer companytype) {
        this.companytype = companytype;
    }

    /**
     * 获取公司的级别，与parantid，体现公司的上下级关系
     *
     * @return COMPANYLEVEL - 公司的级别，与parantid，体现公司的上下级关系
     */
    public Integer getCompanylevel() {
        return companylevel;
    }

    /**
     * 设置公司的级别，与parantid，体现公司的上下级关系
     *
     * @param companylevel 公司的级别，与parantid，体现公司的上下级关系
     */
    public void setCompanylevel(Integer companylevel) {
        this.companylevel = companylevel;
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
     * 获取0不可改价1可改价
     *
     * @return is_bargain - 0不可改价1可改价
     */
    public Integer getIsBargain() {
        return isBargain;
    }

    /**
     * 设置0不可改价1可改价
     *
     * @param isBargain 0不可改价1可改价
     */
    public void setIsBargain(Integer isBargain) {
        this.isBargain = isBargain;
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
     * @return ENGLISHNAME
     */
    public String getEnglishname() {
        return englishname;
    }

    /**
     * @param englishname
     */
    public void setEnglishname(String englishname) {
        this.englishname = englishname;
    }

    /**
     * @return PHONE
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return FAX
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return INVOICEADDRESS
     */
    public String getInvoiceaddress() {
        return invoiceaddress;
    }

    /**
     * @param invoiceaddress
     */
    public void setInvoiceaddress(String invoiceaddress) {
        this.invoiceaddress = invoiceaddress;
    }

    /**
     * @return COMLICENSE
     */
    public String getComlicense() {
        return comlicense;
    }

    /**
     * @param comlicense
     */
    public void setComlicense(String comlicense) {
        this.comlicense = comlicense;
    }

    /**
     * @return TAXATION
     */
    public String getTaxation() {
        return taxation;
    }

    /**
     * @param taxation
     */
    public void setTaxation(String taxation) {
        this.taxation = taxation;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return PRINCIPAL
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * @param principal
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * @return COMPROVINCE
     */
    public Integer getComprovince() {
        return comprovince;
    }

    /**
     * @param comprovince
     */
    public void setComprovince(Integer comprovince) {
        this.comprovince = comprovince;
    }

    /**
     * @return COMCITY
     */
    public Integer getComcity() {
        return comcity;
    }

    /**
     * @param comcity
     */
    public void setComcity(Integer comcity) {
        this.comcity = comcity;
    }

    /**
     * @return COMDISTRICT
     */
    public Integer getComdistrict() {
        return comdistrict;
    }

    /**
     * @param comdistrict
     */
    public void setComdistrict(Integer comdistrict) {
        this.comdistrict = comdistrict;
    }

    /**
     * @return COMADDRESS
     */
    public String getComaddress() {
        return comaddress;
    }

    /**
     * @param comaddress
     */
    public void setComaddress(String comaddress) {
        this.comaddress = comaddress;
    }

    /**
     * @return COMAREACODE
     */
    public String getComareacode() {
        return comareacode;
    }

    /**
     * @param comareacode
     */
    public void setComareacode(String comareacode) {
        this.comareacode = comareacode;
    }

    /**
     * @return COMPANYLOGO
     */
    public String getCompanylogo() {
        return companylogo;
    }

    /**
     * @param companylogo
     */
    public void setCompanylogo(String companylogo) {
        this.companylogo = companylogo;
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
     * 获取管理员用户ID
     *
     * @return ADMINID - 管理员用户ID
     */
    public Integer getAdminid() {
        return adminid;
    }

    /**
     * 设置管理员用户ID
     *
     * @param adminid 管理员用户ID
     */
    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    /**
     * 获取系统认定的公司级别，用来给予什么政策
     *
     * @return COMSYSLEVEL - 系统认定的公司级别，用来给予什么政策
     */
    public Integer getComsyslevel() {
        return comsyslevel;
    }

    /**
     * 设置系统认定的公司级别，用来给予什么政策
     *
     * @param comsyslevel 系统认定的公司级别，用来给予什么政策
     */
    public void setComsyslevel(Integer comsyslevel) {
        this.comsyslevel = comsyslevel;
    }

    /**
     * 获取价格表使用的公司ID，用来快速索引产品价格
     *
     * @return PRODUCTCOMID - 价格表使用的公司ID，用来快速索引产品价格
     */
    public Integer getProductcomid() {
        return productcomid;
    }

    /**
     * 设置价格表使用的公司ID，用来快速索引产品价格
     *
     * @param productcomid 价格表使用的公司ID，用来快速索引产品价格
     */
    public void setProductcomid(Integer productcomid) {
        this.productcomid = productcomid;
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
     * 获取公司网址
     *
     * @return website - 公司网址
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 设置公司网址
     *
     * @param website 公司网址
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * 获取公司法人
     *
     * @return legalperson - 公司法人
     */
    public String getLegalperson() {
        return legalperson;
    }

    /**
     * 设置公司法人
     *
     * @param legalperson 公司法人
     */
    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    /**
     * 获取税号
     *
     * @return dutysign - 税号
     */
    public String getDutysign() {
        return dutysign;
    }

    /**
     * 设置税号
     *
     * @param dutysign 税号
     */
    public void setDutysign(String dutysign) {
        this.dutysign = dutysign;
    }

    /**
     * 获取执照
     *
     * @return license - 执照
     */
    public String getLicense() {
        return license;
    }

    /**
     * 设置执照
     *
     * @param license 执照
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * 获取联系人
     *
     * @return contacts - 联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置联系人
     *
     * @param contacts 联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取对应职位
     *
     * @return companyrankid - 对应职位
     */
    public Integer getCompanyrankid() {
        return companyrankid;
    }

    /**
     * 设置对应职位
     *
     * @param companyrankid 对应职位
     */
    public void setCompanyrankid(Integer companyrankid) {
        this.companyrankid = companyrankid;
    }

    /**
     * 获取联系人电话
     *
     * @return contactsphone - 联系人电话
     */
    public String getContactsphone() {
        return contactsphone;
    }

    /**
     * 设置联系人电话
     *
     * @param contactsphone 联系人电话
     */
    public void setContactsphone(String contactsphone) {
        this.contactsphone = contactsphone;
    }

    /**
     * 获取联系人邮箱
     *
     * @return contactsemail - 联系人邮箱
     */
    public String getContactsemail() {
        return contactsemail;
    }

    /**
     * 设置联系人邮箱
     *
     * @param contactsemail 联系人邮箱
     */
    public void setContactsemail(String contactsemail) {
        this.contactsemail = contactsemail;
    }

    /**
     * 获取联系人微信
     *
     * @return contactswechat - 联系人微信
     */
    public String getContactswechat() {
        return contactswechat;
    }

    /**
     * 设置联系人微信
     *
     * @param contactswechat 联系人微信
     */
    public void setContactswechat(String contactswechat) {
        this.contactswechat = contactswechat;
    }

    /**
     * @return businesshours
     */
    public String getBusinesshours() {
        return businesshours;
    }

    /**
     * @param businesshours
     */
    public void setBusinesshours(String businesshours) {
        this.businesshours = businesshours;
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
}