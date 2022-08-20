package violation;

import java.util.List;

public class Candidato {
    private String nomeCandidato;
    private Integer Cpf;
    private String DataUltimaTentativa;

    public Candidato(){}
    public Candidato(String nomeCandidato, int idCandidato, String dataUltimaTentativa) {}

    public String getNomeCandidato() {
            return nomeCandidato;
    }

    public Integer getCpf() {
        return Cpf;
    }

    public String getDataUltimaTentativa() {
        return DataUltimaTentativa;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public void setDataUltimaTentativa(String dataUltimaTentativa) {
        DataUltimaTentativa = dataUltimaTentativa;
    }

    public void setCpf(Integer cpf) {
        this.Cpf = cpf;
    }

    public Candidato visualizarCandidatoPorNome(String nomeCandidato){
        for(Candidato nome: cadidatoDb()){
           if (nome.nomeCandidato.equals(nomeCandidato))
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
            if (nome.nomeCandidato.equals(nomeCandidato) && nome.getCpf().equals(cpf))
                cadidatoDb().remove(nome);
        }
    }
    private List<Candidato> cadidatoDb(){
      return  List.of(new Candidato("Vitoria", 1232345, "10/09/2022"),new Candidato("Jessica", 1232345, "10/09/2022"), new Candidato("Jessica", 1232345, "10/09/2022"));
    }


}
