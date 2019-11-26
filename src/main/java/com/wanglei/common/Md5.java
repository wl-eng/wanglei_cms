package com.wanglei.common;

import org.apache.commons.codec.digest.DigestUtils;

public class Md5 {

	public static String password(String password, String salt) {
		// TODO Auto-generated method stub
		return DigestUtils.md5Hex(password + "::::" +  salt);
	}
}
