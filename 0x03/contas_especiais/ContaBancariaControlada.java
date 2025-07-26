public class ContaBancariaControlada extends ContaBancariaBasica {

    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        setSaldoMinimo(saldoMinimo);
        setValorPenalidade(valorPenalidade);
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        super.aplicarAtualizacaoMensal();
        if(getSaldo() < this.saldoMinimo){
            setSaldo(getSaldo() - this.valorPenalidade);
        }
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getValorPenalidade() {
        return valorPenalidade;
    }

    public void setValorPenalidade(double valorPenalidade) {
        this.valorPenalidade = valorPenalidade;
    }

    
}
