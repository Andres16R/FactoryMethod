import Exepcion.ExcepcionParametrosInvalidos;
import Model.*;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrepararPizza {


    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el número del tipo de pizza que desea:\n1. Delgada\n2. Gruesa\n3. Integral");
        Integer option = datos.nextInt();
        System.out.println("INICIANDO LA PREPARACION DE LA PIZZA!");
        PrepararPizza pizza = new PrepararPizza();

        try {
            Ingrediente[] ingredientes = new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};
            switch (option){
                case 1:
                    pizza.prepararPizzaDelgada(ingredientes, Tamano.PEQUENA);
                    break;
                case 2:
                    pizza.prepararPizzaGruesa(ingredientes, Tamano.MEDIANO);
                    break;
                case 3:
                    pizza.prepararPizzaIntegral(ingredientes, Tamano.MEDIANO);
                    break;
            }

        } catch (ExcepcionParametrosInvalidos ex){
            Logger.getLogger(PrepararPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }

    }


    public void prepararPizzaDelgada(Ingrediente[] ingredientes, Tamano tamano) throws ExcepcionParametrosInvalidos {
        System.out.println("PREPARANDO LA PIZZA DELGADA");
        PizzaDelgada pizzaDelgada = new PizzaDelgada();
        pizzaDelgada.hacerPizzaDelgada(ingredientes, tamano);
    }

    public void prepararPizzaGruesa(Ingrediente[] ingredientes, Tamano tamano) throws ExcepcionParametrosInvalidos {
        System.out.println("PREPARANDO LA PIZZA GRUESA");
        PizzaGruesa pizzaGruesa = new PizzaGruesa();
        pizzaGruesa.hacerPizzaGruesa(ingredientes, tamano);
    }

    public void prepararPizzaIntegral(Ingrediente[] ingredientes, Tamano tamano) throws ExcepcionParametrosInvalidos {
        System.out.println("PREPARANDO LA PIZZA INTEGRAL");
        PizzaIntegral pizzaIntegral = new PizzaIntegral();
        pizzaIntegral.hacerPizzaIntegral(ingredientes, tamano);
    }
}