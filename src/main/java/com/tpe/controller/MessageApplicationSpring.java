package com.tpe.controller;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.repository.DbRepository;
import com.tpe.repository.Repository;
import com.tpe.service.MessageService;
import com.tpe.service.SlackService;
import com.tpe.service.SmsService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class MessageApplicationSpring {

    public static void main(String[] args) {

        Message message = new Message();
        message.setBody("Welcome Spring :)");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        MessageService service= context.getBean(SmsService.class);
        service.sendMessage(message);

       /* MessageService service2 = context.getBean(MessageService.class);
        service2.sendMessage(message); */

       /* MessageService service3 = context.getBean(SlackService.class);
        service3.sendMessage(message); */

        /*MessageService service3 = context.getBean(MessageService.class);
        service3.sendMessage(message);*/

        /*MessageService service3 = context.getBean("slackService",MessageService.class);
        service3.sendMessage(message); */

        MessageService service3 = context.getBean("slack_service",MessageService.class);
        service3.sendMessage(message);

       /* MessageService service4 = context.getBean("smsService",MessageService.class);
        service4.saveMessage(message); */

       /* SmsService service5 = context.getBean(SmsService.class);
        service5.saveMessage(message);
        Repository repository = context.getBean(DbRepository.class);
        service5.setRepo(repository);
        service5.saveMessage(message); */

      /*  Random random = new Random();
        System.out.println(random.nextInt(100)); */

       /* Random random = context.getBean(Random.class);
        System.out.println(random.nextInt(100)); */

        MessageService service10 = context.getBean("slack_service", MessageService.class);
        service10.saveMessage(message);

        MessageService service6 = context.getBean(SmsService.class);
        MessageService service7 = context.getBean(SmsService.class);

        if (service6 == service7) {
            System.out.println("Objeler aynı");
            System.out.println(service6);
            System.out.println(service7);
        } else {
            System.out.println("Objeler farklı");
            System.out.println(service6);
            System.out.println(service7);
        }

        System.out.println("------------ Value ile ----------------");
        SlackService service8 = context.getBean(SlackService.class);
        service8.printContact();
        System.out.println("------------ Properties ile ------------");
        service8.getContact();
        System.out.println("----------------------------------------");









        context.close();

        System.out.println("context kapatıldı");
        //context.getBean(SmsService.class);

    }
}
