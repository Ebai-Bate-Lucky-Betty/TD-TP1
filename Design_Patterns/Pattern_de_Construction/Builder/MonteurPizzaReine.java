package Design_Patterns.Pattern_de_Construction.Builder;

class MonteurPizzaReine extends MonteurPizza {
    public void monterPate(){ 
        pizza.setPate("croisee"); 
    }

    public void monterSauce(){ 
        pizza.setSauce("douce"); 
    }

    public void monterGarniture() {
        pizza.setGarniture("jambon+champignon"); 
    }
}