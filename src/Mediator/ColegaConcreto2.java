package Mediator;

public class ColegaConcreto2 extends Colega {
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje soy colegaConcreto 2.");
    }

    @Override
    void envia() {
        System.out.println("Soy colegaConcret2, envio un mensaje");
        mediator.reenvia(this);
    }
}
