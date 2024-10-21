import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    TriangleClassifier classifier = new TriangleClassifier();
    @Test
    @DisplayName("Test tam giac deu")
    void testTamGiacDeu() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giac deu";
        String result = classifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test tam giac can")
    void testTamGiacCan() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam giac can";
        String result = classifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test tam giac thuong")
    void testTamGiacThuong() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam giac thuong";
        String result = classifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
}