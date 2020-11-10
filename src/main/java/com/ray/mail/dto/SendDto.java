package com.ray.mail.dto;

import com.ray.mail.enums.MailType;
import lombok.Data;

/**
 * Created by zrc on 2020-11-10.
 */
@Data
public class SendDto {
    private String from;
    private String password;
    private String to;
    private String subject;
    private String content;
    private MailType type;
}
