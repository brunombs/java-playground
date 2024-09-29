public class Motorizados {
    public static void main(String[] args) {
        Quadriciclo cascadeQuad = new Quadriciclo("Vermelho", 1990);
        Moto motoFernando = new Moto("Yamaha", "R15");
        Moto minhaMoto = new Moto("Yamaha", "Nmax");

        System.out.println("Quadriciclo: " +
                "Cor: " + cascadeQuad.getCor() +
                " Ano: " + cascadeQuad.getAno());

        cascadeQuad.setAno(2010);
        cascadeQuad.setCor("Azul");

        System.out.println("Quadriciclo novo: " +
                "Cor: " + cascadeQuad.getCor() +
                " Ano: " + cascadeQuad.getAno());

        System.out.println("Moto de Fernando: " +
                "Marca: " + motoFernando.getMarca() +
                " Modelo: " + motoFernando.getModelo());

        System.out.println("Minha moto: " +
                "Marca: " + minhaMoto.getMarca() +
                " Modelo: " + minhaMoto.getModelo());

        minhaMoto.setMarca("None");
        minhaMoto.setModelo("None");

        System.out.println("Minha moto: " +
                "Marca: " + minhaMoto.getMarca() +
                " Modelo: " + minhaMoto.getModelo());

    }
}

