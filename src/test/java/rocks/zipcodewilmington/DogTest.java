package rocks.zipcodewilmington;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;


/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newDogTest(){

       String givenName = "Chewy";
       Date givenDate = new Date();
       Integer givenId = 0;

       Dog dog = new Dog(givenName, givenDate, givenId);

       String returnedName = dog.getName();
       Date returnedDate= dog.getBirthDate();
       Integer returnedId = dog.getId();



       Assert.assertEquals(givenName, returnedName);
       Assert.assertEquals(givenDate,returnedDate);
       Assert.assertEquals(givenId, returnedId);



    }

    @Test
    public void speakTest(){
        Dog dog = new Dog("Kashtanka", new Date(), 0);

        String actual= "bark!";
        String expected = dog.speak();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setBirthDateTest(){
        Date expected =  new Date(1991, 5, 8);
        Dog dog = new Dog("Flaffy", expected, 0);

        Date actual = dog.getBirthDate();

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void eatTest(){
         Dog dog = new Dog( "Sobaka", new Date(), 0);

         Food bone = new Food();
         int expected = 3;
         dog.eat(bone);
         dog.eat(bone);
         dog.eat(bone);

         int actual = dog.getNumberOfMealsEaten();

         Assert.assertEquals(actual, expected);

    }

    @Test
    public void getIdTest(){
        Dog dog = new Dog("Shoop", new Date(), 4);

        int actual = 4;
        int expected = dog.getId();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void AnimalTest(){
        Dog dog = new Dog("Sharick", new Date(),0);

        boolean actual = dog instanceof Animal;
        boolean expected = true;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void MammalTest(){
        Dog dog = new Dog("Sherif", new Date(), 0);

        boolean actual = dog instanceof Mammal;
        boolean expected = true;



        Assert.assertEquals(actual, expected);
    }

}
