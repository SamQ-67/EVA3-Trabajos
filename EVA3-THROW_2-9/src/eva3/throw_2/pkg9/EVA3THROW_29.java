/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3.throw_2.pkg9;

/**
 *
 * @author ririo
 */
public class EVA3THROW_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per = null;
        try{
            per = new Persona("Sam", "Quezada", 1);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Datos: " + per);
    }
    
}


class Persona{
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona(){
        this.nombre = "-Sin Dato-";
        this.apellidos = "-Sin Dato-";
        this.edad = 0;
    }
    public Persona(String nombre, String apellidos, int edad) throws Exception{
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

    public void setEdad(int edad) throws Exception {
        if(edad < 0)
            throw new Exception("La edad no puede ser un numero negativo");
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