public class Produto {
    String Nome;
    double Preco;
    Data DataValidade;

    //Método Construtor para Validador da Etapa1
    Produto(String Nome, double Preco){
        this.Nome = Nome;
        this.Preco = Preco;
    }

    Produto(String Nome, double Preco, Data DataValidade){
        this.Nome = Nome;
        this.Preco = Preco;
        this.DataValidade = DataValidade;
    }
    //Aqui acima, no momento da etapa 2, realizei a validação e alteração no método construtor da dataValidade

    // Método de Acesso Get e Set
    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public double getPreco(){
        return Preco;
    }

    public void setPreco(double Preco){
        this.Preco = Preco;
    }

    public Data getDataValidade(){
        return DataValidade;
    }

    public void setDataValidade(Data DataValidade){
        this.DataValidade = DataValidade;
    }

    // Método toString
    public String toString(){
    return "Aqui temos o nome do produto " + Nome + " juntamente com o seu respectivo preço: " + Preco + " e também a sua data de validade que é " + DataValidade + "."; 
    }

    //Criação de um método chamado estaVencido, pelo enunciado da questão, se pede para retornar um true or false, descrevi um método do tipo boolean passando por parâmetro uma dataAtual do tipo Data e realizando uma estrutura de comparação basicamente onde valida se as datas são umas maiores ou menores que as outras para resultar em uma data de validade.
    public boolean estaVencido(Data dataAtual){
        if(dataAtual.getAno() < DataValidade.getAno()){
            return true;
        } else if(dataAtual.getAno() == DataValidade.getAno() && dataAtual.getMes() < DataValidade.getMes()){
            return true;
        } else if(dataAtual.getAno() == DataValidade.getAno() && dataAtual.getMes() == DataValidade.getMes()){
            return true;
        } else{
            return false;
        }
    }
}
