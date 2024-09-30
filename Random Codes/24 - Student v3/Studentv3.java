public class Studentv3 {
    private final String nome;
    private double nota1;
    private double nota2;
    private double notaFinal;

    public Studentv3(String nome) {
        this.nome = nome;
    }

    public void adicionarNota1(double nota1) {
        this.nota1 += nota1;
    }

    public void adicionarNota2(double nota2) {
        this.nota2 += nota2;
    }

    public void adicionarNotaFinal() {
        this.notaFinal += (nota1 + nota2)/2;
    }

    public void details(){
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1ª prova: " + nota1);
        System.out.println("Nota 2ª prova: " + nota2);
        System.out.println("Média: " + notaFinal);
    }

    public static void main(String[] args) {
        Studentv3 student1 = new Studentv3("Bruno");
        student1.adicionarNota1(9.5);
        student1.adicionarNota2(8.7);
        student1.adicionarNotaFinal();
        student1.details();
    }
}
