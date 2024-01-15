
//Classe
public class Data {
    int Dia;
    int Mes;
    int Ano;

    Data(){

    }

    //Método Construtor validando a data
    Data(int Dia, int Mes, int Ano) {
        boolean dataValida = validarData(Dia, Mes, Ano);
        if (dataValida) {
            this.Dia = Dia;
            this.Mes = Mes;
            this.Ano = Ano;
        } else {
            System.out.println("Data inválida. Utilizando data padrão: 1/1/2000");
            this.Dia = 1;
            this.Mes = 1;
            this.Ano = 2000;
        }
    }

    //Aqui abaixo temos um método que valida se o ano é bissexto ou não de acordo com a divisão pois os anos bissextos são aqueles divididos por 4 e o resultado é 0, que são divididos por 100 mas são diferentes de 0 ou divididos por 400 com resultado igual a 0 
    public boolean isAnoBissexto(int Ano) {
        if ((Ano % 4 == 0 && Ano % 100 != 0) || Ano % 400 == 0) {
            return true;
        }
        return false;
    }

    // Método para validar a data, neste caso, é utilizado um if, if else para que a data possa ser validada seguindo algumas "regras"
    //Aqui abaixo foi informando que será retornado um valor falso caso os dias e os meses não condigam com o calendário e específicamente o mês e dias de Fevereiro para determinarmos um ano bissexto
    public boolean validarData(int Dia, int Mes, int Ano) {
        if (Dia < 1 || Dia > 31 || Mes < 1 || Mes > 12 || Ano < 1) {
            return false;
        } else if (Mes == 2 && Dia > 29) {
            return false;
        } else if ((Mes == 4 || Mes == 6 || Mes == 9 || Mes == 11) && Dia > 30) {
            return false;
        } else if (Mes == 2 && Dia == 29 && !isAnoBissexto(Ano)) {
            return false;
        }
        return true;
    }

    //Método verificaAnoBissexto - Aqui utilizei de um cálculo matemático básico que determina no calendário quando um ano será bissexto ou não, caso seja, retornatá true
    public boolean verificaAnoBissexto(){
        if (Ano % 4 == 0 && (Ano % 100 != 0 || Ano % 400 == 0)){
            return true;
        } else{
        return false;
        }
    }

    //Métodos de Acesso - Get e Set
    public int getDia(){
        return Dia;
    }

    public void setDia(int Dia){
        this.Dia = Dia;
    }

    public int getMes(){
        return Mes;
    }

    public void setMes(int Mes){
        this.Mes = Mes;
    }

    public int getAno(){
        return Ano;
    }

    public void setAno(int Ano){
        this.Ano = Ano;
    }

    //Método toString
    public String toString(){
        return "Aqui, nós temos a data que inicia com o dia " + Dia + ", do mês de número " + Mes + " e do ano de " + Ano + "." ;
    }
}
