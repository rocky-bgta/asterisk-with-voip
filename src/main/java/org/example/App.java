package org.example;


import webphone.*;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        webphone phone = new webphone();

        phone.API_SetParameter("serveraddress", "192.168.0.130");
        phone.API_SetParameter("username", "App");
        phone.API_SetParameter("password", "app1234");
        phone.API_SetParameter("loglevel", "1");
        phone.API_Start();

        phone.API_Register();

        while (true) {
            System.out.println("Ready to make calls");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if(input == 1)
                    phone.API_Call(-1, "5001");
            else if(input == 2)
                    phone.API_Hangup(-1);
            else if(input == 3)
                    continue;
            else
                break;

        }
    }
}
