package com.diao.untils;

import org.apache.shiro.crypto.hash.Md5Hash;

public class Md5Utils {
    public static String getMd5Password(String source,String salt){
        Md5Hash md5Hash = new Md5Hash(source, salt, 1024);
        return md5Hash.toBase64();
    }
}
