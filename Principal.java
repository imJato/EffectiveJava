public class Principal {
    public static void main(String... args) {
        Persona persona = new Persona.Builder(1, "Juan", "Mendez", 22, 'H').build();
        System.out.println(persona.toString());
    }
}
