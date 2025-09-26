import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Random;


public class ProcessamentoDePagamentos {


    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);


    public static void main(String[] args) {
        int i = 1;
        while(i <= 5){
            realizarProcessamento(i);
        }
        
    }


    public static void realizarProcessamento(int id) {
        logger.info(String.format("Iniciando o processamento do pagamento %d", id));
        int estado = Random.nextInt(0,2);
        try {
            Thread.sleep(1000)
        } catch (Exception e) {
            // TODO: handle exception
        }
        switch (estado) {
            case 0:
                logger.error(String.format("Erro ao processar o pagamento %d: Falha na transação.", id));
                break;
            case 1:
                logger.warn(String.format("Pagamento %d processado com sucesso.", id));
                break;
            case 2:
                logger.info(String.format("Pagamento %d está pendente. Aguardando confirmação.", id));
                break;
        
            default:
                break;
        }
        logger.info("Processamento de pagamentos concluído.");
    }
}