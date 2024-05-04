package Model;

import Factories.PizzaGruesa.AmasadorPizzaGruesa;
import Factories.PizzaGruesa.HorneadorPizzaGruesa;
import Factories.PizzaGruesa.MoldeadorPizzaGruesa;

public class PizzaGruesa {

    MoldeadorPizzaGruesa moldeadorFactory = new MoldeadorPizzaGruesa() {

        @Override
        public void hacerPizza() {

        }
        @Override
        public void moldearPizza(String tipoPizza) {
            System.out.println("SE ESTA MOLDEANDO LA PIZZA " + tipoPizza);
        }
    };

    HorneadorPizzaGruesa horneadorFactory = new HorneadorPizzaGruesa() {
        @Override
        public void hacerPizza() {

        }

        @Override
        public void hornearPizza(String tipoPizza) {
            System.out.println("SE ESTA HORNEANDO LA PIZZA " + tipoPizza);
        }
    };

    AmasadorPizzaGruesa amasarPizza = new AmasadorPizzaGruesa() {

        @Override
        public void hacerPizza() {

        }
        @Override
        public void amasarPizza(String tipoPizza) {
            System.out.println("SE ESTA AMASANDO LA PIZZA " + tipoPizza);

        }
    };


    public void hacerPizzaGruesa(Ingrediente[] ingredientes, Tamano tamano) {
        System.out.println("HACIENDO UNA PIZZA DE TAMAÑO: " + tamano);
        amasarPizza.amasarPizza("GRUESA");
        moldeadorFactory.moldearPizza("GRUESA");
        System.out.println("APLICANDO INGREDIENTES: " + ingredientes[0].getNombre() + " Y " + ingredientes[1].getNombre());
        horneadorFactory.hornearPizza("GRUESA");
        System.out.println("¡PIZZA LISTA!");

    }

}
