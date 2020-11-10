package com.ray.mail.services;

import com.ray.mail.dto.SendDto;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

/**
 * Created by zrc on 2020-11-10.
 */
@Service
public class MailMassageService {
    public SimpleMailMessage getSimpleMailMessage(SendDto sendDto){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(sendDto.getTo());
        simpleMailMessage.setFrom(sendDto.getFrom());
        simpleMailMessage.setSubject(sendDto.getSubject());
        simpleMailMessage.setText(sendDto.getContent());
        return simpleMailMessage;
    }
}
