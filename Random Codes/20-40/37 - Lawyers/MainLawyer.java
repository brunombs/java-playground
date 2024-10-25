public class MainLawyer {
    public static void main(String[] args) {
        Lawyer bruno = new Lawyer("Bruno", "Civil", 2);
        System.out.println("The lawyer " + bruno.getName() + " acts in the " + bruno.getArea() + " area and he has " + bruno.getYearsOfExperience() + " years of experience.");

        bruno.setName("Brunex");
        bruno.setArea("Criminal");
        bruno.setYearsOfExperience(1);

        System.out.println("Bruno likes to be called " + bruno.getName() + " and he changed his area of practice; now he's acting in the " + bruno.getArea() + " area and only has " + bruno.getYearsOfExperience() + " year of experience.");
    }
}