package com.ray.mail.services;

import com.ray.mail.dto.SendDto;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Properties;

/**
 * Created by zrc on 2020-11-10.
 */
@Service
public class MailSenderService {
    public JavaMailSenderImpl getJavaMailSender(SendDto sendDto){
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setHost(sendDto.getType().host);
        sender.setDefaultEncoding("UTF-8");
        sender.setUsername(sendDto.getFrom());
        sender.setPassword(sendDto.getPassword());
        Properties p = new Properties();
        p.setProperty("mail.smtp.auth", "true");
        sender.setJavaMailProperties(p);
        return sender;
    }
}
