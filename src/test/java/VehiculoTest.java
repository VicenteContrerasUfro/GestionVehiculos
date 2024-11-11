import org.example.GestionVehiculos.Auto;
import org.example.GestionVehiculos.Bicicleta;
import org.example.GestionVehiculos.Camion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehiculoTest {

    @Test
    void testCrearAuto() {
        Auto auto = new Auto("Toyota", "Corolla", 2020, 20000, 4);
        assertEquals("Toyota", auto.getMarca());
        assertEquals("Corolla", auto.getModelo());
        assertEquals(2020, auto.getAño());
        assertEquals(20000, auto.getPrecio());
        assertEquals(4, auto.getNumPuertas());
    }

    @Test
    void testCrearCamion() {
        Camion camion = new Camion("Mercedes", "Actros", 2019, 50000, 18.5);
        assertEquals("Mercedes", camion.getMarca());
        assertEquals("Actros", camion.getModelo());
        assertEquals(2019, camion.getAño());
        assertEquals(50000, camion.getPrecio());
        assertEquals(18.5, camion.getCapacidadCarga());
    }

    @Test
    void testCrearBicicleta() {
        Bicicleta bicicleta = new Bicicleta("Specialized", "Rockhopper", 2021, 800, "Montaña");
        assertEquals("Specialized", bicicleta.getMarca());
        assertEquals("Rockhopper", bicicleta.getModelo());
        assertEquals(2021, bicicleta.getAño());
        assertEquals(800, bicicleta.getPrecio());
        assertEquals("Montaña", bicicleta.getTipoBicicleta());
    }
}
