package com.tpe.controller;

import com.tpe.domain.Message;
import com.tpe.repository.DbRepository;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repository;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import com.tpe.service.WhatsappService;

public class MessageAplication {

    public static void main(String[] args) {

        Message message = new Message();
        message.setBody("Spring is COMING:)");

        //Repository repo = new FileRepository();
        //MessageService service = new WhatsappService(repo);
        //service.sendMessage(message);
        //service.saveMessage(message);

        Repository repo = new DbRepository();
        MessageService service = new MailService(repo);
        service.sendMessage(message);
        service.saveMessage(message);









    }
}
