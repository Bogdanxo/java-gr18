package Inheritance;

import java.util.Arrays;

public class MainShape {
    public static void main(String[] args) {
        Cerc cerc = new Cerc();
        cerc.setColor("verde");

        System.out.println("Culoare cerc: " + cerc.getColor());
        cerc.draw();
        cerc.erase();
        cerc.move();

        Triunghi triunghi = new Triunghi();
        triunghi.draw();
        triunghi.erase();
        triunghi.move();
        triunghi.flipHorizontal();
        triunghi.flipVertical();
        triunghi.setColor("mov");

        //polymorphism
//        Shape cerc1 = new Cerc();
//
//        Triunghi t1 = new Triunghi();
//        t1.setColor("verde");
//
//        Cerc c1 = new Cerc();
//        c1.setColor("roz");
//
//        Patrat p1 = new Patrat();
//        p1.setColor("albastru");

//        Shape[] listaForme = new Shape[3];
//        listaForme[0] = t1;
//        listaForme[1] = c1;
//        listaForme[2] = p1;

//        for (Shape elementLista : listaForme) {
//            System.out.println(elementLista.getColor());
//
//            if (elementLista instanceof Triunghi) {
//                ((Triunghi) elementLista).flipHorizontal();
//            }
//        }

        //polimorfism

        //v1
        Shape[] listaFormeBasic = new Shape[2];
        listaFormeBasic[0] = cerc;
        listaFormeBasic[1] = triunghi;

        //v2
        Shape[] listaForme = new Shape[1];
        listaForme = add(triunghi, listaForme);
        listaForme = add(cerc, listaForme);

        for (Shape shape : listaForme) {
            if (shape != null) {
                System.out.println(shape.getColor());
            }
        }
    }

    public static Shape[] add(Shape shapeToAdd, Shape[] arrayToAddShape) {
        //pas1 - cream un now array cu dimensiunea lui  = vechiul array +1
        Shape[] newArray = Arrays.copyOf(arrayToAddShape, arrayToAddShape.length + 1);

        //pas2 - in noul array adaugam pe ultima pozitie noul elemmtn
        newArray[arrayToAddShape.length - 1] = shapeToAdd;

        return newArray;
    }

}

