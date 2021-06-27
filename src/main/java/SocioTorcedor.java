

public class SocioTorcedor extends Torcedor{

    @Override
    public double ValorEntradaParaTorcedorAdulto() {
        return getValorCadeira() - getValorCadeira()*0.3;
    }

    @Override
    public double ValorEntradaParaMenor10Anos() {
        return  getValorCadeira()-getValorCadeira()*0.7;
    }
}
