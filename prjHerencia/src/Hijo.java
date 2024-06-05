public class Hijo extends Padre {
    private String nombre;
    public Hijo(){
        super("papá");
    }

    public Hijo(String nombre){
        super("Pepe");
        this.nombre = nombre;
    }

    @Override
    public void saludar(){
        System.out.println("Hola, soy hijo de papi");
        System.out.println("Soy hijo de: "+getNombre());
    }
}

