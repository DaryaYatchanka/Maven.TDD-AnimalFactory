package rocks.zipcodewilmington;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.Cat;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){

       Dog dog = AnimalFactory.createDog("Chewy", new Date(1991, 8,3));

       String actualName = "Chewy";
       Date actualDate = new Date(1991, 8,3);

       String expectedName = dog.getName();
       Date expectedDate = dog.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);


    }

    @Test
    public void createCatTest(){
        Cat cat = AnimalFactory.createCat("Arisha", new Date(1991,7,5));

        String expectedName = "Arisha";
        Date expectedDate = new Date(1991,7,5);

        String actualName = cat.getName();
        Date actualDate= cat.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
