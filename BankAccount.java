/**
 * This application sets balance, monthly interest rate,
 *
 * @author Jon Cesena
 * @version v1.0
 * @since 3/30/2026
 */
public class BankAccount
{
    ////Instance variables
    private double balance; //updated based on monthly deposits, withdraw, and interest
    private double deposit; //tracks total amount deposited over the months
    private double withdraw; //tracks total amount withdrawn over the months
    private double interest; //tracks total interest over the months
    private double monthlyIntRate; //monthly vs annual (APR) rate. Users provide APR

    ////Constructors
    public BankAccount(){   //set monthlyIntRate to 0.044/12 (monthly vs annual interest rate). Java sets all others to 0
        balance = deposit = withdraw = interest = 0.0;
        monthlyIntRate = 0.044/12;
    }

    public BankAccount(int inBalance, double intRate){  //divide intRate by 100, then by 12 to set monthlyIntRate
        balance = inBalance;
        monthlyIntRate = intRate/100/12;
    }

    public BankAccount(double inBalance, double intRate){   // divide intRate by 100, then by 12 to set monthlyIntRate
        balance = inBalance;
        monthlyIntRate = intRate/100/12;
    }

    ////Methods
    /**
     * This method adds an amount to the balance and total deposits as a double that is used
     * in the currency mode.
     * @param add the amount to deposit as a currency value
     */
    public void makeDeposit(double add){
        balance += add;
        deposit += add;
    }

    
    /**
     * This method adds an amount to the balance and total deposits as an interger that is used
     * in the whole dollar mode.
     * @param add the amount to deposit as whole dollars
     */public void makeDeposit(int add){
        balance += add;
        deposit += add;
    }

    /**
     * This method subtracts an amount from the balance and total deposits as a double that is used
     * in the currency mode.
     * @param sub the amount to withdraw as a currency value
     */
    public void makeWithdraw(double sub){
        balance -= sub;
        withdraw += sub;
    }

    /**
     * This method subtracts an amount from the balance and total deposits as an interger that is 
     * used in the currency mode.
     * @param sub the amount to withdraw as whole dollars
     */public void makeWithdraw(int sub){
        balance -= sub;
        withdraw += sub;
    }

    /**
     * This method calculates monthly interest and adds it to account balance and total interest.
     * It does not apply negative interest.
     */
    public void calcInterest(){ //Do not include negative interest. If balance is greater than 0, calculate interest
        if (balance > 0){
            balance += balance * monthlyIntRate;
            interest += balance * monthlyIntRate;
        }
    }

    /**
     * This method returns balance.
     * @return balance as a double
     */
    public double getBalance(){
        return balance;
    }

    /**
     * This method returns the total deposits.
     * @return deposit as a double
     */
    public double getDeposit(){
        return deposit;
    }

    /**
     * This method returns the total withdrawals. 
     * @return withdraw as a double
     */
    public double getWithdraw(){
        return withdraw;
    }

    /**
     * This method returns the total interest.
     * @return interest as a double
     */public double getInterest(){
        return interest;
    }
}//end BankAccount