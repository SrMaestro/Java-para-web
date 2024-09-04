package src;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class DiaDaSemana {
    public static void main(String[] args) {
        DayOfWeek diaAtual = LocalDate.now().getDayOfWeek();
        String mensagem = "";

        switch (diaAtual) {
            case MONDAY:
                mensagem = "Olá, Segunda-feira!";
                break;
            case TUESDAY:
                mensagem = "Olá, Terça-feira!";
                break;
            case WEDNESDAY:
                mensagem = "Olá, Quarta-feira!";
                break;
            case THURSDAY:
                mensagem = "Olá, Quinta-feira!";
                break;
            case FRIDAY:
                mensagem = "Olá, Sexta-feira!";
                break;
            case SATURDAY:
                mensagem = "Olá, Sábado!";
                break;
            case SUNDAY:
                mensagem = "Olá, Domingo!";
                break;
            default:
                mensagem = "Algo deu errado!";
        }

        System.out.println(mensagem);
    }
}