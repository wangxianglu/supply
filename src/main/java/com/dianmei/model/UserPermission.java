package com.dianmei.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sm_user_permission")
public class UserPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "store_id")
    private Integer storeId;

    @Column(name = "rank_id")
    private Integer rankId;

    /**
     * 业务查询时间范围，（可以查询的开始时间）
     */
    @Column(name = "p_start_date")
    private Date pStartDate;

    /**
     * 业务查询时间范围，（可以查询的结束时间）
     */
    @Column(name = "p_end_date")
    private Date pEndDate;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return company_id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * @return store_id
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * @param storeId
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * @return rank_id
     */
    public Integer getRankId() {
        return rankId;
    }

    /**
     * @param rankId
     */
    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    /**
     * 获取业务查询时间范围，（可以查询的开始时间）
     *
     * @return p_start_date - 业务查询时间范围，（可以查询的开始时间）
     */
    public Date getpStartDate() {
        return pStartDate;
    }

    /**
     * 设置业务查询时间范围，（可以查询的开始时间）
     *
     * @param pStartDate 业务查询时间范围，（可以查询的开始时间）
     */
    public void setpStartDate(Date pStartDate) {
        this.pStartDate = pStartDate;
    }

    /**
     * 获取业务查询时间范围，（可以查询的结束时间）
     *
     * @return p_end_date - 业务查询时间范围，（可以查询的结束时间）
     */
    public Date getpEndDate() {
        return pEndDate;
    }

    /**
     * 设置业务查询时间范围，（可以查询的结束时间）
     *
     * @param pEndDate 业务查询时间范围，（可以查询的结束时间）
     */
    public void setpEndDate(Date pEndDate) {
        this.pEndDate = pEndDate;
    }
}