package aggregation;

public class MainMasina {

    public static void main(String[] args) {
        //masina VW de culoare alba cu motor capacitate 1 si ptuere 75
        //afisam mesajul: masina X are culoarea Y si motorul de putere Z si capacitate T

        Motor motorVW = new Motor();
        motorVW.setCapacitate(1);
        motorVW.setPutere(75);

        System.out.println("MotorVW are puterea: " + motorVW.getPutere());
        System.out.println("MotorVW are capacitatea: " + motorVW.getCapacitate());

        Masina masinaVW = new Masina (motorVW, "VW");
        masinaVW.setCuloare("alb");
        System.out.println("Masina " + masinaVW.getNume()
                + " are culoarea " + masinaVW.getCuloare()
                + " si motorul de putere " + masinaVW.getMotor().getPutere()
                + " si capacitate " + masinaVW.getMotor().getCapacitate());

        masinaVW = null;
    }
}
