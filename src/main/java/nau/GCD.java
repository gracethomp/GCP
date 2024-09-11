package nau;

public class GCD {
    public int advancedGCD(int x, int y) {
        int d = 1;
        while (x % 2 == 0 && y % 2 == 0) {
            x /= 2;
            y /= 2;
            d *= 2;
        }
        int u = x, v = y;
        int A = 1, B = 0, C = 0, D = 1;
        do {
            while (u % 2 == 0) {
                u /= 2;
                if (A % 2 == 0 && B % 2 == 0) {
                    A /= 2;
                    B /= 2;
                } else {
                    A = (A + y) / 2;
                    B = (B - x) / 2;
                }
            }
            while (v % 2 == 0) {
                v /= 2;
                if (C % 2 == 0 && D % 2 == 0) {
                    C /= 2;
                    D /= 2;
                } else {
                    C = (C + y) / 2;
                    D = (D - x) / 2;
                }
            }
            if (u >= v) {
                u = u - v;
                A = A - C;
                B = B - D;
            } else {
                v = v - u;
                C = C - A;
                D = D - B;
            }
        } while (u != 0);
        return d * v;
    }

    public int findGCD(int ...numbers) {
        if (numbers.length == 0)
            return 0;

        int result = numbers[0];
        for (int w = 1; w < numbers.length; w++) {
            result = advancedGCD(result, numbers[w]);
            if (result == 1)
                break;
        }
        return result;
    }
}
