package domain;

public class MensagemAprovação implements Mensagem {

    @Override
    public void verMensagem() {
      System.out.println("Você foi aprovado, boa sorte!");
    }
}
