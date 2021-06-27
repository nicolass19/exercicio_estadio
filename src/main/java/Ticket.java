

public class Ticket {

    private int cadeira = 11000;
    private String Nomepartida;
    private double valorCadeira;

    public int getCadeira() {
        return cadeira;
    }

    public Ticket setCadeira(int cadeira) {
        this.cadeira = cadeira;
        return this;
    }

    public String getNomepartida() {
        return Nomepartida;
    }

    public double getValorCadeira() {
        return valorCadeira;
    }

    public double CalculaValorIngressoDeAcordoComAssento(){

        if(setCadeira() >=1 && setCadeira()<=2500)
           return valorCadeira = 150.0;

        else if(setCadeira()<=5000 )
            return  valorCadeira = 200.0;

        else if(setCadeira()<=7500)
            return valorCadeira = 150.0;

        else if(setCadeira()<=10000)
            return valorCadeira = 200.0;

        else
            return valorCadeira = 450.0;

    }

    private int setCadeira() {
        this.cadeira = cadeira;
        return cadeira;
    }
}
