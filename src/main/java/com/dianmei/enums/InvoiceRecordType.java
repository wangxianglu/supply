package com.dianmei.enums;

public enum InvoiceRecordType {
  //"正常入库","盘盈入库","退货入库","调拨入库","赠品入库","外购产品入库"
  NORMAL_IN(0, "正常入库"), INVENTORY_IN(1, "盘盈入库"), RETURN_IN(2, "退货入库"), ALLOT_IN(3, "调拨入库"),
  GIFT_IN(4, "赠品入库"), OUTSOURCING(5, "外购产品入库");
  
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
	for (InvoiceRecordType c : InvoiceRecordType.values()) {
	  if (c.getValue() == value) {
		return c.name;
	  }
	}
	return null;
  }
  
  InvoiceRecordType(int value, String name) {
	this.value = value;
	this.name = name;
  }
  
}
