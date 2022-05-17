package com.company;

public class Robots {
    //ATRIBUTOS
    private int numero=0;
    private static int numRobots=0; //ROBOT SERIES NUMBER
    private Pilotos piloto; //PILOT NAME
    private String nombre;
    private int altura; //ROBOT HEIGHT>=0
    private Color color;
    private Coordenada posicion;
    private int distancia;

    //CONTRUCTOR DE ROBOTS
    public Robots(String nombre, int altura, Color color) {
        setNombre(nombre);
        setAltura(altura);
        this.color = color;
        numero= ++numRobots;
        posicion= new Coordenada(0,0);
    }
    //METODO para mover robot
    public void mover(int distancia, Direccion direccion){
        switch (direccion){
            case NORTE -> posicion.setY(posicion.getY()+distancia);
            case SUR-> posicion.setY(posicion.getY()-distancia);
            case ESTE -> posicion.setY(posicion.getX()+distancia);
            case OESTE -> posicion.setY(posicion.getX()-distancia);
        }
    }
    //GETTERS Y SETTERS
    private void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    private void setAltura(int altura) {
        assert altura>=0;
        this.altura = altura;
    }

    public void setPiloto(Pilotos piloto) {
        this.piloto = piloto;
    }

    public Pilotos getPiloto() {
        return piloto;
    }


    @Override
    public String toString() {
        return "Robot:" + nombre + ", altura=" + altura + "m, color=" + color + ", posicion=" + posicion+ " Piloto: "+getPiloto();
    }
}
