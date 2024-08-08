package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FinancialTests {

    @Test
    public void constructShouldCreateObjectWhenValidData() {
        //Arrange -> prepared the data

        //Act -> Necessary actions
        Financing f = new Financing(100000.0, 2000.0, 80);

        //Assert -> Expected value
        Assertions.assertEquals(100000.0, f.getTotalAmount());
        Assertions.assertEquals(2000.0, f.getIncome());
        Assertions.assertEquals(80, f.getMonths());
    }

    @Test
    public void constructShoulThrowIllegalArgumentExceptionWhenInvalidData() {
        //Arrange -> prepared the data

        //Act -> Necessary actions

        //Assert -> Expected value
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Financing f = new Financing(100000.0, 2000.0, 20);
        });


    }


    @Test
    public void setTotalAmountShouldSetDataWhenValidData() {
        //Arrange -> prepared the data
        Financing f = new Financing(100000.0, 2000.0, 80);

        //Act -> Necessary actions
        f.setTotalAmount(90000.0);

        //Assert -> Expected value
        Assertions.assertEquals(90000.0, f.getTotalAmount());

    }

    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        //Arrange -> prepared the data

        //Act -> Necessary actions

        //Assert -> Expected value
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Financing f = new Financing(100000.0, 2000.0, 80);

            //Act -> Necessary actions
            f.setTotalAmount(110000.0);
        });


    }

    @Test
    public void setIncomeShouldSetDataWhenValidData() {
        //Arrange -> prepared the data
        Financing f = new Financing(100000.0, 2000.0, 80);

        //Act -> Necessary actions
        f.setIncome(2100.0);

        //Assert -> Expected value
        Assertions.assertEquals(2100.0, f.getIncome());

    }

    @Test
    public void setIncomeShouldThrowsIllegalArgumentExceptionWhenInvalidData() {
        //Arrange -> prepared the data

        //Act -> Necessary actions

        //Assert -> Expected value
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Financing f = new Financing(100000.0, 2000.0, 80);

            //Act -> Necessary actions
            f.setIncome(1900.0);
        });
    }

    @Test
    public void setMonthsShouldSetDataWhenValidData() {
        //Arrange -> prepared the data
        Financing f = new Financing(100000.0, 2000.0, 80);

        //Act -> Necessary actions
        f.setMonths(90);

        //Assert -> Expected value
        Assertions.assertEquals(90, f.getMonths());

    }

    @Test
    public void setMonthsShouldThrowsIllegalArgumentExceptionWhenInvalidData() {
        //Arrange -> prepared the data

        //Act -> Necessary actions

        //Assert -> Expected value
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Financing f = new Financing(100000.0, 2000.0, 80);

            //Act -> Necessary actions
            f.setMonths(79);
        });
    }

    @Test
    public void entryShouldCalculateEntryCorrectly() {
        //Arrange -> prepared the data
        Financing f = new Financing(100000.0, 2000.0, 80);

        //Assert -> Expected value
        Assertions.assertEquals(20000.00, f.entry());
    }
    @Test
    public void quoteShouldCalculateQuotaCorrectly() {
        //Arrange -> prepared the data
        Financing f = new Financing(100000.0, 2000.0, 80);

        //Assert -> Expected value
        Assertions.assertEquals(1000.00, f.quota());
    }

}
