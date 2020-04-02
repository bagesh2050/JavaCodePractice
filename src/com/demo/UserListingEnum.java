package com.demo;

import java.util.HashSet;
import java.util.Set;

public enum UserListingEnum {
	MSISDN("msisdn"),
	LOGIN_ID("loginId"),
	USER_TYPE("userType"),
	DOMAIN_CODE("domainCode"),
	DOMAIN_NAME("domainName"),
	CATEGORY_CODE("categoryCode"),
	CATEGORY_NAME("categoryName"),
	STATUS("status"),
	CREATED_ON("createdOn");

	private String value;

	public String getValue() {
		return value;
	}

	void setValue(String value) {
		this.value = value;
	}

	private UserListingEnum(final String value) {
		this.value = value;
	}

	public static Set<String> allValues() {
		final Set<String> set = new HashSet<>();
		for (UserListingEnum enumClass : UserListingEnum.values()) {
			set.add(enumClass.getValue());
		}
		return set;
	}

	public static String getValuesAsStringByDelimiter() {
		StringBuilder sb = new StringBuilder();
		for (UserListingEnum enumClass : UserListingEnum.values()) {
			if (sb.length() <= 0) {
				sb.append(enumClass.getValue());
			} else {
				sb.append(",").append(enumClass.getValue());
			}
		}
		return sb.toString();
	}
}
