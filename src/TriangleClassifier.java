import java.util.Scanner;

public class TriangleClassifier {
    public String classifyTriangle(int a, int b, int c) {
        if (a + b > c || a + c > b || b + c > a) {
            if (a == b && b == c) {
                return "Tam giac deu";
            } else if ((a == b) || (b == c) || (c == a)) {
                return "Tam giac can";
            } else {
                return "Tam giac thuong";
            }
        } else {
            return "Khong phai tam giac";
        }
    }
}
