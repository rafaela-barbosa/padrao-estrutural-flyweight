public class Modelo {

    private String nome;
    private String fabricante;

    public Modelo(String nome, String fabricante) {
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }
}
