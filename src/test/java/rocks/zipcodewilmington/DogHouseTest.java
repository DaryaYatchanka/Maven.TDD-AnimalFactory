package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {

        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void removeDogTest(){
        DogHouse.clear();
        Dog dog = new Dog("Happy", new Date(), 1);
        DogHouse.remove(1);
        int expected = 0;
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void revomeDog2Test(){
        DogHouse.clear();
        Dog dog = new Dog("Happy", new Date(), 0);
        DogHouse.remove(dog);
        int expected = 0;
        int actual= DogHouse.getNumberOfDogs();

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void getDogByIdTest(){
        DogHouse.clear();
        Dog expected = new Dog("Happy", new Date(), 3);
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(3);

        String expectedName = expected.getName();
        Date expectedDate = expected.getBirthDate();
        int expectedId = expected.getId();

        String actualName = actual.getName();
        Date actualDate = actual.getBirthDate();
        int actualId = actual.getId();


        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedDate,actualDate);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void getNumberOfDogsTest(){
        DogHouse.clear();
        Dog sharick= new Dog("Sharick", new Date(), 3);
        DogHouse.add(sharick);
        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(actual, expected);
    }
}

