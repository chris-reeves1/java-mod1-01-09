package MFactory;

public class Main {
public static void main(String[] args) {
    MealService service = new MealService(new JapaneseMealFactory());
    service.fullset();
}
}

interface MainCourse {void serve();}
interface Drink {void serve();}
interface Dessert {void serve();}

class Katsu implements MainCourse {@Override public void serve() {System.out.println("serving Katsu...");}  }
class Sake implements Drink {@Override public void serve() {System.out.println("serving sake...");}  }
class Mochi implements Dessert {@Override public void serve() {System.out.println("serving Mochi...");}  }

class Pasta implements MainCourse {@Override public void serve() {System.out.println("serving Pasta...");}  }
class Wine implements Drink {@Override public void serve() {System.out.println("serving Wine...");}  }
class Tiramisu implements Dessert {@Override public void serve() {System.out.println("serving Tiramisu...");}  }

interface MealFactory{
    MainCourse createMain();
    Drink createDrink();
    Dessert createDessert();
}
    
class JapaneseMealFactory implements MealFactory{
    public MainCourse createMain(){return new Katsu();}
    public Drink createDrink(){return new Sake();}
    public Dessert createDessert(){return new Mochi();}
}
class ItalianMealFactory implements MealFactory{
    public MainCourse createMain(){return new Pasta();}
    public Drink createDrink(){return new Wine();}
    public Dessert createDessert(){return new Tiramisu();}
    }


class MealService{
    final MealFactory factory;
    public MealService(MealFactory factory){
        this.factory = factory;
    }
    void fullset(){
          factory.createMain().serve(); 
          factory.createDrink().serve(); 
          factory.createDessert().serve();
}}


/*
 * simple factory:
 * 
 * Meal meal = MealFactory.getMeal("pizza");
    meal.serve();
}
}

abstract class Meal{
    abstract void serve();
}

class Pizza extends Meal{
    @Override
    void serve() {
        System.out.println("A pizza...");
    }
}

class Burger extends Meal{
    @Override
    void serve() {
        System.out.println("A burger...");
    }
}

class MealFactory{
    static Meal getMeal(String type){
        if ("pizza".equals(type)) return new Pizza();
        if ("burger".equals(type)) return new Burger();
        return null;
    }
}
 * 
 * 
 * 
 * Factory methods
 * 
 * Restaurant r = new PizzaRestaurant();
    r.serving(); 
}
}

abstract class Meal{abstract void serve();}
class Pizza extends Meal{@Override void serve() {System.out.println("A pizza...");}}
class Burger extends Meal{@Override void serve() {System.out.println("A burger...");}}


// creator inc overridable factory method, template method too
abstract class Restaurant{
    abstract Meal createMeal(); // empty factory to be implemented by sub classes

    //template
    public void serving(){
    Meal meal = createMeal();
    meal.serve();
}
}

// concrete application X 2

class BurgerRestaurant extends Restaurant {
    @Override
    Meal createMeal() {
    return new Burger();   
    }
}

class PizzaRestaurant extends Restaurant {
    @Override
    Meal createMeal() {     
        return new Pizza();
    }
}
 * 
 */