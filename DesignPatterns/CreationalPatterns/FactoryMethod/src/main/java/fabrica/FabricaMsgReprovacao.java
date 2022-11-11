package fabrica;

import domain.Mensagem;
import domain.MensagemReprovacao;

public class FabricaMsgReprovacao extends FabricaMensagem{
    @Override
    public Mensagem criarMensagem() {
        return new MensagemReprovacao();
    }
}
