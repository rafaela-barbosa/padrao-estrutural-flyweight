import java.util.ArrayList;
import java.util.List;

public class Frota {

    private List<Veiculo> veiculos = new ArrayList<>();

    public void adicionar(String placa, String nomeModelo, String fabricante) {
        Modelo modelo = ModeloFactory.getModelo(nomeModelo, fabricante);
        Veiculo veiculo = new Veiculo(placa, modelo);
        veiculos.add(veiculo);
    }

    public List<String> obterVeiculos() {
        List<String> saida = new ArrayList<String>();
        for (Veiculo veiculo : this.veiculos) {
            saida.add(veiculo.obterVeiculo());
        }
        return saida;
    }
}
