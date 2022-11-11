package fabrica;

import domain.Mensagem;
import domain.MensagemAprovação;

public class FabricaMsgAprovacao extends FabricaMensagem{
    @Override
    public Mensagem criarMensagem() {
        return new MensagemAprovação();
    }
}
