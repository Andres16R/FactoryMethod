package Model;

import Factories.PizzaDelgadaFactory.AmasadorPizzaDelgada;
import Factories.PizzaDelgadaFactory.HorneadorPizzaDelgada;
import Factories.PizzaDelgadaFactory.MoldeadorPizzaDelgada;

public class PizzaDelgada {

    MoldeadorPizzaDelgada moldeadorFactory = new MoldeadorPizzaDelgada() {

        @Override
        public void hacerPizza() {

        }
        @Override
        public void moldearPizza(String tipoPizza) {
            System.out.println("SE ESTA MOLDEANDO LA PIZZA " + tipoPizza);
        }
    };

    HorneadorPizzaDelgada horneadorFactory = new HorneadorPizzaDelgada() {
        @Override
        public void hacerPizza() {

        }

        @Override
        public void hornearPizza(String tipoPizza) {
            System.out.println("SE ESTA HORNEANDO LA PIZZA " + tipoPizza);
        }
    };

    AmasadorPizzaDelgada amasarPizza = new AmasadorPizzaDelgada() {

        @Override
        public void hacerPizza() {

        }
        @Override
        public void amasarPizza(String tipoPizza) {
            System.out.println("SE ESTA AMASANDO LA PIZZA " + tipoPizza);

        }
    };


    public void hacerPizzaDelgada(Ingrediente[] ingredientes, Tamano tamano) {
        System.out.println("HACIENDO UNA PIZZA DE TAMAÑO: " + tamano);
        amasarPizza.amasarPizza("DELGADA");
        moldeadorFactory.moldearPizza("DELGADA");
        System.out.println("APLICANDO INGREDIENTES: " + ingredientes[0].getNombre() + " Y " + ingredientes[1].getNombre());
        horneadorFactory.hornearPizza("DELGADA");
        System.out.println("¡PIZZA LISTA!");

    }




}
