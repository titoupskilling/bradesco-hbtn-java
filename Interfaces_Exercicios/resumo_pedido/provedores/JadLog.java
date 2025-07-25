package provedores;

public class JadLog implements ProvedorFrete {

    TipoProvedorFrete tipoProvedorFrete = TipoProvedorFrete.JADLOG;

    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();
        frete.setTipoProvedorFrete(tipoProvedorFrete);
        if(peso > 2000){
            frete.setValor(valor * 0.07);
        } else {
            frete.setValor(valor * 0.045);
        }
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return tipoProvedorFrete;
    }
}
