import fabrica.FabricaMensagem;
import fabrica.FabricaMsgAprovacao;
import fabrica.FabricaMsgReprovacao;

public class Main {
    private static FabricaMensagem mensagem;
    public static void main(String[] args){
        configure(args[0]);
        if(mensagem != null)
            run();


    }
    private static void run() {
        mensagem.startMensagem();
    }

    private static void configure(String type) {
                switch(type){
                    case "aprovacao":
                        mensagem = new FabricaMsgAprovacao();
                        break;
                    case "reprovacao" :
                        mensagem = new FabricaMsgReprovacao();
                        break;
                    default :
                        System.out.println("Selecione o tipo de mensagem");
        }
    }

}
