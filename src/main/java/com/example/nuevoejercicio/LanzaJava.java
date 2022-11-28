package com.example.nuevoejercicio;

import java.io.File;

public class LanzaJava {
    public static void main(String[] args) throws Exception{
        File ruta = new File("target/classes");
        for (int k = 4; k<= 104;k++){
            ProcessBuilder pb = new ProcessBuilder("java","com.example.nuevoejercicio.Sums","1",Integer.toString(k));
            pb.directory(ruta);
            File fi = new File("fich"+k+".txt");
            File er = new File("erro"+k+".txt");
            pb.redirectError(er);
            pb.redirectOutput(fi);
            Process p = pb.start();
            System.out.println(p.waitFor()+"");
        }
        System.exit(0);
    }
}
