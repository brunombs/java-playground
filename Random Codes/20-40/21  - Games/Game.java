public class Game {
    String name;

    public Game(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bestName(){
        this.name = "Tibia";
    }

    public static void main(String[] args) {
        Game game1 = new Game("Tibia");
        Game game2 = new Game("LOL");

        System.out.println(game1.getName());
        System.out.println(game2.getName());
        game2.bestName();
        System.out.println(game2.getName());

    }
}
