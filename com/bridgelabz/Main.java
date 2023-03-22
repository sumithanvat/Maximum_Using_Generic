package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        // Test cases
        FindMax<Integer> maxInteger = new FindMax<Integer>();
        Integer max1 = maxInteger.getMax(10, 5, 75);
        Integer max2 = maxInteger.getMax(10, 30, 20);
        Integer max3 = maxInteger.getMax(155, 375, 200);

        System.out.println("Max of 10, 5, 75 is: " + max1);
        System.out.println("Max of 10, 30, 20 is: " + max2);
        System.out.println("Max of 155, 375, 200 is: " + max3);


    }
}

