public class Jugador {
    private String usuario;
    private String nombre;
    private String clave;

    public Jugador(){
        setClave("1234");
        setUsuario("dxcam");
        setNombre("camila");
    }

    public boolean Login(){
        String usuario = "";
        String clave = "";
        boolean sinLogeo = true;

        do{
            System.out.print("Ingrese el nombre de usuario: ");
            usuario = App.sc.nextLine();
            System.out.print("Ingrese la clave: ");
            clave = App.sc.nextLine();
    
            if(this.usuario.equalsIgnoreCase(usuario) 
                && this.clave.equalsIgnoreCase(clave))
                return true; 

            System.out.print("para sinLogeo (s): ");
            if(App.sc.nextLine().toUpperCase().equals("S"))
                sinLogeo = false;
        }while(sinLogeo);
        return false;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
  
}
