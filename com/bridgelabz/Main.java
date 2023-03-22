package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        // Test cases
        FindMax<Float> maxfloat = new FindMax<Float>();
        float max1 = maxfloat.getMax(3.2f,2.8f,4.6f);
        float max2 = maxfloat.getMax(1.3f, 3.5f, 2.6f);
        float max3 = maxfloat.getMax(1.6f, 3.7f, 4.6f);

        System.out.println("Max of 10, 5, 75 is: " + max1);
        System.out.println("Max of 10, 30, 20 is: " + max2);
        System.out.println("Max of 155, 375, 200 is: " + max3);


    }
}

