package solution;

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

}
