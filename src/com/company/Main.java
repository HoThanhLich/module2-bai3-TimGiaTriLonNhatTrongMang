package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap do lon cua mang:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("do lon khong duoc vuot qua 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Danh sach cua mang: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j;
            }
        }
        System.out.println("Gia tri lon nhat cua mang la: " + max + " ,tai vi tri thu " + index);
    }
}
