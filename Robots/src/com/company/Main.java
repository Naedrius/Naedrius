package com.company;

public class Main {

    public static void main(String[] args) {
        Pilotos a = new Pilotos("Koji Kabuto");
        Robots m = new Robots("Mazinger Z",18,Color.NEGRO);
        m.setPiloto(a);
        System.out.println(m);
        m.mover(2,Direccion.NORTE);
        System.out.println(m);
    }
}
