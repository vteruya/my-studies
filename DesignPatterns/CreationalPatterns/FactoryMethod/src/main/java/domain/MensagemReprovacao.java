package domain;

public class MensagemReprovacao implements Mensagem{
    @Override
    public void verMensagem() {
        System.out.println("Você foi reprovado, tente novamente!");
    }
}
