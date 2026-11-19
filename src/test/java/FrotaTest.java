import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FrotaTest {

    @Test
    void deveRetornarVeiculos() {
        Frota frota = new Frota();
        frota.adicionar("ABC1D23", "Paradiso 1200", "Marcopolo");
        frota.adicionar("DEF4G56", "Paradiso 1200", "Marcopolo");
        frota.adicionar("GHI7J89", "Paradiso 1200", "Marcopolo");
        frota.adicionar("JKL0M12", "O500", "Mercedes-Benz");

        List<String> saida = Arrays.asList(
                "Veiculo{placa='ABC1D23', modelo='Paradiso 1200', fabricante='Marcopolo'}",
                "Veiculo{placa='DEF4G56', modelo='Paradiso 1200', fabricante='Marcopolo'}",
                "Veiculo{placa='GHI7J89', modelo='Paradiso 1200', fabricante='Marcopolo'}",
                "Veiculo{placa='JKL0M12', modelo='O500', fabricante='Mercedes-Benz'}");

        assertEquals(saida, frota.obterVeiculos());
    }

    @Test
    void deveRetornarTotalModelos() {
        Frota frota = new Frota();
        frota.adicionar("ABC1D23", "Paradiso 1200", "Marcopolo");
        frota.adicionar("DEF4G56", "Paradiso 1200", "Marcopolo");
        frota.adicionar("GHI7J89", "Paradiso 1200", "Marcopolo");
        frota.adicionar("JKL0M12", "O500", "Mercedes-Benz");

        assertEquals(2, ModeloFactory.getTotalModelos());
    }

    @Test
    void deveReaproveitarMesmoModelo() {
        Modelo primeiro = ModeloFactory.getModelo("Paradiso 1200", "Marcopolo");
        Modelo segundo = ModeloFactory.getModelo("Paradiso 1200", "Marcopolo");

        assertSame(primeiro, segundo);
    }

}
