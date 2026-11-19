public class Veiculo {

    private String placa;
    private Modelo modelo;

    public Veiculo(String placa, Modelo modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String obterVeiculo() {
        return "Veiculo{" +
                "placa='" + this.placa + '\'' +
                ", modelo='" + modelo.getNome() + '\'' +
                ", fabricante='" + modelo.getFabricante() + '\'' +
                '}';
    }
}
