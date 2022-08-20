package solution;

import violation.Candidato;

import java.util.List;

public class CandidatoRepository {
    private List<Candidato> cadidatoDb(){
        return  List.of(new Candidato("Vitoria", 1232345, "10/09/2022"),new Candidato("Jessica", 1232347, "10/09/2022"), new Candidato("Fabio", 1232345, "10/09/2022"));
    }

    public Candidato visualizarCandidatoPorNome(String nomeCandidato){
        for(Candidato nome: cadidatoDb()){
            if (nome.getNomeCandidato().equals(nomeCandidato))
                return nome;
        }
        return new Candidato();
    }
    public void adicionarCandidato(String nomeCandidato, int idCandidato, String dataUltimaTentativa){
        for(Candidato nome: cadidatoDb()){
            if (!nome.equals(cadidatoDb()))
                cadidatoDb().add(new Candidato(nomeCandidato, idCandidato, dataUltimaTentativa));
        }
    }
    public void deletarCandidato(String nomeCandidato, int cpf){
        for(Candidato nome: cadidatoDb()){
            if (nome.getNomeCandidato().equals(nomeCandidato) && nome.getCpf().equals(cpf))
                cadidatoDb().remove(nome);
        }
    }
}
