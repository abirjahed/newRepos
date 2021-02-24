package mortgageCalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
 *This class locates the web elements using id, name or ccs selector and sends relevant user inputs
 */

public class Locator extends TestBase {
    public void homeValue(String value){
        driver.findElement(By.id("homeval")).sendKeys(value);
    }
    public void inputDownPayment(String downpayment){
        driver.findElement(By.id("downpayment")).sendKeys(downpayment);
    }
    public void loanAmount(String loan){
        driver.findElement(By.id("loanamt")).sendKeys(loan);
    }
    public void interestRate(String interest){
        driver.findElement(By.id("intrstsrate")).sendKeys(interest);
    }
    public void loanTerm(String term){
        driver.findElement(By.id("loanterm")).sendKeys(term);
    }
    public void startMonth(String monthIndex){
        WebElement testDropDown = driver.findElement(By.name("param[start_month]"));
        Select dropdown = new Select(testDropDown);
        dropdown.selectByValue(monthIndex);
    }
    public void startYear(String year){
        driver.findElement(By.id("start_year")).sendKeys(year);
    }
    public void propertyTax(String propertyTax){
        driver.findElement(By.id("pptytax")).sendKeys(propertyTax);
    }
    public void privateMortgageInsurance (String pmi){
        driver.findElement(By.id("pmi")).sendKeys(pmi);
    }
    public void homeInsurance(String homeInsurance){
        driver.findElement(By.id("hoi")).sendKeys(homeInsurance);
    }
    public void homeOwnersAssociation(String hoaFee){
        driver.findElement(By.id("hoa")).sendKeys(hoaFee);
    }
    public void loanType(String loanTypeIndex){
        WebElement testDropDown = driver.findElement(By.name("param[milserve]"));
        Select dropdown = new Select(testDropDown);
        dropdown.selectByValue(loanTypeIndex);
    }
    public void buyOrRefinance(String buyOrRefinanceIndex){
        WebElement testDropDown = driver.findElement(By.name("param[refiorbuy]"));
        Select dropdown = new Select(testDropDown);
        dropdown.selectByValue(buyOrRefinanceIndex);
    }
    public void submit(){
        driver.findElement(By.name("cal")).click();
    }

    //rate is the monthly mortgage value
    String rate;
    public void monthlyMortgage(){
        WebElement mortgage = driver.findElement(By.cssSelector(".repayment-block div:nth-child(1) > .left-cell > h3"));
        rate = mortgage.getText();
        System.out.println("Monthly Mortgage is " + rate + ".");
    }

}
