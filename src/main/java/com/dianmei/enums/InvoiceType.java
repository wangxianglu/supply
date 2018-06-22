package com.dianmei.enums;

public enum InvoiceType {
  //库存单据，0为入库单，1为出库单，2为退库单 3发货单（由发货单生成门店入库单）4,收货单，5,盘库单 6,会员卡入库单据，7会员卡出库单，8, "未销售卡到门店"
  ORDER_IN(0, "入库单"), ORDER_OUT(1, "出库单"), ORDER_RETURN(2, "退库单"), ORDER_SEND(3, "发货单"),
  ORDER_TAKE(4, "收货单"), ORDER_CHECK(5, "盘库单"), CARD_IN(6, "会员卡入库单"), CARD_OUT(7, "会员卡出库单"),CARD_UNREGISTER(8, "未销售卡到门店");
  
  private int value;
  private String name;
  
  public int getValue() {
	return value;
  }
  
  public void setValue(int value) {
	this.value = value;
  }
  
  public String getName() {
	return name;
  }
  
  public void setName(String name) {
	this.name = name;
  }
  
  // 普通方法
  public static String getName(int value) {
	for (InvoiceType c : InvoiceType.values()) {
	  if (c.getValue() == value) {
		return c.name;
	  }
	}
	return null;
  }
  
  InvoiceType(int value, String name) {
	this.value = value;
	this.name = name;
  }
  
}
