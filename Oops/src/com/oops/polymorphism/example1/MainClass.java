package com.oops.polymorphism.example1;

public class MainClass {

    public static void main(String[] args) {
        Language language = new Language();
        language.info();
        Java java = new Java();
        java.info();
        JavaScript javaScript = new JavaScript();
        javaScript.info();

    }
}
