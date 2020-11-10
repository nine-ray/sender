package com.ray.mail.enums;

/**
 * Created by zrc on 2020-11-10.
 */
public enum MailType {
    MAIL_QQ("smtp.qq.com"),MAIL_126("smtp.126.com"),MAIL_163("smtp.163.com"),MAIL_YEAH("smtp.yeah.net");
    public String host;
    MailType(String host){
        this.host = host;
    }
}
