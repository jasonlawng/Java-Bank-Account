public class BankAccount {
    
private String owner;
private int accNum;
private double accBal;
private double interest;
private double penFee;
private boolean stuAcc;
private boolean frozen;
    
                // default constructor
                public BankAccount() {
                    
                owner = "NONE";
                accNum = 999999999;
                accBal = 0.0;
                interest = 0.0;
                penFee = 25.0;
                stuAcc = false;
                frozen = false;
                
                }
                
                public BankAccount(String a, int b, double c, double d, double e, boolean f, boolean g) {
                    
                    // alternate constructor

                    this.owner = a;
                    this.accNum = b;
                    this.accBal = c;
                    this.interest = d;
                    this.penFee = e;
                    this.stuAcc = f;
                    this.frozen = g;
                    
                }
              
        public void printAccountInfo() {
                    
            // printing method
            
            System.out.println("Name: <" + owner + ">");
            System.out.println("Account Number: <" + accNum + ">");
            System.out.println("Account Balance: <" + "$" + accBal + ">");
            System.out.println("Interest Rate: <" + interest + "%" + ">");
            System.out.println("Penalty: <" + "$" + penFee + ">");
            
            if (stuAcc == true) {
                
             System.out.println("Student Account? <Yes>");  
             
            }
            
            else {
                
                System.out.println("Student Account? <No>");
            }
            
            if (frozen == true) {
            
            System.out.println("Frozen Account? <Yes>");
                
            }
            
            else {
                
                System.out.println("Frozen Account? <No>");
                
            }
          
        }
        
        public double getBalance() {
            
        // balance method
        return accBal;
            
        }
        
        public String getAccountName() {
            
        // account name method
        return owner;
            
        }
        
        public double getInterest() {
            
        // interest rate method
            
        return interest;
            
        }
        
        public double setBalance(double newBalance) {
            
            // sets balance to the new balance that user chooses
            
            accBal = newBalance;
            return accBal;
            
        }
        
        public String setAccountName(String newName) {
            
            // sets account name to the new name chosen by user
            
                owner = newName;
                return owner;
            
        }
        
        public double setInterest(double newRate) {
        
        // changes interest rate to whatever user says
        
        interest = newRate;
        return interest;
        
        }
    
        public boolean makeStudentAccount() {
            
            // makes account a student account
            
            stuAcc = true;
            return stuAcc;
        
        }
        
        public boolean freezeAccount() {
            
            // makes account frozen
            
            frozen = true;
            return frozen;
    
        }
        
        public boolean unfreezeAccount() {
            
            // unfreezes account
            
            frozen = false;
            return frozen;
            
        }
        
    
        public void chargePenalty(int numPenalties) {
            
            // takes away moneys
            
            accBal -= (penFee * numPenalties);
            System.out.println(owner + "'s" + " balance is now " + "$" + accBal);
            
        }
        
        public double updateBalance(double money) {
            
            accBal += money;
            return accBal;
            
        }
    
        
        public double getInterestPayment() {
            
            // calculates interest payment
                
            double intrAm = accBal * (interest / 100);
            accBal += intrAm;
            return accBal;
            
        }

        public void frozenStatus() {

            if (frozen == true) {

                System.out.println("Account Freeze Status: Frozen");
            }
            
            else {

                System.out.println("Account Freeze Status: Not Frozen");
            }

    }
    
        }
