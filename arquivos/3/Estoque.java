import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private String fileName;

    private List<Produto> listaProdutos;

    public Estoque(String paramString) {
        this.fileName = paramString;
        listaProdutos = getListaProduto();
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        int novoId = getMaiorId() + 1;
        Produto produto = new Produto(novoId, nome, quantidade, preco);
        this.listaProdutos.add(produto);
        atualizarArquivo();
    }

    public void excluirProduto(int idExcluir) {
        this.listaProdutos.removeIf(p -> p.getId() == idExcluir);
        atualizarArquivo();
    }

    public void exibirEstoque() {
        for (Produto produto : this.listaProdutos) {
            System.out.println(produto);
        }
    }

    public void atualizarQuantidade(int idAtualizar, int novaQuantidade) {
        for (Produto p : this.listaProdutos) {
            if (p.getId() == idAtualizar) {
                p.setQuantidade(novaQuantidade);
            }
        }
        atualizarArquivo();
    }

    private List<Produto> getListaProduto() {
        ArrayList<Produto> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName))) {
            String linhaString = br.readLine();
            while (linhaString != null) {
                String[] linhaArray = linhaString.split(",");
                Produto produto = new Produto(
                        Integer.parseInt(linhaArray[0]),
                        linhaArray[1],
                        Integer.parseInt(linhaArray[2]),
                        Double.parseDouble(linhaArray[3]));
                lista.add(produto);
                linhaString = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private int getMaiorId() {
        Produto maiorId = this.listaProdutos.get(0);
        for (Produto p : this.listaProdutos) {
            if (p.getId() > maiorId.getId()) {
                maiorId = p;
            }
        }
        return maiorId.getId();
    }

    private void atualizarArquivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.fileName))) {
            for (int i = 0; i < this.listaProdutos.size(); i++) {
                Produto produtoItem = this.listaProdutos.get(i);
                String produtoStr = produtoItem.toCsv();
                if (i != this.listaProdutos.size() - 1) {
                    produtoStr += "\n";
                }
                bw.write(produtoStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
