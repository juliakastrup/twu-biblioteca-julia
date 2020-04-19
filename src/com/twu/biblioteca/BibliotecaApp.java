package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp.showWelcomeMessage();
        BibliotecaApp.showInputMenu();
    }

    public static void showWelcomeMessage(){
        String welcomeMessage = "Welcome to Biblioteca. You one-stop-shop for great book titles in Bangalore!";
        System.out.println(welcomeMessage);
    }

    public static void showInputMenu() {
        Menu menu = new Menu();
        menu.show();
    }






}
