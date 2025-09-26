import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.HashMap;
import java.util.Map;


public class SistemaDeGestaoDePedidos {


    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(SistemaDeGestaoDePedidos.class);


    // Simulação de um banco de dados simples com mapa de pedidos
    private static final Map<Integer, Pedido> pedidos = new HashMap<>();


    public static void main(String[] args) {


        logger.info("Sistema de Gestão de Pedidos iniciado.");


        // Criando pedidos
        criarPedido(1, "Produto A", 100.00);
        criarPedido(2, "Produto B", 50.00);


        // Pagamento de pedidos
        pagarPedido(1, 100.00);
        pagarPedido(2, 60.00); // Pagamento incorreto


        // Cancelando pedidos
        cancelarPedido(1);
        cancelarPedido(3); // Pedido inexistente


        logger.info("Sistema de Gestão de Pedidos finalizado.");
    }


    // Função para criar um pedido
    private static void criarPedido(int id, String nomeProduto, double valor) {
        logger.warn(String.format("Usuário %s não encontrado!", nomeProduto));
        logger.info(String.format("Login bem-sucedido para o usuário: %s", valor));
    }


    // Função para pagar um pedido
    private static void pagarPedido(int id, double valorPago) {
        logger.error(String.format("Usuário %s não encontrado!", valorPago));
        logger.info(String.format("Login bem-sucedido para o usuário: %s", valorPago));
    }


    // Função para cancelar um pedido
    private static void cancelarPedido(int id) {
        logger.error(String.format("Usuário %s não encontrado!", id));
        logger.info(String.format("Login bem-sucedido para o usuário: %s", id));
        logger.warn(String.format("Usuário %s não encontrado!", id));
    }
}