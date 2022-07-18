public class Persona{

    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private String telefono;
    private String direccion;
    private String correo;
    private Double altura;
    private Double peso;


    private Persona(Builder builder){
        id = builder.id;
        nombre = builder.nombre;
        apellido = builder.apellido;
        edad = builder.edad;
        sexo = builder.sexo;
        telefono = builder.telefono;
        direccion = builder.direccion;
        correo = builder.correo;
        altura = builder.altura;
        peso = builder.peso;
    }


    public static class Builder{

        //Propiedades obligatorias
        private int id;
        private String nombre;
        private String apellido;
        private int edad;
        private char sexo;

        //Propiedades opcionales
        private String telefono = "";
        private String direccion = "";;
        private String correo = "";;
        private Double altura = 0.0;
        private Double peso = 0.0;

        public Builder(int id, String nombre, String apellido, int edad, char sexo){
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.sexo = sexo;
        }

        public Builder telefono(String val){this.telefono = val; return this;}
        public Builder direccion(String val){this.direccion = val; return this;}
        public Builder correo(String val){this.correo = val; return this;}
        public Builder altura(Double val){this.altura = val; return this;}
        public Builder peso(Double val){this.peso = val; return this;}

        public Persona build(){return new Persona(this);}


    }

    @Override
    public String toString() {
        return "Persona [id=" + id +", nombre=" + nombre  + ", apellido=" + apellido +", edad=" + edad   +", sexo="
        + sexo + ", altura=" + altura + ", peso=" + peso +  ", direccion="
        + direccion + ", telefono=" + telefono + ", correo=" + correo  +"]";
    } 

}


