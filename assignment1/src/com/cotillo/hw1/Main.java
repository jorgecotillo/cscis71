package com.cotillo.hw1;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        }
        else {
            System.out.println("hw1: Pass at least one argument ...");
        }
    }
}
