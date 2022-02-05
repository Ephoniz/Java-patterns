package Mediator;

public class Main {
    Mediator mediador = new MediadorConcreto();

    Colega colega1 = new ColegaConcreto1();
    Colega colega2 = new ColegaConcreto2();
    Colega colega3 = new ColegaConcreto3();

    mediador.registra(colega1);
    mediador.registra(colega2);
    mediador.registra(colega3);

    colega2.envia();

}