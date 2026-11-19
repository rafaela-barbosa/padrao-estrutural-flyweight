import java.util.HashMap;
import java.util.Map;

public class ModeloFactory {

    private static Map<String, Modelo> modelos = new HashMap<>();

    public static Modelo getModelo(String nome, String fabricante) {
        String chave = nome + "-" + fabricante;
        Modelo modelo = modelos.get(chave);
        if (modelo == null) {
            modelo = new Modelo(nome, fabricante);
            modelos.put(chave, modelo);
        }
        return modelo;
    }

    public static int getTotalModelos() {
        return modelos.size();
    }
}
