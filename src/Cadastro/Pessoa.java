
package Cadastro;


public class Pessoa {
    
}

private string nome; 
private string sexo;
private int idade;
private int datanascimento;
private long cpf;
private long rg;
private long celular;


public pessoa (string nome,string sexo,int idade,int datanascimento,long cpf,long rg){
this.nome = nome;
this.sexo = sexo;
this.idade = idade;
this.datanascimento;
this.cpf = cpf;
this.rg = rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(int datanascimento) {
        this.datanascimento = datanascimento;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }


}

public class eventos {
}

private string nome;
private string local;
private string categoria;
private int data;
private int horario;
private float valordoticket;

public eventos (string nome, string local, string categoria, int data, int horario, float valorticket)

this.nome = nome; 
this.local = local;
this.categoria = categoria("futbol, carros, culinaria, standup")
this.data = data 
this. horario = horario; 
this. valordoticktet = valordoticket;

    public string getLocal() {
        return local;
    }

    public void setLocal(string local) {
        this.local = local;
    }

    public string getCategoria() {
        return categoria;
    }

    public void setCategoria(string categoria) {
        this.categoria = categoria;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public float getValordoticket() {
        return valordoticket;
    }

    public void setValordoticket(float valordoticket) {
        this.valordoticket = valordoticket;
    }


}public class eventos cadastrados e confirmações

private string inscriçõesconfirmadas;
private string eventosdisponiveis;
private string inscriçãonovoevento;
private string cancelarinscrição;
private string eventosencerrados;

public eventos cadastrados e confirmações (inscriçõesconfirmadas, eventosdisponiveis,inscriçãonovoevento,cancelarinscrição,eventosencerrados){
   
this.incriçõesconfirmadas = inscriçõesconfirmadas;
this.eventosdisponiveis = eventosdisponiveis;
this.inscricaonovoevento = inscricaonovoevento;
this.cancelarinscricao = cancelarinscricao;
this.eventosencerrados = eventosencerrados;

    public string getInscriçõesconfirmadas() {
        return inscriçõesconfirmadas;
    }

    public void setInscriçõesconfirmadas(string inscriçõesconfirmadas) {
        this.inscriçõesconfirmadas = inscriçõesconfirmadas;
    }

    public string getEventosdisponiveis() {
        return eventosdisponiveis;
    }

    public void setEventosdisponiveis(string eventosdisponiveis) {
        this.eventosdisponiveis = eventosdisponiveis;
    }

    public string getInscriçãonovoevento() {
        return inscriçãonovoevento;
    }

    public void setInscriçãonovoevento(string inscriçãonovoevento) {
        this.inscriçãonovoevento = inscriçãonovoevento;
    }

    public string getCancelarinscrição() {
        return cancelarinscrição;
    }

    public void setCancelarinscrição(string cancelarinscrição) {
        this.cancelarinscrição = cancelarinscrição;
    }

    public string getEventosencerrados() {
        return eventosencerrados;
    }

    public void setEventosencerrados(string eventosencerrados) {
        this.eventosencerrados = eventosencerrados;
    }

}