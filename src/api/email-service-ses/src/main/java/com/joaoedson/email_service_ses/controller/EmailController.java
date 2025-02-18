package com.joaoedson.email_service_ses.controller;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaoedson.email_service_ses.model.Email;
import com.joaoedson.email_service_ses.service.EmailService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/email")
public class EmailController {

    private EmailService emailService;

    @PostMapping()
    public void sendEmail(@RequestBody Email email) throws MessagingException {
        emailService.sendEmail(email);
    }
}
