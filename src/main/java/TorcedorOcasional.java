

public class TorcedorOcasional extends Torcedor{

    @Override
    public double ValorEntradaParaTorcedorAdulto() {
        return (float) getValorCadeira();
    }

    @Override
    public double ValorEntradaParaMenor10Anos() {
        return  getValorCadeira()-getValorCadeira()*0.5;
    }
}
