package com.vala;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public void imprimirSaludo(){
        System.out.println("Saludo desde NotServ");
    }
}
