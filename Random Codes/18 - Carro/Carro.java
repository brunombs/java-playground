public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDetalhes(Carro carro) {
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Honda", "Fit", 2004);

        meuCarro.exibirDetalhes(meuCarro);

        meuCarro.setAno(2015);
        meuCarro.setMarca("Toyota");
        meuCarro.setModelo("SW4");

        meuCarro.exibirDetalhes(meuCarro);
    }
}
