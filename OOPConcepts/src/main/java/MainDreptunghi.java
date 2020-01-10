public class MainDreptunghi {
    public static void main(String[] args) {

        Dreptunghi dreptunghiA = new Dreptunghi (20.0, 10.0);
        System.out.println("Aria obiect dreptunghi A este: " + dreptunghiA.getAria());
        System.out.println("Perimetrul obiect dreptunghi A este: " + dreptunghiA.getPerimetru());

        Dreptunghi dreptunghiB = new Dreptunghi (40.0, 35.0);
        System.out.println("Diagonala obiect dreptunghi B este: " + dreptunghiB.getDiagonala());
    }
}
