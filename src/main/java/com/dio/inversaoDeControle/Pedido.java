package com.dio.inversaoDeControle;

public class Pedido {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.gravar();
    }
    private EnviarEmails enviarEmails;
    public void gravar() {
            this.enviarEmails = new EnviarEmails("stmp","contato@email.com", "senha");
            this.enviarEmails.retornar("Pedido criado !");
    }

}