import java.io.*;
import java.util.Scanner;
/** клас Lab1ДенисякКІ305, виконує програму завдання згідно варіанту роботи */
public class Lab1ДенисякКІ305 {
	/** метод мейн - виконавчий метод */
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            /** Запитуємо розмір квадратної матриці */
            System.out.print("Введіть розмір квадратної матриці: ");
            int size = in.nextInt();
            in.nextLine();

            /** Ініціалізуємо масив */
            char[][] arr = new char[size][];
            
            /** Запитуємо символ-заповнювач */
            System.out.print("\nВведіть символ-заповнювач: ");
            String filler = in.nextLine();

            /** Перевірка введеного символу */
            if (filler.length() != 1) {
                System.out.println("Неправильний символ-заповнювач. Він має бути одинарним символом.");
                in.close();
                return;
            }
            
            for(int i = 0; i < size; i++)
            {
            arr[i]= new char[i+1];
            }

            /** Заповнюємо матрицю і виводимо її в консоль та файл */
            char fillChar = filler.charAt(0);
            try (PrintWriter fout = new PrintWriter(new File("MyFile.txt"))) {
                for (int i = 0; i < size; i++) {
                    arr[i] = new char[size];
                    for (int j = 0; j < size; j++) {
                        if (i + j >= size - 1) {
                            arr[i][j] = fillChar;
                        } 
                    }
                }

                /** Виводимо масив на екран та у файл */
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print(arr[i][j] + " ");
                        fout.print(arr[i][j] + " ");
                    }
                    System.out.println();
                    fout.println();
                }
            }

            System.out.println("Зубчатий масив записаний у файл MyFile.txt");
            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("Помилка: не вдалося створити файл.");
        }
    }
}