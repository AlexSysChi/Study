package annotation;

import java.lang.annotation.*;

@Repeatable(value = MealContainer.class)
//@Retention(RetentionPolicy.SOURCE)
@Retention(RetentionPolicy.CLASS)
//@Retention(RetentionPolicy.RUNTIME)
public @interface Meal {
    String type() default "N/A";
    String generalTime()  default "";
    String mainDish() default "N/A";
}
