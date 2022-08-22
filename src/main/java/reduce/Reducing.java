package reduce;

import dishTask.Dish;
import dishTask.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int sum = 0;
        for(int each: numbers){
            sum = sum + each;
        }

        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a+b);

        System.out.println(result);
        System.out.println(result2);

        System.out.println("Find total cal of all dishes");

        Optional<Integer> calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(Integer::sum);
        System.out.println(calTotal);

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum1 = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum1.get());

        System.out.println();

        System.out.println("Count Method:");

        long dishcount = DishData.getAll().stream().count();
        System.out.println(dishcount);







        }

}
