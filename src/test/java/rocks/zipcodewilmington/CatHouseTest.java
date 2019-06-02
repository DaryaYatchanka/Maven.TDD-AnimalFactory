package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest(){
        CatHouse.clear();
        CatHouse.add(new Cat("Arisha", new Date(), 0));
        int expectedNumberOfCats = 1;
        int actualNumberOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);

    }

    @Test
    public void removeIdTest(){
        CatHouse.clear();
        Cat cat = new Cat("Arisha", new Date(),0);
        CatHouse.remove(0);
        int expected = 0;
        int actual = CatHouse.getNumberOfCats();


        Assert.assertEquals(expected, actual);

    }


    @Test
    public void removeCat(){
        CatHouse.clear();
        Cat cat = new Cat("Arisha", new Date(),0);
        CatHouse.remove(cat);
        int expected = 0;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatById(){
        CatHouse.clear();
        Cat expected =new Cat("Murka", new Date(), 3);
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(3);

        String expectedName = expected.getName();
        Date expectedDate = expected.getBirthDate();
        int expectedId = expected.getId();

        String actualName = actual.getName();
        Date actualDate = actual.getBirthDate();
        int actualId = actual.getId();



       Assert.assertEquals(actualName, expectedName);
       Assert.assertEquals(actualDate, expectedDate);
       Assert.assertEquals(actualId, expectedId);
    }

   @Test
    public void getNumberOfCatsTest(){
        CatHouse.clear();

        Cat cat =new Cat("Vasiliy", new Date(), 4);
        CatHouse.add(cat);
        Integer actual = 1;
        Integer expected = CatHouse.getNumberOfCats();

        Assert.assertEquals(actual, expected);

   }


}

