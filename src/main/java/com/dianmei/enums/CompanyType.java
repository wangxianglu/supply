package com.dianmei.enums;

/**
 * ${DESCRIPTION}
 *
 * @author xianglu.Wang
 * @creatDate 2018-07-04-11:29
 */
public enum CompanyType {
    HAIR(1, "理发连锁公司"), USER(2, "用户公司"), SUPPLIER(3, "为商品供应商"), MEDIA(4, "为媒体"), CHANNEL(5, "为频道");

    private String text;
    private Integer value;

    // 普通方法
    public static String getName(int value) {
        for (CompanyType c : CompanyType.values()) {
            if (c.getValue() == value) {
                return c.text;
            }
        }
        return null;
    }

    CompanyType(String text, Integer value) {
        this.text = text;
        this.value =value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
