package com.joaoedson.email_service_ses.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {

    private String subject;
    private String recipient;
    private String sender;
    private String message;
    private Timestamp created_at;

}
