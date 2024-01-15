public class Loja {
    String Nome;
    int QuantidadeFuncionarios;
    double SalarioBaseFuncionario;
    Endereco Endereco; 
    Data DataFundacao;
    Produto[] EstoqueProdutos;

    //Aqui eu criei vários métodos construtores pois tenho várias chamadas de métodos diferentes

    //Método construtor para validador da Etapa1
    Loja(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco Endereco, Data DataFundacao, int quantidadeMaximaProdutos){
        this.Nome = Nome;
        this.QuantidadeFuncionarios = QuantidadeFuncionarios;
        this.Endereco = Endereco;
        this.DataFundacao = DataFundacao;
        this.EstoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    Loja(String Nome, int QuantidadeFuncionarios){
        this.Nome = Nome;
        this.QuantidadeFuncionarios = QuantidadeFuncionarios;
        this.SalarioBaseFuncionario = -1;
    }

    Loja(String Nome, int QuantidadeFuncionarios, Endereco Endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
        this.Nome = Nome;
        this.QuantidadeFuncionarios = QuantidadeFuncionarios;
        this.Endereco = Endereco;
        this.DataFundacao = dataFundacao;
        this.EstoqueProdutos = new Produto[quantidadeMaximaProdutos];
    } 

    //Método que construtor que tem -1 no SalarioBaseFuncionario
    Loja(String Nome, int QuantidadeFuncionarios, Endereco Endereco, Data DataFundacao){
        this.Nome = Nome;
        this.QuantidadeFuncionarios = QuantidadeFuncionarios;
        this.SalarioBaseFuncionario = -1;
        this.Endereco = Endereco;
        this.DataFundacao = DataFundacao;
    }

    Loja(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco Endereco, Data DataFundacao){
        this.Nome = Nome;
        this.QuantidadeFuncionarios = QuantidadeFuncionarios;
        this.SalarioBaseFuncionario = SalarioBaseFuncionario;
        this.Endereco = Endereco;
        this.DataFundacao = DataFundacao;
    }

    //Construtores da Etapa4

    Loja(int quantidadeProdutos){
        this.EstoqueProdutos = new Produto[quantidadeProdutos];
    }

    Loja(String Nome, Endereco Endereco, Data DataFundacao){
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.DataFundacao = DataFundacao;
    }

    Loja(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario){
        this.Nome = Nome;
        this.QuantidadeFuncionarios = QuantidadeFuncionarios;
        this.SalarioBaseFuncionario = -1;
    }

    //Métodos de acesso Get e Set
    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public int getQuantidadeFuncionarios(){
        return QuantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int QuantidadedeFuncionarios){
        this.QuantidadeFuncionarios = QuantidadedeFuncionarios;
    }

    public double getSalarioBaseFuncionario(){
        return SalarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double SalarioBaseFuncionario){
        this.SalarioBaseFuncionario = SalarioBaseFuncionario;
    }

    public Endereco getEndereco(){
        return Endereco;
    }

    public void setEndereco(Endereco Endereco){
        this.Endereco = Endereco;
    }

    public Data getDataFundacao(){
        return DataFundacao;
    }

    public void setDataFundacao(Data DataFundacao){
        this.DataFundacao = DataFundacao;
    }

    public Produto[] getEstoqueProdutos(){
        return EstoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] EstoqueProdutos){
        this.EstoqueProdutos = EstoqueProdutos;
    }

    //Método toString com atualizações
    public String toString(){
        return "Aqui temos o nome " + Nome + " juntamente com o número de funcionários que são " + QuantidadeFuncionarios + " e seus salários base que são: " + SalarioBaseFuncionario + ". Com isso, a empresa foi fundada em " + DataFundacao + " e se localiza no endereço: " + Endereco + "." + "Com isso, temos agora também a questão do estoque de produtos que seriam: " + EstoqueProdutos;
    }
    
    // Método gastosComSalario
    public double gastosComSalario() {
        if (SalarioBaseFuncionario == -1){
            return -1;
        } else {
            return QuantidadeFuncionarios * SalarioBaseFuncionario;
        }
    }

    //Método tamanhoDaLoja
    public char tamanhoDaLoja(){
        if(QuantidadeFuncionarios < 10){
            return 'P';
        } else if (QuantidadeFuncionarios > 10 && QuantidadeFuncionarios < 30){
            return 'M';
        } else {
            return 'G';
        }
    }

    //Método imprimeProdutos
    public  void imprimeProdutos(){
        //Aqui eu basicamente criei o método e crio uma condição para que seja impresso um produto caso haja. Caso o produto seja diferente de null, ele será impresso via método toString
        System.out.println("Produtos da Loja:");
        if(EstoqueProdutos.length == 0){
            System.out.println("Nenhum produto armazenado em estoque");
        } else {
            for(Produto Produto : EstoqueProdutos){
                if (Produto != null){
                    System.out.println(Produto.toString());
                }
            }
        }
    }

    //Método insereProduto
    public boolean insereProduto(Produto Produto){
        for(int i = 0; i < EstoqueProdutos.length; i++){
            if(EstoqueProdutos[i] == null){
                EstoqueProdutos[i] = Produto;
                return true;
            }
        }
        return false;
    }
    //Aqui basicamente criei um método de incremento nos meus arrays para que os produtos sejam inseridos até acabar o número de posições do meu EstoqueProdutos, informando que quando encontrar uma posição vazia em EstoqueProdutos ele irá retornar um true e irá incerementar, quando não tiver espaço, retornará um false.

    //Criação do método removeProduto
    public boolean removeProduto(String nomeProduto){
        for(int i = 0; i < EstoqueProdutos.length; i++){
            if (EstoqueProdutos[i] != null && EstoqueProdutos[i].getNome().equals(nomeProduto)) {
                EstoqueProdutos[i] = null;
                return true; 
            }
        }
        return false;
    }
    //Basicamente aqui eu realizei um método passando uma nova String por parâmetro que se refere ao nome do produto a ser removido. Ele verifica se a posição de i não é nula e se o nome do produto informado corresponde certinho. Se é encontrado, ele será removido. Caso não encontre, retornará um false. Desta forma, teremos um gestor de produtos para quando algum for vendido ou retirado, informando quantos teriam em estoque.
}

