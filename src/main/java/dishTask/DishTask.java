package dishTask;

import java.util.Comparator;

public class DishTask {


    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
   //             .map(dish -> dish.getName())          both ways are applicable
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("------------------------------");

        //Print the length of the name of each dish
        DishData.getAll().stream()
                .map(Dish::getName)
       //         .map(dish -> dish.length())           both are good
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("-------------------------------");

        //Print three high caloric dish name (>300)

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-------------------------------");

        //Print all dish name that are below 400 calories in sorted

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(dish -> dish.getCalories()))
                .map(Dish::getName)
                .forEach(System.out::println);












    }
}
