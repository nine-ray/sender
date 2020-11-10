package com.ray.mail.controller;

import com.ray.mail.dto.SendDto;
import com.ray.mail.services.MailMassageService;
import com.ray.mail.services.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zrc on 2020-11-10.
 */
@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailMassageService mailMassageService;

    @Autowired
    private MailSenderService mailSenderService;

    @PostMapping("/send")
    public String sendMsg(@RequestBody SendDto sendDto) {
        SimpleMailMessage mailMessage = mailMassageService.getSimpleMailMessage(sendDto);
        JavaMailSenderImpl mailSender = mailSenderService.getJavaMailSender(sendDto);
        mailSender.send(mailMessage);
        return "send mail success";
    }
}