//Herança - Implementação da SubClasse Cosmetico
class Cosmetico extends Loja {
     int TaxaComercializacao;
    public Cosmetico(String Nome, Endereco Endereco, Data DataFundacao, int taxaComercializacao) {
        super(Nome, Endereco, DataFundacao);
        this.TaxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco Endereco, Data DataFundacao, int taxaComercializacao, int quantidadeMaximaProdutos){
        super(Nome, QuantidadeFuncionarios, SalarioBaseFuncionario, Endereco, DataFundacao);
        this.TaxaComercializacao = taxaComercializacao;
        this.EstoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    public Cosmetico(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco Endereco, Data DataFundacao, int taxaComercializacao){
        super(Nome, QuantidadeFuncionarios, SalarioBaseFuncionario, Endereco, DataFundacao);
        this.TaxaComercializacao = taxaComercializacao;
    }


    //Métodos de acesso Get e Set
    public int getTaxaComercializacao(){
        return TaxaComercializacao;
    }

    public void setTaxaComercializacao(int TaxaComercializacao){
        this.TaxaComercializacao = TaxaComercializacao;
    }

    public Produto[] getEstoqueProdutos() {
        return EstoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        EstoqueProdutos = estoqueProdutos;
    }

    //Método de Acesso toString
    public String toString() {
        return super.toString() + " e também temos a Taxa de Comercialização: " + TaxaComercializacao + ".  ";
    }
}
    //Herança - Implementação da SubClasse Vestuario
class Vestuario extends Loja {
    boolean ProdutosImportados;
   public Vestuario(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco Endereco, Data DataFundacao, boolean ProdutosImportados) {
       super(Nome, Endereco, DataFundacao);
       this.ProdutosImportados = ProdutosImportados;
   }

