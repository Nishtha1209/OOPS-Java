package com.company;

public class PracticeSet6 {
    public static void main(String[] args) {
//        float []arr = {0.5f, 6.99f, 89.0f,45.321f,21.09f};
//        float sum = 0;
//        for (float element : arr){
//            sum = sum+element;
//        }
//        System.out.println(sum);

        //QUESTION 2
//        int []marks = {9,7,8,5,6,10};
//        int a = 15;
//        boolean isInArray = false;
//        for (int element : marks){
//            if (element==a){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("Element is in the array");
//        }
//        else{
//            System.out.println("Element is not in the array");
//        }

        //QUESTION 3
//        int []marks = {90,87,99,88,67,36};
//        int sum=0;
//        for (int element : marks){
//            sum =sum+element;
//        }
//        System.out.println("The average marks in Physics are: "+ sum/ marks.length);

        // QUESTION 4
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{7, 8, 9},
                {10, 11, 12}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) { //row number of time
            for (int j = 0; j < mat1[i].length; j++) { //column number of times
                System.out.format("Setting value for i = %d and j = %d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        //Printing the elements of a 2-d array
        for (int i = 0; i < mat1.length; i++) { //row number of time
            for (int j = 0; j < mat1[i].length; j++) { //column number of times
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); //Prints a new line
        }

        //QUESTION 5
        //reversing aN array
        /*int []arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n  = Math.floorDiv(arr.length,2);
        int temp;

        for (int i=0; i<n; i++){
            //swap a[i] and a[l-i-1]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
            }
        for (int element : arr){
            System.out.print(element+" ");
        }*/

        //QUESTION 6
        /*int []arr = {56,7,8,9,0,23,4,5};
        int max = 0;
        for (int item: arr){
            if (item>max){
                max=item;
            }
        }
        System.out.println("The max value in array is "+max );*/

        //QUESTION 7
        /*int arr[]= {5,6,7,980,23,4,45,43,21,1,2};
        int min=Integer.MAX_VALUE;
        for (int e:arr){
            if (e<min){
                min=e;
            }
        }
        System.out.println("The minimum element in this array is "+min);*/

        //QUESTION 8
        int []arr = {5,6,7,50,87};
        boolean isSorted = true;
        for (int i = 0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }
    }
}