package com.dianmei.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sm_staff")
public class Staff {
    @Id
    @Column(name = "STAFFINFOID")
    private Long id;

    @Column(name = "STAFFID")
    private Integer userId;

    @Column(name = "STAFFICO")
    private String staffico;

    /**
     * 员工真实名字
     */
    @Column(name = "STAFFNAME")
    private String staffname;

    @Column(name = "STAFFNICKNAME")
    private String staffnickname;

    @Column(name = "STAFFONLY")
    private String staffonly;

    /**
     * 员工编号
     */
    @Column(name = "STAFFNUMBER")
    private String staffnumber;

    /**
     * 员工余额
     */
    @Column(name = "account_balance")
    private BigDecimal accountBalance;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "COMPANYID")
    private Integer companyid;

    @Column(name = "STOREID")
    private Integer storeid;

    /**
     * 门店名称
     */
    @Column(name = "store_name")
    private String storeName;

    /**
     * 门店地址
     */
    @Column(name = "store_address")
    private String storeAddress;

    @Column(name = "HIREDTYPE")
    private String hiredtype;

    /**
     * 此处时间必须操作
     */
    @Column(name = "ARRIVEDATE")
    private Date arrivedate;

    @Column(name = "LEAVEDATE")
    private Date leavedate;

    @Column(name = "EXTENSION")
    private String extension;

    @Column(name = "CERTIFICATE")
    private String certificate;

    @Column(name = "COMPANYRANKNAME")
    private String companyrankname;

    /**
     * 员工所在公司的职级
     */
    @Column(name = "COMPANYRANKID")
    private Long companyrankid;

    /**
     * 员工在大头娃娃的总的级别职务
     */
    @Column(name = "RANKID")
    private Integer rankid;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "WECHAT")
    private String wechat;

    @Column(name = "WEIBO")
    private String weibo;

    @Column(name = "QQ")
    private String qq;

    /**
     * 性别
     */
    @Column(name = "GENDER")
    private Byte gender;

    /**
     * 出生年月日，此处不能用时间格式
     */
    @Column(name = "BIRTHDAY")
    private Date birthday;

    /**
     * 身份证
     */
    @Column(name = "IDCARD")
    private String idcard;

    /**
     * 0，不属于任何店 1\为可预约，2为休息，9为管理者
     */
    @Column(name = "STAFFSTATUS")
    private Integer staffstatus;

    /**
     * 员工的服务大类ID
     */
    @Column(name = "PTYPEID")
    private Integer ptypeid;

    @Column(name = "STARS")
    private Integer stars;

    @Column(name = "STARSA")
    private Integer starsa;

    @Column(name = "STARSB")
    private Integer starsb;

    @Column(name = "STARSC")
    private Integer starsc;

    @Column(name = "STARSD")
    private Integer starsd;

    /**
     * 获奖情况
     */
    @Column(name = "WINNING")
    private String winning;

    /**
     * 擅长
     */
    @Column(name = "SPECIALTY")
    private String specialty;

    /**
     * 店铺排名
     */
    @Column(name = "RANKINGINSTORE")
    private Integer rankinginstore;

    /**
     * 总排名
     */
    @Column(name = "RANKINGINAPP")
    private Integer rankinginapp;

    /**
     * 行业经验年数
     */
    @Column(name = "SPECIALITYYEARS")
    private Integer specialityyears;

    /**
     * 1为放置到首页
     */
    @Column(name = "PROMPLACE")
    private Integer promplace;

    @Column(name = "USERLNG")
    private String userlng;

    @Column(name = "USERLAT")
    private String userlat;

    /**
     * 所属区域
     */
    @Column(name = "USERDIS")
    private String userdis;

    @Column(name = "UPVOTES")
    private Integer upvotes;

    @Column(name = "STAFFLOGO")
    private String stafflogo;

    /**
     * 是否显示
     */
    @Column(name = "ENABLE")
    private Integer enable;

    /**
     * 品牌
     */
    @Column(name = "brand_id")
    private Integer brandId;

    /**
     * 接单次数
     */
    @Column(name = "orders_number")
    private Integer ordersNumber;

    /**
     * 价格区间
     */
    @Column(name = "starting_price")
    private Long startingPrice;

    /**
     * 排班
     */
    private String roster;

    @Column(name = "CODE")
    private String code;

    @Column(name = "VERSION")
    private Long version;

    @Column(name = "CREATEDATE")
    private Date createdate;

    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "UPDATEDATE")
    private Date updatedate;

    @Column(name = "UPDATOR")
    private String updator;

    @Column(name = "MEMO")
    private String memo;

    /**
     * 签到签退 1 签到 2签退
     */
    @Column(name = "check_in_out")
    private Integer checkInOut;

    /**
     * check 时间
     */
    @Column(name = "check_time")
    private Date checkTime;

    /**
     * 银行卡开户名
     */
    @Column(name = "account_name")
    private String accountName;

    /**
     * 银行卡号
     */
    @Column(name = "card_number")
    private String cardNumber;

    /**
     * 开户行所在地ID
     */
    @Column(name = "bank_area_id")
    private Integer bankAreaId;

    /**
     * 开户行名称
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 0，未设定 1高中，2大专，3 本科
     */
    @Column(name = "educational_background")
    private Integer educationalBackground;

    /**
     * 健康证号
     */
    @Column(name = "health_no")
    private String healthNo;

    /**
     * 健康证有效期 此处不能用时间格式
     */
    @Column(name = "health_time")
    private Date healthTime;

    /**
     * 使用银行卡类型 0，未设定 
     */
    private Integer usebanktype;

    /**
     * 银行卡号 
     */
    private String usecreditcardno;

    /**
     * 身份证地址 
     */
    private String idcardaddress;

    /**
     * 紧急联系人姓名 
     */
    private String contactsname;

    /**
     * 紧急联系人电话 
     */
    private String contactsphone;

    /**
     * 紧急联系人地址 
     */
    private String contactsaddress;

    /**
     * 基本工资
     */
    private Long basesalary;

    /**
     * 0，税前 1税后
     */
    private Integer salarytype;

    /**
     * 保底工资
     */
    private BigDecimal guaranteedsalary;

    /**
     * 保底截止日期 此处不能用时间格式
     */
    private Date guaranteeddate;

    /**
     * 合同有效期 此处不能用时间格式
     */
    @Column(name = "contract_time")
    private Date contractTime;

    /**
     * 介绍人 
     */
    private String introducer;

    /**
     * 员工级别
     */
    private Integer stafflevel;

    /**
     * 业绩方式
     */
    private Integer performancetype;

    /**
     * 业绩比率
     */
    private BigDecimal performancerate;

    /**
     * 店内职位称呼 
     */
    private String positiontitle;

    /**
     * 黑名单标记 0 否 1 是 
     */
    private Integer blacklistflag;

    /**
     * //银行预留手机号
     */
    @Column(name = "reservation_phone")
    private String reservationPhone;

    @Column(name = "is_star")
    private Integer isStar;

    /**
     * 员工身份证照
     */
    @Column(name = "idCard_url")
    private String idcardUrl;

    /**
     * 显示门店
     */
    @Column(name = "showStore")
    private String showstore;

    /**
     * 记录更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 培训学校系统中的员工ID
     */
    @Column(name = "school_wid")
    private String schoolWid;

    @Column(name = "INTRODUCTION")
    private String introduction;

    /**
     * 形象照图片组
     */
    @Column(name = "STAFFLOGO_GROUP")
    private String stafflogoGroup;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return STAFFICO
     */
    public String getStaffico() {
        return staffico;
    }

    /**
     * @param staffico
     */
    public void setStaffico(String staffico) {
        this.staffico = staffico;
    }

    /**
     * 获取员工真实名字
     *
     * @return STAFFNAME - 员工真实名字
     */
    public String getStaffname() {
        return staffname;
    }

    /**
     * 设置员工真实名字
     *
     * @param staffname 员工真实名字
     */
    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    /**
     * @return STAFFNICKNAME
     */
    public String getStaffnickname() {
        return staffnickname;
    }

    /**
     * @param staffnickname
     */
    public void setStaffnickname(String staffnickname) {
        this.staffnickname = staffnickname;
    }

    /**
     * @return STAFFONLY
     */
    public String getStaffonly() {
        return staffonly;
    }

    /**
     * @param staffonly
     */
    public void setStaffonly(String staffonly) {
        this.staffonly = staffonly;
    }

    /**
     * 获取员工编号
     *
     * @return STAFFNUMBER - 员工编号
     */
    public String getStaffnumber() {
        return staffnumber;
    }

    /**
     * 设置员工编号
     *
     * @param staffnumber 员工编号
     */
    public void setStaffnumber(String staffnumber) {
        this.staffnumber = staffnumber;
    }

    /**
     * 获取员工余额
     *
     * @return account_balance - 员工余额
     */
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    /**
     * 设置员工余额
     *
     * @param accountBalance 员工余额
     */
    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
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
     * 获取门店名称
     *
     * @return store_name - 门店名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 设置门店名称
     *
     * @param storeName 门店名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * 获取门店地址
     *
     * @return store_address - 门店地址
     */
    public String getStoreAddress() {
        return storeAddress;
    }

    /**
     * 设置门店地址
     *
     * @param storeAddress 门店地址
     */
    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    /**
     * @return HIREDTYPE
     */
    public String getHiredtype() {
        return hiredtype;
    }

    /**
     * @param hiredtype
     */
    public void setHiredtype(String hiredtype) {
        this.hiredtype = hiredtype;
    }

    /**
     * 获取此处时间必须操作
     *
     * @return ARRIVEDATE - 此处时间必须操作
     */
    public Date getArrivedate() {
        return arrivedate;
    }

    /**
     * 设置此处时间必须操作
     *
     * @param arrivedate 此处时间必须操作
     */
    public void setArrivedate(Date arrivedate) {
        this.arrivedate = arrivedate;
    }

    /**
     * @return LEAVEDATE
     */
    public Date getLeavedate() {
        return leavedate;
    }

    /**
     * @param leavedate
     */
    public void setLeavedate(Date leavedate) {
        this.leavedate = leavedate;
    }

    /**
     * @return EXTENSION
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @param extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * @return CERTIFICATE
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * @param certificate
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * @return COMPANYRANKNAME
     */
    public String getCompanyrankname() {
        return companyrankname;
    }

    /**
     * @param companyrankname
     */
    public void setCompanyrankname(String companyrankname) {
        this.companyrankname = companyrankname;
    }

    /**
     * 获取员工所在公司的职级
     *
     * @return COMPANYRANKID - 员工所在公司的职级
     */
    public Long getCompanyrankid() {
        return companyrankid;
    }

    /**
     * 设置员工所在公司的职级
     *
     * @param companyrankid 员工所在公司的职级
     */
    public void setCompanyrankid(Long companyrankid) {
        this.companyrankid = companyrankid;
    }

    /**
     * 获取员工在大头娃娃的总的级别职务
     *
     * @return RANKID - 员工在大头娃娃的总的级别职务
     */
    public Integer getRankid() {
        return rankid;
    }

    /**
     * 设置员工在大头娃娃的总的级别职务
     *
     * @param rankid 员工在大头娃娃的总的级别职务
     */
    public void setRankid(Integer rankid) {
        this.rankid = rankid;
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
     * @return WECHAT
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * @param wechat
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * @return WEIBO
     */
    public String getWeibo() {
        return weibo;
    }

    /**
     * @param weibo
     */
    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    /**
     * @return QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * @param qq
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取性别
     *
     * @return GENDER - 性别
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * 获取出生年月日，此处不能用时间格式
     *
     * @return BIRTHDAY - 出生年月日，此处不能用时间格式
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生年月日，此处不能用时间格式
     *
     * @param birthday 出生年月日，此处不能用时间格式
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取身份证
     *
     * @return IDCARD - 身份证
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置身份证
     *
     * @param idcard 身份证
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取0，不属于任何店 1\为可预约，2为休息，9为管理者
     *
     * @return STAFFSTATUS - 0，不属于任何店 1\为可预约，2为休息，9为管理者
     */
    public Integer getStaffstatus() {
        return staffstatus;
    }

    /**
     * 设置0，不属于任何店 1\为可预约，2为休息，9为管理者
     *
     * @param staffstatus 0，不属于任何店 1\为可预约，2为休息，9为管理者
     */
    public void setStaffstatus(Integer staffstatus) {
        this.staffstatus = staffstatus;
    }

    /**
     * 获取员工的服务大类ID
     *
     * @return PTYPEID - 员工的服务大类ID
     */
    public Integer getPtypeid() {
        return ptypeid;
    }

    /**
     * 设置员工的服务大类ID
     *
     * @param ptypeid 员工的服务大类ID
     */
    public void setPtypeid(Integer ptypeid) {
        this.ptypeid = ptypeid;
    }

    /**
     * @return STARS
     */
    public Integer getStars() {
        return stars;
    }

    /**
     * @param stars
     */
    public void setStars(Integer stars) {
        this.stars = stars;
    }

    /**
     * @return STARSA
     */
    public Integer getStarsa() {
        return starsa;
    }

    /**
     * @param starsa
     */
    public void setStarsa(Integer starsa) {
        this.starsa = starsa;
    }

    /**
     * @return STARSB
     */
    public Integer getStarsb() {
        return starsb;
    }

    /**
     * @param starsb
     */
    public void setStarsb(Integer starsb) {
        this.starsb = starsb;
    }

    /**
     * @return STARSC
     */
    public Integer getStarsc() {
        return starsc;
    }

    /**
     * @param starsc
     */
    public void setStarsc(Integer starsc) {
        this.starsc = starsc;
    }

    /**
     * @return STARSD
     */
    public Integer getStarsd() {
        return starsd;
    }

    /**
     * @param starsd
     */
    public void setStarsd(Integer starsd) {
        this.starsd = starsd;
    }

    /**
     * 获取获奖情况
     *
     * @return WINNING - 获奖情况
     */
    public String getWinning() {
        return winning;
    }

    /**
     * 设置获奖情况
     *
     * @param winning 获奖情况
     */
    public void setWinning(String winning) {
        this.winning = winning;
    }

    /**
     * 获取擅长
     *
     * @return SPECIALTY - 擅长
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * 设置擅长
     *
     * @param specialty 擅长
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * 获取店铺排名
     *
     * @return RANKINGINSTORE - 店铺排名
     */
    public Integer getRankinginstore() {
        return rankinginstore;
    }

    /**
     * 设置店铺排名
     *
     * @param rankinginstore 店铺排名
     */
    public void setRankinginstore(Integer rankinginstore) {
        this.rankinginstore = rankinginstore;
    }

    /**
     * 获取总排名
     *
     * @return RANKINGINAPP - 总排名
     */
    public Integer getRankinginapp() {
        return rankinginapp;
    }

    /**
     * 设置总排名
     *
     * @param rankinginapp 总排名
     */
    public void setRankinginapp(Integer rankinginapp) {
        this.rankinginapp = rankinginapp;
    }

    /**
     * 获取行业经验年数
     *
     * @return SPECIALITYYEARS - 行业经验年数
     */
    public Integer getSpecialityyears() {
        return specialityyears;
    }

    /**
     * 设置行业经验年数
     *
     * @param specialityyears 行业经验年数
     */
    public void setSpecialityyears(Integer specialityyears) {
        this.specialityyears = specialityyears;
    }

    /**
     * 获取1为放置到首页
     *
     * @return PROMPLACE - 1为放置到首页
     */
    public Integer getPromplace() {
        return promplace;
    }

    /**
     * 设置1为放置到首页
     *
     * @param promplace 1为放置到首页
     */
    public void setPromplace(Integer promplace) {
        this.promplace = promplace;
    }

    /**
     * @return USERLNG
     */
    public String getUserlng() {
        return userlng;
    }

    /**
     * @param userlng
     */
    public void setUserlng(String userlng) {
        this.userlng = userlng;
    }

    /**
     * @return USERLAT
     */
    public String getUserlat() {
        return userlat;
    }

    /**
     * @param userlat
     */
    public void setUserlat(String userlat) {
        this.userlat = userlat;
    }

    /**
     * 获取所属区域
     *
     * @return USERDIS - 所属区域
     */
    public String getUserdis() {
        return userdis;
    }

    /**
     * 设置所属区域
     *
     * @param userdis 所属区域
     */
    public void setUserdis(String userdis) {
        this.userdis = userdis;
    }

    /**
     * @return UPVOTES
     */
    public Integer getUpvotes() {
        return upvotes;
    }

    /**
     * @param upvotes
     */
    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    /**
     * @return STAFFLOGO
     */
    public String getStafflogo() {
        return stafflogo;
    }

    /**
     * @param stafflogo
     */
    public void setStafflogo(String stafflogo) {
        this.stafflogo = stafflogo;
    }

    /**
     * 获取是否显示
     *
     * @return ENABLE - 是否显示
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * 设置是否显示
     *
     * @param enable 是否显示
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * 获取品牌
     *
     * @return brand_id - 品牌
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 设置品牌
     *
     * @param brandId 品牌
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取接单次数
     *
     * @return orders_number - 接单次数
     */
    public Integer getOrdersNumber() {
        return ordersNumber;
    }

    /**
     * 设置接单次数
     *
     * @param ordersNumber 接单次数
     */
    public void setOrdersNumber(Integer ordersNumber) {
        this.ordersNumber = ordersNumber;
    }

    /**
     * 获取价格区间
     *
     * @return starting_price - 价格区间
     */
    public Long getStartingPrice() {
        return startingPrice;
    }

    /**
     * 设置价格区间
     *
     * @param startingPrice 价格区间
     */
    public void setStartingPrice(Long startingPrice) {
        this.startingPrice = startingPrice;
    }

    /**
     * 获取排班
     *
     * @return roster - 排班
     */
    public String getRoster() {
        return roster;
    }

    /**
     * 设置排班
     *
     * @param roster 排班
     */
    public void setRoster(String roster) {
        this.roster = roster;
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
     * @return UPDATOR
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * @param updator
     */
    public void setUpdator(String updator) {
        this.updator = updator;
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
     * 获取签到签退 1 签到 2签退
     *
     * @return check_in_out - 签到签退 1 签到 2签退
     */
    public Integer getCheckInOut() {
        return checkInOut;
    }

    /**
     * 设置签到签退 1 签到 2签退
     *
     * @param checkInOut 签到签退 1 签到 2签退
     */
    public void setCheckInOut(Integer checkInOut) {
        this.checkInOut = checkInOut;
    }

    /**
     * 获取check 时间
     *
     * @return check_time - check 时间
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * 设置check 时间
     *
     * @param checkTime check 时间
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * 获取银行卡开户名
     *
     * @return account_name - 银行卡开户名
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置银行卡开户名
     *
     * @param accountName 银行卡开户名
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取银行卡号
     *
     * @return card_number - 银行卡号
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * 设置银行卡号
     *
     * @param cardNumber 银行卡号
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * 获取开户行所在地ID
     *
     * @return bank_area_id - 开户行所在地ID
     */
    public Integer getBankAreaId() {
        return bankAreaId;
    }

    /**
     * 设置开户行所在地ID
     *
     * @param bankAreaId 开户行所在地ID
     */
    public void setBankAreaId(Integer bankAreaId) {
        this.bankAreaId = bankAreaId;
    }

    /**
     * 获取开户行名称
     *
     * @return bank_name - 开户行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置开户行名称
     *
     * @param bankName 开户行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取0，未设定 1高中，2大专，3 本科
     *
     * @return educational_background - 0，未设定 1高中，2大专，3 本科
     */
    public Integer getEducationalBackground() {
        return educationalBackground;
    }

    /**
     * 设置0，未设定 1高中，2大专，3 本科
     *
     * @param educationalBackground 0，未设定 1高中，2大专，3 本科
     */
    public void setEducationalBackground(Integer educationalBackground) {
        this.educationalBackground = educationalBackground;
    }

    /**
     * 获取健康证号
     *
     * @return health_no - 健康证号
     */
    public String getHealthNo() {
        return healthNo;
    }

    /**
     * 设置健康证号
     *
     * @param healthNo 健康证号
     */
    public void setHealthNo(String healthNo) {
        this.healthNo = healthNo;
    }

    /**
     * 获取健康证有效期 此处不能用时间格式
     *
     * @return health_time - 健康证有效期 此处不能用时间格式
     */
    public Date getHealthTime() {
        return healthTime;
    }

    /**
     * 设置健康证有效期 此处不能用时间格式
     *
     * @param healthTime 健康证有效期 此处不能用时间格式
     */
    public void setHealthTime(Date healthTime) {
        this.healthTime = healthTime;
    }

    /**
     * 获取使用银行卡类型 0，未设定 
     *
     * @return usebanktype - 使用银行卡类型 0，未设定 
     */
    public Integer getUsebanktype() {
        return usebanktype;
    }

    /**
     * 设置使用银行卡类型 0，未设定 
     *
     * @param usebanktype 使用银行卡类型 0，未设定 
     */
    public void setUsebanktype(Integer usebanktype) {
        this.usebanktype = usebanktype;
    }

    /**
     * 获取银行卡号 
     *
     * @return usecreditcardno - 银行卡号 
     */
    public String getUsecreditcardno() {
        return usecreditcardno;
    }

    /**
     * 设置银行卡号 
     *
     * @param usecreditcardno 银行卡号 
     */
    public void setUsecreditcardno(String usecreditcardno) {
        this.usecreditcardno = usecreditcardno;
    }

    /**
     * 获取身份证地址 
     *
     * @return idcardaddress - 身份证地址 
     */
    public String getIdcardaddress() {
        return idcardaddress;
    }

    /**
     * 设置身份证地址 
     *
     * @param idcardaddress 身份证地址 
     */
    public void setIdcardaddress(String idcardaddress) {
        this.idcardaddress = idcardaddress;
    }

    /**
     * 获取紧急联系人姓名 
     *
     * @return contactsname - 紧急联系人姓名 
     */
    public String getContactsname() {
        return contactsname;
    }

    /**
     * 设置紧急联系人姓名 
     *
     * @param contactsname 紧急联系人姓名 
     */
    public void setContactsname(String contactsname) {
        this.contactsname = contactsname;
    }

    /**
     * 获取紧急联系人电话 
     *
     * @return contactsphone - 紧急联系人电话 
     */
    public String getContactsphone() {
        return contactsphone;
    }

    /**
     * 设置紧急联系人电话 
     *
     * @param contactsphone 紧急联系人电话 
     */
    public void setContactsphone(String contactsphone) {
        this.contactsphone = contactsphone;
    }

    /**
     * 获取紧急联系人地址 
     *
     * @return contactsaddress - 紧急联系人地址 
     */
    public String getContactsaddress() {
        return contactsaddress;
    }

    /**
     * 设置紧急联系人地址 
     *
     * @param contactsaddress 紧急联系人地址 
     */
    public void setContactsaddress(String contactsaddress) {
        this.contactsaddress = contactsaddress;
    }

    /**
     * 获取基本工资
     *
     * @return basesalary - 基本工资
     */
    public Long getBasesalary() {
        return basesalary;
    }

    /**
     * 设置基本工资
     *
     * @param basesalary 基本工资
     */
    public void setBasesalary(Long basesalary) {
        this.basesalary = basesalary;
    }

    /**
     * 获取0，税前 1税后
     *
     * @return salarytype - 0，税前 1税后
     */
    public Integer getSalarytype() {
        return salarytype;
    }

    /**
     * 设置0，税前 1税后
     *
     * @param salarytype 0，税前 1税后
     */
    public void setSalarytype(Integer salarytype) {
        this.salarytype = salarytype;
    }

    /**
     * 获取保底工资
     *
     * @return guaranteedsalary - 保底工资
     */
    public BigDecimal getGuaranteedsalary() {
        return guaranteedsalary;
    }

    /**
     * 设置保底工资
     *
     * @param guaranteedsalary 保底工资
     */
    public void setGuaranteedsalary(BigDecimal guaranteedsalary) {
        this.guaranteedsalary = guaranteedsalary;
    }

    /**
     * 获取保底截止日期 此处不能用时间格式
     *
     * @return guaranteeddate - 保底截止日期 此处不能用时间格式
     */
    public Date getGuaranteeddate() {
        return guaranteeddate;
    }

    /**
     * 设置保底截止日期 此处不能用时间格式
     *
     * @param guaranteeddate 保底截止日期 此处不能用时间格式
     */
    public void setGuaranteeddate(Date guaranteeddate) {
        this.guaranteeddate = guaranteeddate;
    }

    /**
     * 获取合同有效期 此处不能用时间格式
     *
     * @return contract_time - 合同有效期 此处不能用时间格式
     */
    public Date getContractTime() {
        return contractTime;
    }

    /**
     * 设置合同有效期 此处不能用时间格式
     *
     * @param contractTime 合同有效期 此处不能用时间格式
     */
    public void setContractTime(Date contractTime) {
        this.contractTime = contractTime;
    }

    /**
     * 获取介绍人 
     *
     * @return introducer - 介绍人 
     */
    public String getIntroducer() {
        return introducer;
    }

    /**
     * 设置介绍人 
     *
     * @param introducer 介绍人 
     */
    public void setIntroducer(String introducer) {
        this.introducer = introducer;
    }

    /**
     * 获取员工级别
     *
     * @return stafflevel - 员工级别
     */
    public Integer getStafflevel() {
        return stafflevel;
    }

    /**
     * 设置员工级别
     *
     * @param stafflevel 员工级别
     */
    public void setStafflevel(Integer stafflevel) {
        this.stafflevel = stafflevel;
    }

    /**
     * 获取业绩方式
     *
     * @return performancetype - 业绩方式
     */
    public Integer getPerformancetype() {
        return performancetype;
    }

    /**
     * 设置业绩方式
     *
     * @param performancetype 业绩方式
     */
    public void setPerformancetype(Integer performancetype) {
        this.performancetype = performancetype;
    }

    /**
     * 获取业绩比率
     *
     * @return performancerate - 业绩比率
     */
    public BigDecimal getPerformancerate() {
        return performancerate;
    }

    /**
     * 设置业绩比率
     *
     * @param performancerate 业绩比率
     */
    public void setPerformancerate(BigDecimal performancerate) {
        this.performancerate = performancerate;
    }

    /**
     * 获取店内职位称呼 
     *
     * @return positiontitle - 店内职位称呼 
     */
    public String getPositiontitle() {
        return positiontitle;
    }

    /**
     * 设置店内职位称呼 
     *
     * @param positiontitle 店内职位称呼 
     */
    public void setPositiontitle(String positiontitle) {
        this.positiontitle = positiontitle;
    }

    /**
     * 获取黑名单标记 0 否 1 是 
     *
     * @return blacklistflag - 黑名单标记 0 否 1 是 
     */
    public Integer getBlacklistflag() {
        return blacklistflag;
    }

    /**
     * 设置黑名单标记 0 否 1 是 
     *
     * @param blacklistflag 黑名单标记 0 否 1 是 
     */
    public void setBlacklistflag(Integer blacklistflag) {
        this.blacklistflag = blacklistflag;
    }

    /**
     * 获取//银行预留手机号
     *
     * @return reservation_phone - //银行预留手机号
     */
    public String getReservationPhone() {
        return reservationPhone;
    }

    /**
     * 设置//银行预留手机号
     *
     * @param reservationPhone //银行预留手机号
     */
    public void setReservationPhone(String reservationPhone) {
        this.reservationPhone = reservationPhone;
    }

    /**
     * @return is_star
     */
    public Integer getIsStar() {
        return isStar;
    }

    /**
     * @param isStar
     */
    public void setIsStar(Integer isStar) {
        this.isStar = isStar;
    }

    /**
     * 获取员工身份证照
     *
     * @return idCard_url - 员工身份证照
     */
    public String getIdcardUrl() {
        return idcardUrl;
    }

    /**
     * 设置员工身份证照
     *
     * @param idcardUrl 员工身份证照
     */
    public void setIdcardUrl(String idcardUrl) {
        this.idcardUrl = idcardUrl;
    }

    /**
     * 获取显示门店
     *
     * @return showStore - 显示门店
     */
    public String getShowstore() {
        return showstore;
    }

    /**
     * 设置显示门店
     *
     * @param showstore 显示门店
     */
    public void setShowstore(String showstore) {
        this.showstore = showstore;
    }

    /**
     * 获取记录更新时间
     *
     * @return update_time - 记录更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置记录更新时间
     *
     * @param updateTime 记录更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取培训学校系统中的员工ID
     *
     * @return school_wid - 培训学校系统中的员工ID
     */
    public String getSchoolWid() {
        return schoolWid;
    }

    /**
     * 设置培训学校系统中的员工ID
     *
     * @param schoolWid 培训学校系统中的员工ID
     */
    public void setSchoolWid(String schoolWid) {
        this.schoolWid = schoolWid;
    }

    /**
     * @return INTRODUCTION
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * @param introduction
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * 获取形象照图片组
     *
     * @return STAFFLOGO_GROUP - 形象照图片组
     */
    public String getStafflogoGroup() {
        return stafflogoGroup;
    }

    /**
     * 设置形象照图片组
     *
     * @param stafflogoGroup 形象照图片组
     */
    public void setStafflogoGroup(String stafflogoGroup) {
        this.stafflogoGroup = stafflogoGroup;
    }
}