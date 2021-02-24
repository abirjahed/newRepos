package mortgageCalculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends Locator {

    @Test
    public void firstTest() {

        //sends the house value
        homeValue("560000");

        //sends down payment amount
        inputDownPayment("30000");

        //sends load amount
        loanAmount("530000");

        //sends interest rate
        interestRate("3");

        //sends loan duration in months
        loanTerm("30");

        //sends loan start month
        startMonth("2");

        //sends loan start year
        startYear("2021");

        //sends property tax rate
        propertyTax("12000");

        //sends PMI rate
        privateMortgageInsurance(".5");

        //sends home insurance amount
        homeInsurance("1000");

        //sends HOA fee amount
        homeOwnersAssociation("0");

        //choosing loan type from dropdown
        loanType("1");

        //choosing buy from dropdown
        buyOrRefinance("1");

        //submits sent values
        submit();

        //prints monthly mortgage
        monthlyMortgage();

        //asserts mortgage rate
        Assert.assertEquals(rate, "$3,538.67");

    }

}
