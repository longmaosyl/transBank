package com.etransfar.transBank.enums;

import java.util.HashMap;
import java.util.Map;

public enum PTMessageEnum {
	
	TRANS_SUCCESS("000000", "交易成功"),
	TRANS_ERROR("999999", "交易失败"),
	
	//一些公共类型异常，错误码以90开头6位数字，例：
	NO_DATA_FOUND("900001", "没有数据"),
	TRANSCODE_NOT_FOUND("900002", "交易码不符合规范"),
	DATA_VALIDATE_ERROR("900003", "数据校验失败："),
	ILLEGAL_REQUEST("900004", "非法请求"),
	DATE_TRANS_ERROR("900005", "日期格式转换失败"),
	CONNECTION_ERROR("900006","通讯异常"),
	CONNECTION_SUCCESS("900007","通讯成功"),
	LOAN_OVER("900008","该笔借款超过可借阈值"),
	HF_IN_MAINTENANCE("900009","系统维护中"),
	CONNECTION_TIME_OUT("900010","通讯超时"),
	CHECK_COUNT_OUT("900011","查询业务超过受理限制,请联系管理员"),
	REFUSE_LOAN("900012","拒绝借款"),
	


	;
	
	private PTMessageEnum(String code, String message){
		this.code = code;
		this.message = message;
	}
	
	private String code;
	private String message;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 
	 * @param code
	 * @return
	 */
	public static PTMessageEnum getEnumByCode(String code) {
		if (null == code) {
			return null;
		}
		for (PTMessageEnum type : values()) {
			if (type.getCode().equals(code.trim()))
				return type;
		}
		return null;
	}
	
	/**
	 * 转出Map
	 * @return
	 */
	public static Map<String, String> toMap() {
		Map<String, String> enumDataMap = new HashMap<String, String>();
		for (PTMessageEnum type : values()) {
			enumDataMap.put(type.getCode(), type.getMessage());
		}
		return enumDataMap;
	}
	
	
}
