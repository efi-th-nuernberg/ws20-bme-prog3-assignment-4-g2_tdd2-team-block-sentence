import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);

    }
    @Test
    public void testIsoscelesTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);  

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);

    }

    @Test
    public void testEquilateralTriangle() {

        // Arrange
        float a = 3;
        float b = 3;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);  

        // Assert
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);

    }

     @Test
    public void testEquilateralNegativeTriangle() {

        // Arrange
        float a = -3;
        float b = -3;
        float c = -3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);  

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

        @Test
    public void testIsoscelesNegativeTriangle() {

        // Arrange
        float a = -2;
        float b = -3;
        float c = -3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);  

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

    @Test
    public void testValidNegativeTriangle() {

        // Arrange
        float a = -2;
        float b = -3;
        float c = -4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

     @Test
    public void testOverlengthTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 100;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

     @Test
    public void testSecondIsoscelesTriangle() {

        // Arrange
        float a = -2;
        float b = -4;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

    @Test
    public void testSecondEquilateralTriangle() {

        // Arrange
        float a = -4;
        float b = -4;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

}
