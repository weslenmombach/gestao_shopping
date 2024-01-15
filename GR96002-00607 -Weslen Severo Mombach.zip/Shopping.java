public class Shopping {
    String Nome;
    Endereco Endereco;
    Loja[] lojas;

     Shopping(String Nome, Endereco Endereco, int quantidadeMaximaLojas) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
            //Realizando esta etapa do código eu percebi que precisaria realizar um constutor novo na classe Loja para poder passar a capacidade de Lojas que o Shopping poderia receber 
    }


    //Métodos de acesso get e set
    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public Endereco getEndereco(){
        return Endereco;
    }

    public void setEndereco(Endereco Endereco){
        this.Endereco = Endereco;
    }

    public Loja[] getLojas(){
        return lojas;
    }

    public void setLojas(Loja[] Lojas){
        this.lojas = Lojas;
    }

    // Método toString
    public String toString(){
    return "Aqui temos o nome da loja do Shopping " + Nome + " juntamente com o seu endereço que é " + Endereco + " e também sua loja e características " + lojas + "."; 
    }

    //Método insereLoja
    public boolean insereLoja(Loja novaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = novaLoja;
                return true;
            }
        } return false;
    }
    //Basicamente aqui acima foi realizado um método que faz o percorrimento do array Lojas do tipo Loja buscando a primeira posição de valor null, se por acaso tiver um valor nulo ele insere uma nova Loja, caso não tenha mais lugares para posicionar uma nova loja, ele retorna um false

    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equals(nomeLoja)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }
    //Basicamente aqui foi realizada a mesma questão do método acima porém utilizando do .equals para comparar os valores (nome das lojas no caso) de Lojas e realizar a remoção. Caso ele ache uma Lojas com o nome solicitado, acaba removendo, se não achar, ele retorna um false.

    //Método quantidadeLojasPorTipo
    //Aqui, basicamente foi passado uma String tipoLoja como entrada por parâmetro
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int quantidade = 0;

        if (tipoLoja.equalsIgnoreCase("Alimentação") || tipoLoja.equalsIgnoreCase("Bijuteria") || tipoLoja.equalsIgnoreCase("Cosmético") ||tipoLoja.equalsIgnoreCase("Informática") && tipoLoja != null){
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] instanceof Alimentacao && tipoLoja.equalsIgnoreCase("Alimentação")) {
                quantidade++;
            }else if(lojas[i] instanceof Bijuteria && tipoLoja.equalsIgnoreCase("Bijuteria")){
                quantidade++;
            }else if(lojas[i] instanceof Cosmetico && tipoLoja.equalsIgnoreCase("Cosmético")){
                quantidade++;
            }else if(lojas[i] instanceof Informatica && tipoLoja.equalsIgnoreCase("Informática")){
                quantidade++;
            }else if(lojas[i] instanceof Vestuario && tipoLoja.equalsIgnoreCase("Vestuario")){
                quantidade++;
            }
            //Aqui acima o código verifica a String tipoLoja se ela corresponde a um dos tipos de loja descritos utilizando do equalsIgnoreCase e se tipoLoja é diferente de um valor nulo. Caso seja true, é realizado um for para a validação de se o tipo de loja é igual a um dos tipoLoja descritas e caso seja, percorre um array de lojas contando quantas lojas daquele tipo tem.
            //Logo após isso, ele retorna a quantidade das lojas e caso não seja válido o tipoLoja, retorna o -1
        }
        return quantidade;
    } else {
        return -1;
        }
    }

    //Método lojaSeguroMaisCaro
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double valorSeguroMaximo = 0.0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                double valorSeguro = informatica.getSeguroEletronicos();
                //Aqui o valor do seguro é recebido através o método get do SeguroEltronicos da loja Informatica.

                if (valorSeguro > valorSeguroMaximo) {
                    valorSeguroMaximo = valorSeguro;
                    lojaMaisCara = informatica;
                }
            } 
        }
        return lojaMaisCara;
    }
    //Basicamente esse método verifica se a loja é uma instância de Informatica através do instanceof e pega o valor de SeguroEletronicos. Com isso, caso tenha uma loja Informatica com um valor de seguro (valorSeguroMaximo) e o novo valor do seguro seja maior, ele assume essa posição ficando como seguro mais caro da loja atual.
}
