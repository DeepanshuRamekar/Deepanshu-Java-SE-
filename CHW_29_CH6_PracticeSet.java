package com.company;

public class CHW_29_CH6_PracticeSet {
    public static void main(String[] args) {
//        Problem 1:
    /*    float sum=0;
        float [] marks= {45.7f,67.6f,52.1f,80.2f,75.4f};
//        for (int i=0;i<marks.length;i++){
//            sum=sum + marks[i];
//        }
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("Summation: "+sum);
*/
//        Problem 2;
//        float num = 45.6f;
//        float [] marks= {45.7f,67.6f,52.1f,80.2f,75.4f};
//        boolean isInArray = false;
//        for (float element:marks){
//            if (num==element){
//                isInArray =  true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("the value is present in the Array");
//        }
//        else{
//            System.out.println("the value is not present in the Array");
//        }

//        Parctice 3:
//        float avg=0;
//        float [] marks= {45.7f,67.6f,52.1f,80.2f,75.4f};
//        for (float element:marks){
//            avg = avg + element;
//        }
//        System.out.println("The average of marks in physics subject is: "+avg/marks.length);

//        Problem 4:
    /*    int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{2,6,13},
                         {3,7,1}};
        int [][] result = {{0,0,0},
                           {0,0,0}};

        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.format("Setting values for i=%d and j=%d\n",i,j);
                result[i][j]= mat1[i][j] + mat2[i][j];
            }
        }
        for (int i=0;i<result.length;i++){
            for (int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        */
        /*
//        Problem 5:
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for (int i=0;i<n;i++){
//            Swap a[i] and a[l-i-1]
//            a  b  temp
//            |4| |3| | |
            temp = arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]= temp;
        }
        for (int element:arr){
            System.out.print(element +" ");
        }*/

//        Problem 6:
/*
        int [] arr ={1,3,5,8,2,6,10,12,45,35,45,45,45};
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (max<=arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max); */

//        problem 7:
/*
        int [] arr ={45,65,45,45,45};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>=arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);  */

//        Problem 8:
        boolean isSorted = true;
        int [] arr ={1,3,5,6,8,10,12,45,55};
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("The Array is not Sorted");
        }
    }
}
