package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp.showWelcomeMessage();
        BibliotecaApp.showInputMenu();
        BibliotecaApp.setOptionInput();
    }

    public static void showWelcomeMessage(){
        String welcomeMessage = "Welcome to Biblioteca. You one-stop-shop for great book titles in Bangalore!";
        System.out.println(welcomeMessage);
    }

    public static void showInputMenu() {
        Menu menu = new Menu();
        menu.show();
    }

    public static void setOptionInput() {
        Menu menu = new Menu();
        menu.setOptionInput();
    }


}
