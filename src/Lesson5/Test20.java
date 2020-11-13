package Lesson5;

public class Test20 {
    int summa(int x, int y, int z) {
        return x + y + z;
    }
}

class Test21 {
    public static void main(String[] args) {
        Test20 t = new Test20();
        System.out.println(t.summa(1, 2, 3));
    }
}