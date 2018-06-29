package com.dianmei.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sc_goods")
@Getter
@Setter
public class Goods {
    /**
     * 商品ID
     */
    @Id
    @Column(name = "goods_id")
    private Integer id;

    /**
     * 商品名字
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 商品类型ID，最细的类型
     */
    @Column(name = "goods_type_id")
    private Integer goodsTypeId;

    /**
     * 商品条码或二维码
     */
    @Column(name = "bar_code")
    private String barCode;

    /**
     * 商品品牌ID，bm_brand表ID
     */
    @Column(name = "brand_id")
    private Integer brandId;

    /**
     * 商品的适用公司ID
     */
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 商品介绍
     */
    @Column(name = "goods_intro")
    private String goodsIntro;

    /**
     * 商品缩略图
     */
    @Column(name = "goods_thumb")
    private String goodsThumb;

    /**
     * 是否上架，0为未上架，1为上架
     */
    @Column(name = "is_sale")
    private Boolean isSale;

    /**
     * 商品是否可以被订购，0为不可订购，1为可以被订购
     */
    @Column(name = "is_book")
    private Boolean isBook;

    /**
     * 安全库存
     */
    @Column(name = "min_Inventory")
    private Long minInventory;

    /**
     * 商品的单位
     */
    @Column(name = "goods_unit")
    private String goodsUnit;

    /**
     * 包装内数量，默认为1，大包装表示内部含有的数量
     */
    @Column(name = "sub_number")
    private Integer subNumber;

    /**
     * 商品添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 商品销售数量
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 商品的供货周期，单位为天
     */
    @Column(name = "supply_days")
    private Integer supplyDays;

    /**
     * 商品的标准价
     */
    @Column(name = "goods_price")
    private BigDecimal goodsPrice;

    /**
     * 商品的进货成本
     */
    @Column(name = "book_price")
    private BigDecimal bookPrice;

    /**
     * 商品的运费
     */
    @Column(name = "transport_price")
    private BigDecimal transportPrice;

    /**
     * 商品属性ID
     */
    @Column(name = "attribute_id")
    private Integer attributeId;

    @Column(name = "sc_order_id")
    private Integer scOrderId;

    /**
     * 0:属于仓库, 1:属于供应商
     */
    @Column(name = "send_source_flag")
    private Byte sendSourceFlag;

    /**
     * 仓库ID
     */
    @Column(name = "send_house_id")
    private Integer sendHouseId;

    /**
     * 供应商ID
     */
    @Column(name = "send_supplier_id")
    private Integer sendSupplierId;

    @Column(name = "goods_showImage")
    private String goodsShowimage;

    /**
     * 商品代码
     */
    @Column(name = "goods_no")
    private String goodsNo;

    /**
     * 商品的门店实际入出库价
     */
    @Column(name = "store_price")
    private BigDecimal storePrice;

    /**
     * 商品的门店实际零售价
     */
    @Column(name = "sale_price")
    private BigDecimal salePrice;

    @Column(name = "product_id")
    private Integer productId;

    /**
     * 开始商品代码
     */
    @Column(name = "start_code")
    private String startCode;

    /**
     * 结束商品代码
     */
    @Column(name = "end_code")
    private String endCode;

    /**
     * 批次号
     */
    @Column(name = "batch_no")
    private String batchNo;

    /**
     * 是否为会员卡
     */
    @Column(name = "is_card")
    private Integer isCard;

    /**
     * 会员卡过滤类型，0不过滤 1尾号过滤
     */
    @Column(name = "percolate_type")
    private Integer percolateType;

    /**
     * 会员卡过滤数字
     */
    @Column(name = "percolate_num")
    private String percolateNum;

    /**
     * 标志 0 可使用  1 不可使用 ，不可使用呢出入库卖品都不能操作
     */
    @Column(name = "goods_status")
    private Integer goodsStatus;

    @Column(name = "goods_show_image")
    private String goodsShowImage;

    private String supplierName; //供应商名称
    private String brandName; //品牌名称
    private String storageName; //仓库名称
    private String attributeName; // 属性名称

}