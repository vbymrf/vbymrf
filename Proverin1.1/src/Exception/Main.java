package Exception;

import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int а = 88, b = 0;
        int result;
        char chrs[] = {'А', 'В', 'С'};
        for (int i = 0; i < 2; i++) {
            try {

                if (i == 0)
// Сгенерировать исключение ArithmeticException
                    result = а / b;
                else
// Сгенерировать исключение ArrayindexOutOfBoundsException
                    chrs[5] = 'Х';
// В этом операторе catch организуется перехват
// обоих исключений
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException е) {
                System.out.println("Пepexвaчeннoe исключение: " + е);
                System.out.println("Пocлe группового перехватчика исключений");

            }

        }
    }}

