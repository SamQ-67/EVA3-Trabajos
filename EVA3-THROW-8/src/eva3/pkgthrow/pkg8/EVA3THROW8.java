/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3.pkgthrow.pkg8;

/**
 *
 * @author ririo
 */
public class EVA3THROW8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Persona per = new Persona("Sam", "Quezada", -1);
        System.out.println("Datos: " + per);
        }catch(RuntimeException e){
            System.out.println("Los datos se capturaron de manera erronea");
        }
        System.out.println("Siga hasta poner el dato correcto");
    }
    
}


class Persona{
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad < 0)
            throw new RuntimeException("La edad no puede ser un numero negativo");
        else
            this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Datos de la persona:  \n" + 
                "Nombre:" + nombre + "\n" +
                "Apellidos:" + apellidos + "\n"+
                "Edad:" + edad;
    }
    
}