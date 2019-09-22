package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        int choice = in.nextInt();

        ArrayList<Student> students = new ArrayList<>();

        Student firstStudent = new Student("Anton", "555", 3);
        Student secondStudent = new Student("Max", "333", 7);
        Student thirdStudent = new Student("Polina", "666", 5);
        Student fourthStudent = new Student("Alina", "555", 6);
        Student fifthStudent = new Student("Nastya", "123",1);
        Student sixthStudent = new Student("Zhenya", "321",2);
        Student seventhStudent = new Student("Vadim", "777",4);

        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirdStudent);
        students.add(fourthStudent);
        students.add(fifthStudent);
        students.add(sixthStudent);
        students.add(seventhStudent);

        switch (choice) {
            case 1:
                for (int left = 0; left < students.size(); left++) {
                    // Вытаскиваем значение элемента
                    Student value = students.get(left);
                    // Перемещаемся по элементам, которые перед вытащенным элементом
                    int i = left - 1;
                    for (; i >= 0; i--) {
                        // Если вытащили значение меньшее — передвигаем больший элемент дальше
                        if (value.getIDNumber().compareTo(students.get(i).getIDNumber()) < 0) {
                            students.set(i + 1, students.get(i));
                        } else {
                            // Если вытащенный элемент больше — останавливаемся
                            break;
                        }
                    }
                    // В освободившееся место вставляем вытащенное значение
                    students.set(i + 1, value);
                }

                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i).getIDNumber());
                }
                break;

            case 2:
                SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
                Collections.sort(students, sortingStudentsByGPA);

                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i).getPoint());
                }
                break;

            case 3:
                Student[] firstArray = new Student[]{firstStudent, secondStudent, thirdStudent, fourthStudent};
                Student[] secondArray = new Student[]{fifthStudent, sixthStudent, secondStudent};

                Student[] itogArray = new Student[firstArray.length + secondArray.length];
                System.arraycopy(firstArray, 0, itogArray, 0, firstArray.length);
                System.arraycopy(secondArray, 0, itogArray, firstArray.length, secondArray.length);

                MergeSort(itogArray, 0, itogArray.length - 1);

                for (int i = 0; i < itogArray.length - 1; i++) {
                    System.out.println(itogArray[i].getIDNumber());
                }
                break;

            default:
                break;
        }
    }

    static void MergeSort(Student[] students, int indexFirstElement, int indexLastElement) {

        if (indexLastElement <= indexFirstElement)
            return;

        int middle = indexFirstElement + (indexLastElement - indexFirstElement) / 2;
        MergeSort(students, indexFirstElement, middle);
        MergeSort(students, middle + 1, indexLastElement);

        Student[] bufferArray = Arrays.copyOf(students, students.length);

        for (int k = indexFirstElement; k <= indexLastElement; k++)
            bufferArray[k] = students[k];

        int i = indexFirstElement, j = middle + 1;
        for (int k = indexFirstElement; k <= indexLastElement; k++) {
            if (i > middle) {
                students[k] = bufferArray[j];
                j++;
            } else if (j > indexLastElement) {
                students[k] = bufferArray[i];
                i++;
            } else if (bufferArray[j].getIDNumber().compareTo(bufferArray[i].getIDNumber()) < 0) {
                students[k] = bufferArray[j];
                j++;
            } else {
                students[k] = bufferArray[i];
                i++;
            }
        }
    }
}




//    int[] first = new int[] {9, 5, 3, 1, 7};
//    int[] second = new int[] {2, 6, 8, 4};
//
//    int[] array1and2 = new int[first.length + second.length];
//                System.arraycopy(first, 0, array1and2, 0, first.length);
//                System.arraycopy(second, 0, array1and2, first.length, second.length);
//
//                        qwerty(array1and2, 0, array1and2.length - 1);
//                        for (int i = 0; i < array1and2.length; i++) {
//        System.out.println(array1and2[i]);
//        }
//        break;


//    static void qwerty(int[] a, int lo, int hi) {
//
//        if (hi <= lo)
//            return;
//        int mid = lo + (hi - lo) / 2;
//        qwerty(a, lo, mid);
//        qwerty(a, mid + 1, hi);
//
//        int[] buf = Arrays.copyOf(a, a.length);
//
//        for (int k = lo; k <= hi; k++)
//            buf[k] = a[k];
//
//        int i = lo, j = mid + 1;
//        for (int k = lo; k <= hi; k++) {
//
//            if (i > mid) {
//                a[k] = buf[j];
//                j++;
//            } else if (j > hi) {
//                a[k] = buf[i];
//                i++;
//            } else if (buf[j] < buf[i]) {
//                a[k] = buf[j];
//                j++;
//            } else {
//                a[k] = buf[i];
//                i++;
//            }
//        }
//    }