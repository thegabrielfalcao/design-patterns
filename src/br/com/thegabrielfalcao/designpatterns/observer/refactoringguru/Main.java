package br.com.thegabrielfalcao.designpatterns.observer.refactoringguru;

import br.com.thegabrielfalcao.designpatterns.observer.refactoringguru.editor.Editor;
import br.com.thegabrielfalcao.designpatterns.observer.refactoringguru.listeners.impl.EmailNotificationListener;
import br.com.thegabrielfalcao.designpatterns.observer.refactoringguru.listeners.impl.LogOpenListener;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        Editor editor = new Editor();
        //No evento de abrir o arquivo, o log irá ser disparado para salvar que tal ação foi executada
        editor.events.subscribe("save", new LogOpenListener(new File("//path//to//log//file.txt")));
        editor.events.subscribe("save", new EmailNotificationListener("orkut@example.com"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
