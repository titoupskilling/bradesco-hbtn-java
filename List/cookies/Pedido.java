import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pedido {

    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int retorno = 0;
        for (int i = 0; i < cookies.size(); i++) {
            retorno += cookies.get(i).getQuantidadeCaixas();
        }
        return retorno;
    }

    public int removerSabor(String sabor) {
        int retorno = 0;
        Iterator<PedidoCookie> iterator = cookies.iterator();
        while (iterator.hasNext()) {
            PedidoCookie item = iterator.next();
            if(item.getSabor().equals(sabor)){
                retorno += item.getQuantidadeCaixas();
                iterator.remove();
            }
        }
        return retorno;
    }

    public List<PedidoCookie> getCookies() {
        return cookies;
    }

    public void setCookies(ArrayList<PedidoCookie> cookies) {
        this.cookies = cookies;
    }

}
