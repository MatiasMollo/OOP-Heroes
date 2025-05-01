package business;

public class Humano extends Heroe{

    private int edad;
    private String sexo;
    private String nacionalidad;

    public Humano(String nombre, String identidad, String poder, Traje traje, int edad, String sexo, String nacionalidad) {
        super(nombre, identidad, poder, traje);
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void hablar(String mensaje){
        System.out.println(this.nombre + ": " + mensaje);
    }

    public void caminar(){
        // Caminar...
    }

    public void comer(){
        // Comer...
    }
}
