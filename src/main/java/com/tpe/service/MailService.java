package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;

public class MailService implements MessageService{


    private Repository repo;

    public MailService(Repository repo) {
        this.repo = repo;
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("Mesajınız mail ile gönderiliyor : "+message.getBody());
    }

    @Override
    public void saveMessage(Message message) {
        repo.save(message);

    }
}
