package etc.array;

import java.util.Arrays;

// «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо
//вставить игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних
//ячейках сумма точек на передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от
//1 до 6 точек). Напишите программу, которая разгадывает код замка при условии, что два кубика уже
//вставлены в ячейки.
public class Task18 {
    public static void main(String[] args) {
        int[] password = new int[10];
        int[] position = new int[2];
        boolean unlock = false;
        for (int i = 0; i < position.length; i++) {
            int index = (int) (Math.random() * password.length);
            position[i] = index;
            password[index] = (int) (Math.random() * 6 + 1);

        }
        for (int i = 0; i < password.length; i++) {
            System.out.print(password[i] + " ");
        }
        System.out.println();
        while (!unlock) {
            for (int i = 0; i < password.length; i++) {
                boolean fill = true;
                for (int y = 0; y < position.length; y++) {
                    if (i == position[y]) {
                        fill = false;
                        break;
                    }
                }
                if (fill) {
                    password[i] = (int) (Math.random() * 6 + 1);
                }
            }
            unlock = isUnlock(password);
        }
        System.out.println(Arrays.toString(password));
    }

    static boolean isUnlock(int[] mas) {
        for (int i = 0; i < mas.length - 3; i++) {
            if (mas[i] + mas[i + 1] + mas[i + 2] == 10) {
                return true;
            }
        }
        return false;
    }

}
