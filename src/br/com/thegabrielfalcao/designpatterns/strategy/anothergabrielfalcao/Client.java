package br.com.thegabrielfalcao.designpatterns.strategy.anothergabrielfalcao;

import br.com.thegabrielfalcao.designpatterns.strategy.anothergabrielfalcao.context.Context;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Client {

    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int idDoDia = gregorianCalendar.get(Calendar.DAY_OF_WEEK);

        Context context = new Context(idDoDia);
        context.escreverMensagemDoDia();
    }
}
