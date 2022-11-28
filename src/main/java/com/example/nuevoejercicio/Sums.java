package com.example.nuevoejercicio;

public class Sums {
    public static void main(String[] args) throws Exception {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int res = 0;
        for (int i=n1;i<n2;i++){
            res=res+i;
        }
        System.out.println("el sumatorio vale "+ res);
        System.exit(0);
    }
}
