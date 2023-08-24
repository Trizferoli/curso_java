public class App {
    public static void main(String[] args) throws Exception {
        String name = "Beatriz";
        String sobrenome = "Oliveira";

        String nomeCompleto = nomeCompleto(name, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return nome.concat(sobrenome);
    }
}
