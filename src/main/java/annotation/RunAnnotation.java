
// source: https://docs.oracle.com/javase/tutorial/java/annotations/index.html

package annotation;

@Preamble(author = "me", date = "date", reviewers = {"1", "2"} )
public class RunAnnotation {

    public static void main(String[] args) {
        House house = new HouseImpl();
        house.open();
    }
    @Meal(type = "breakfast", generalTime = "7:00 AM", mainDish = "coffee")
    @Meal(type = "branch", mainDish = "juice")
    public void  diet() {

    }
}
