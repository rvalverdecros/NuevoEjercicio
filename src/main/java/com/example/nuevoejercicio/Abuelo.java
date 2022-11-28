package com.example.nuevoejercicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Abuelo {
    public static void main(String[] args) throws Exception{
        File fi = new File("fin.txt");
        File ru = new File("target/classes");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fi,true));
        String tx ="El output del sumador 101 es: ";
        bw.write(tx);
        bw.close();
        ProcessBuilder pd = new ProcessBuilder("java","com.example.sumadojava.Sums");
        pd.directory(ru);
        Process q = pd.start();
        System.out.println(q.waitFor()+"");
        //pd.redirect
    }
}
