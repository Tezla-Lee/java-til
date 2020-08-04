package day6;

/**
 * MyMath 클래스 구현하기
 * 인스턴스를 생성할 수 없는 MyMath 클래스를 구현하시오.
 *
 * MyMath 클래스는 다음 정적 변수를 가진다.
 * PI = 3.1415927;
 * E = 2.718281;
 *
 * MyMath 클래스는 다음 정적 메소드를 가진다.
 * min - 정수 또는 실수를 여러개 입력받아 최소값을 구한다.
 * max - 정수 또는 실수를 여러개 입력받아 최대값을 구한다.
 * abs - 정수 또는 실수를 입력받아 절대값을 구한다.
 * floor - 실수를 입력받아 내림 연산한 정수를 출력한다.
 * ceil - 실수를 입력받아 올림 연산한 정수를 출력한다.
 */
public class MyMath {

    static double PI = 3.1416927;
    static double E = 2.718281;

    private static int min(int...params) {
        int min = 0;
        for (int value : params) {
            min = min < value ? min : value;
        }
        return min;
    }

    private static double min(double...params) {
        double min = 0;
        for (double value : params) {
            min = min < value ? min : value;
        }
        return min;
    }

    private static int max(int...params) {
        int max = 0;
        for (int value : params) {
            max = max > value ? max : value;
        }
        return max;
    }

    private static double max(double...params) {
        double max = 0;
        for (double value : params) {
            max = max > value ? max : value;
        }
        return max;
    }

    private static int abs(int x) {
        return Math.abs(x);
    }

    private static double abs(double x) {
        return Math.abs(x);
    }

    private static double floor(double x) {
        return Math.floor(x);
    }

    private static  double ceil(double x) {
        return Math.ceil(x);
    }
}

class MyMathTest {
    public static void main(String[] args) {
    }
}
