package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        // Test cases
        FindMax<String> maxString = new FindMax<String>();
        String max1 = maxString.getMax("r","s","g");
        String max2 = maxString.getMax("A","p","z");


        System.out.println("Max of r , s, g is: " + max1);
        System.out.println("Max of A, p, z is: " + max2);



    }
}

