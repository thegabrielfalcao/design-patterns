package br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru;

import br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.model.Document;
import br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.model.User;

public class Client {
    public static void main(String[] args) {

        //Ao instanciar o documento, seu estado inicial é Draft
        Document document = new Document(new User(true));
        //Se um administrador publicar, mudará direto do draft para o estado Published
        document.publish();
        //Já no estado Published não conseguirá publicar novamente
        document.publish();

        System.out.println("\n");

        //Ao instanciar o documento, seu estado inicial é Draft
        document = new Document(new User(false));
        //Caso o usuário não seja um administrador, o estado mudará para Moderation para ser "aprovado"
        document.publish();
        //Caso o usuário insista, a mensagem de aguardar o moderador continuará
        document.publish();
        //Iremos mudar o usuário para administrador a fim de publicar a matéria
        document.changeWriter(new User(true));
        //Ao mudar para administrador o Document chegará no seu status final de Published!
        document.publish();
        //Caso insista para ser publicado, retornará mensagem que já foi publicado. Esse comportamento é do state Published
        document.publish();
    }
}
