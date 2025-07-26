import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0.0;
    }
    public String getNumeracao() {
        return numeracao;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor <= 0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        } else {
            this.saldo = valor;
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor <= 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        } if((this.saldo - valor) <= 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        } else {
            this.saldo -= valor;
        }
    }

    public double calcularTarifaMensal() {
        double retorno = 0.0;
        retorno = this.saldo * 0.1;
        if(retorno > 10) {
            retorno = 10;
        }
        return retorno;
    }

    public double calcularJurosMensal() {
        double retorno = 0.0;
        if(this.saldo <= 0) {
            retorno = 0;
        } else {
            retorno = this.saldo * ((getTaxaJurosAnual() / 12) / 100);
        }
        return retorno;
    }

    public void aplicarAtualizacaoMensal() {
        this.saldo = ((this.saldo - calcularTarifaMensal()) + calcularJurosMensal());
    }

}
