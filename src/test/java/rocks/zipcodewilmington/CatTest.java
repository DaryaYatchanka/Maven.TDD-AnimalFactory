package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }



    @Test
    public void setNameTest(){
        // Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId =0;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //when
        String expected = "Crazy";
        cat.setName(expected);
        String actual = cat.getName();

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void speakTest(){

        Cat cat = new Cat ("Eugene", new Date(), 0);

        String expected = "meow!";
        String actual = cat.speak();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setBirthDateTest(){

        Cat cat = new Cat("Murka", new Date(), 0);

        Date expected = new Date(1991, 8, 4);
        cat.setBirthDate(expected);
        Date actual =cat.getBirthDate();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void eat(){
         Cat cat = new Cat("Arisha", new Date(),0);

         Food fish = new Food();
         int expected =2;
         cat.eat(fish);
         cat.eat(fish);
         int actual = cat.getNumberOfMealsEaten();

         Assert.assertEquals(actual, expected);


    }

    @Test
    public void getIdTest(){
        Cat cat = new Cat ("Vasya", new Date(),2);

        int expected = 2;

        int actual =  cat.getId();

        Assert.assertEquals(actual, expected);




    }

    @Test
    public void instanceOfAnimalTest(){

        Cat cat = new Cat ("Garick", new Date(), 0);

        boolean actual = cat instanceof Animal;
        boolean expected = true;


        Assert.assertEquals(actual, expected);
    }

    @Test
    public void instanceOfMammal(){
        Cat cat = new Cat ("Garick", new Date(), 0);

        boolean actual = cat instanceof Mammal;
        boolean expected = true;


        Assert.assertEquals(actual, expected);

    }




}
