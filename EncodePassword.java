package com.edureka.basics;

import org.apache.commons.codec.binary.Base64;
public class EncodePassword {

	public static void main(String[] args) {
		String pass="riya@2015";
		byte[] encode=Base64.encodeBase64(pass.getBytes());
		System.out.println("pass before: " + pass);
		System.out.println("pass after: " + new String(encode));
		
		byte[] decode=Base64.decodeBase64(encode);
		System.out.println("pass after: " + new String(decode));
	}

}
