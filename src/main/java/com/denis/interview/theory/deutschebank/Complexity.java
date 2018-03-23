package com.denis.interview.theory.deutschebank;

public class Complexity {

    public static int foo(int n) {

        if (n <= 0) {
            int m = 0;

            for (int i = 0; i < n; i++) {
                m = (int) (3.14 + 2 * m);
            }

            return m;
        } else {
            return 2 * foo(n - 1) + 3 * foo(n - 2);
        }
    }

}
