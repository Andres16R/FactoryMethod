package Model;

import Factories.PizzaIntegral.AmasadorPizzaIntegral;
import Factories.PizzaIntegral.HorneadorPizzaIntegral;
import Factories.PizzaIntegral.MoldeadorPizzaIntegral;

public class PizzaIntegral {

    MoldeadorPizzaIntegral moldeadorFactory = new MoldeadorPizzaIntegral() {

        @Override
        public void hacerPizza() {

        }
        @Override
        public void moldearPizza(String tipoPizza) {
            System.out.println("SE ESTA MOLDEANDO LA PIZZA " + tipoPizza);
        }
    };

    HorneadorPizzaIntegral horneadorFactory = new HorneadorPizzaIntegral() {
        @Override
        public void hacerPizza() {

        }

        @Override
        public void hornearPizza(String tipoPizza) {
            System.out.println("SE ESTA HORNEANDO LA PIZZA " + tipoPizza);
        }
    };

    AmasadorPizzaIntegral amasarPizza = new AmasadorPizzaIntegral() {

        @Override
        public void hacerPizza() {

        }
        @Override
        public void amasarPizza(String tipoPizza) {
            System.out.println("SE ESTA AMASANDO LA PIZZA " + tipoPizza);

        }
    };


    public void hacerPizzaIntegral(Ingrediente[] ingredientes, Tamano tamano) {
        System.out.println("HACIENDO UNA PIZZA DE TAMAÑO: " + tamano);
        amasarPizza.amasarPizza("INTEGRAL");
        moldeadorFactory.moldearPizza("INTEGRAL");
        System.out.println("APLICANDO INGREDIENTES: " + ingredientes[0].getNombre() + " Y " + ingredientes[1].getNombre());
        horneadorFactory.hornearPizza("INTEGRAL");
        System.out.println("¡PIZZA LISTA!");

    }

}
