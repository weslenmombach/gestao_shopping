//Classe
public class Endereco {
    String NomeDaRua;
    String Cidade;
    String Estado;
    String Pais;
    String Cep;
    String Numero;
    String Complemento;

    //Método construtor padrão
    Endereco(String NomeDaRua, String Cidade){
        this.NomeDaRua = NomeDaRua;
        this.Cidade = Cidade;
    }

    //Método construtor
    Endereco(String NomeDaRua, String Cidade, String Estado, String Pais, String Cep, String Numero, String Complemento){
        this.NomeDaRua = NomeDaRua;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Pais = Pais;
        this.Cep = Cep;
        this.Numero = Numero;
        this.Complemento = Complemento;
    }

    //Métodos de acesso Get e Set
    public String getNomeDaRua(){
        return NomeDaRua;
    }

    public void setNomeDaRua(String NomeDaRua){
        this.NomeDaRua = NomeDaRua;
    }

    public String getCidade(){
        return Cidade;
    }

    public void setCidade(String Cidade){
        this.Cidade = Cidade;
    }

    public String getEstado(){
        return Estado;
    }

    public void setEstado(String Estado){
        this.Estado = Estado;
    }

    public String getPais(){
        return Pais;
    }

    public void setPais(String Pais){
        this.Pais = Pais;
    }

    public String getCep(){
        return Cep;
    }

    public void setCep(String Cep){
        this.Cep = Cep;
    }

    public String getNumero(){
        return Numero;
    }

    public void setNumero(String Numero){
        this.Numero = Numero;
    }

    public String getComplemento(){
        return Complemento;
    }

    public void setComplemento(String Complemento){
        this.Complemento = Complemento;
    }

    //Método toString
    public String toString(){
        return "Aqui temos o endereço completo que seria: " + NomeDaRua + ", " + Cidade + ", " + Estado+ ", " + Pais + ", " + Cep + ", " + Numero + " e " + Complemento + "."; 
    }

}
