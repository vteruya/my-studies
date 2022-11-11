package fabrica;

import domain.Mensagem;
import domain.MensagemReprovacao;

public abstract class FabricaMensagem {
    public void startMensagem(){
        Mensagem msg = criarMensagem();
        msg.verMensagem();
    }

    abstract Mensagem criarMensagem();
}
