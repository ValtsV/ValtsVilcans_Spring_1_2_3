package com.vala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        Codigo comentado es para el ejercicio 1
//        Saludo saludo = (Saludo) context.getBean("saludo");
//
//        saludo.imprimirSaludo();

        UserService service = (UserService) context.getBean(UserService.class);

        service.notificationService.imprimirSaludo();

    }
}
