public class Games {
    String name;

    public Games(String name){
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
        Games game1 = new Games("Tibia");
        Games game2 = new Games("LOL");

        System.out.println(game1.getName());
        System.out.println(game2.getName());
        game2.bestName();
        System.out.println(game2.getName());

    }
}