   //Método construtor da Etapa4
   public Vestuario(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco Endereco, Data DataFundacao, boolean ProdutosImportados, int quantidadeMaximaProdutos) {
    super(Nome, Endereco, DataFundacao);
    this.ProdutosImportados = ProdutosImportados;
    this.EstoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

   //Métodos de acesso Get e Set
   public boolean getProdutosImportados(){
       return ProdutosImportados;
   }

   public void setProdutosImportados(boolean ProdutosImportados){
       this.ProdutosImportados = ProdutosImportados;
   }

   public Produto[] getEstoqueProdutos() {
    return EstoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
    EstoqueProdutos = estoqueProdutos;
    }

   public String toString() {
       return super.toString() + " Também temos os Produtos Importados: " + ProdutosImportados + ".  ";
   }
}
//Herança - Implementação da SubClasse 
class Bijuteria extends Loja {
    int MetaVendas;
   public Bijuteria(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco Endereco, Data DataFundacao, int MetaVendas) {
       super(Nome, Endereco, DataFundacao);
       this.MetaVendas = MetaVendas;
   }

   //Método construtor da Etapa4
   public Bijuteria(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco Endereco, Data DataFundacao, int MetaVendas, int quantidadeMaximaProdutos) {
    super(Nome, QuantidadeFuncionarios, SalarioBaseFuncionario, Endereco, DataFundacao);
    this.MetaVendas = MetaVendas;
    this.EstoqueProdutos = new Produto[quantidadeMaximaProdutos];
}

   //Métodos de acesso Get e Set
   public int getMetaVendas(){
       return MetaVendas;
   }

   public void setMetaVendas(int MetaVendas){
       this.MetaVendas = MetaVendas;
   }

   public Produto[] getEstoqueProdutos() {
    return EstoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
    EstoqueProdutos = estoqueProdutos;
    }

   public String toString() {
       return super.toString() + " Também temos as metas de vendas: " + MetaVendas + ".  ";
   }
}

class Alimentacao extends Loja {
    Data DataAlvara;
   public Alimentacao(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco Endereco, Data DataFundacao, Data DataAlvara) {
       super(Nome, Endereco, DataFundacao);
       this.DataAlvara = DataAlvara;
   }

   //Método construtor da Etapa4
   public Alimentacao(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco Endereco, Data DataFundacao, Data DataAlvara, int quantidadeMaximaProdutos) {
    super(Nome, QuantidadeFuncionarios, SalarioBaseFuncionario, Endereco, DataFundacao);
    this.DataAlvara = DataAlvara;
    this.EstoqueProdutos = new Produto[quantidadeMaximaProdutos];
}
   
   //Métodos de acesso Get e Set
   public Data getDataAlvara(){
       return DataAlvara;
   }

   public void setDataAlvara(Data DataAlvara){
       this.DataAlvara = DataAlvara;
   }

   public Produto[] getEstoqueProdutos() {
    return EstoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
    EstoqueProdutos = estoqueProdutos;
    }

   public String toString() {
       return super.toString() + " Também temos a data de liberação do Alvará de funcionamento da Loja: " + DataAlvara + ".  ";
   }
}

class Informatica extends Loja {
    int SeguroEletronicos;
   public Informatica(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco Endereco, Data DataFundacao, int SeguroEletronicos) {
       super(Nome, Endereco, DataFundacao);
       this.SeguroEletronicos = SeguroEletronicos;
   }

    //Método construtor da Etapa4
    public Informatica(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco Endereco, Data DataFundacao, int SeguroEletronicos, int quantidadeMaximaProdutos) {
        super(Nome, QuantidadeFuncionarios, SalarioBaseFuncionario, Endereco, DataFundacao);
        this.SeguroEletronicos = SeguroEletronicos;
        this.EstoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

   //Métodos de acesso Get e Set
   public int getSeguroEletronicos(){
       return SeguroEletronicos;
   }

   public void setSeguroEletronicos(int SeguroEletronicos){
       this.SeguroEletronicos = SeguroEletronicos;
   }

   public Produto[] getEstoqueProdutos() {
    return EstoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
    EstoqueProdutos = estoqueProdutos;
    }

   public String toString() {
       return super.toString() + " Também temos a o Seguro de Eletrônicos vendido pela loja de informática: " + SeguroEletronicos + ".  ";
   }
}
