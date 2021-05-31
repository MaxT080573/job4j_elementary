package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {

        int count = 0;
        for (int row = 0; row < height; row++) {
            for (int index = 0; index <= width; index++) {
                /* условие проверки, что писать пробел или X */
                  if ((index + row) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            count = count + 1;
            /* добавляем перевод на новую строку. */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
