package findingMatching;

import dishTask.Dish;
import dishTask.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {


        System.out.println("All Match:");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println();

        System.out.println("Any Match:");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println();

        System.out.println("None Match:");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println();

        System.out.println("Find Any:");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);       //just to run and see
        System.out.println(dish.get());

        System.out.println();

        System.out.println("Find First:");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        System.out.println();

        System.out.println("Parallel Streams (Async):");
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        System.out.println("another example:");
        List<String> list1 = Arrays.asList("John", "David", "Peter", "Jack", "Andy", "Mat", "Dany", "Dilan");
        List<String> list2 = Arrays.asList("John", "David", "Peter", "Jack", "Andy", "Mat", "Dany", "Dilan");

        Optional<String> findFirst = list1.parallelStream().filter(names -> names.startsWith("D")).findFirst();
        Optional<String> findAny = list1.parallelStream().filter(names -> names.startsWith("J")).findAny();

        System.out.println("find first: " + findFirst.get());
        System.out.println("find any: " + findAny.get());

        System.out.println();

        System.out.println("Min & Max:");
        Optional<Dish> dishMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println("dish with Min kcal = " + dishMin.get());
        Optional<Dish> dishMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println("dish with Max kcal = " + dishMax.get());











    }








}

