package com.dianmei.enums;

/**
 * 仓库的类型 0.为店铺，1为区域大仓，2为公司仓库，3为供应商仓库',
 *
 * @author xianglu.Wang
 * @creatDate 2018-04-27-16:55
 */
public enum StorageType {
    STORE(0), REGINOL(1), COMPANY(2), SUPPLIER(3);

    private int value;

    StorageType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
