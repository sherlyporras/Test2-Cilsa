import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrianguloTest {

    @Test
    public void testNoEsTriangulo(){
        assertEquals(0,Triangulo.determinarTriangulo(2,4,7));
        assertEquals(0,Triangulo.determinarTriangulo(-2,-4,7));
    }
    @Test
    public void testIsoceles(){
        assertEquals(1,Triangulo.determinarTriangulo(7,7,3));
        assertEquals(1,Triangulo.determinarTriangulo(3,7,7));
        assertEquals(1,Triangulo.determinarTriangulo(7,3,7));
    }
    @Test
    public void testEscaleno(){
        assertEquals(2,Triangulo.determinarTriangulo(8,3,6));
    }
    @Test
    public void testEquilatero(){
        assertEquals(3,Triangulo.determinarTriangulo(4,4,4));

    }


}
