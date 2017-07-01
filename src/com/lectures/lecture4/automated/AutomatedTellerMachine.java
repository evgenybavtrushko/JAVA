package com.lectures.lecture4.automated;
/**
 * Created by User on 017 17.06.17.
 */
public class AutomatedTellerMachine{
    public static void main(String[] args) {
        AutomatedTellerMachine cashMachine = new AutomatedTellerMachine(5, 6, 6);
        cashMachine.addBankNotes(1,3,5);
        cashMachine.CashWithdrawal(310);
        cashMachine.dataOutput(cashMachine);
    }

    private int bankNote100;
    private int bankNote50;
    private int bankNote20;

    AutomatedTellerMachine(int bankNote100, int bankNote50, int bankNote20) {
        this.bankNote100 = bankNote100;
        this.bankNote50 = bankNote50;
        this.bankNote20 = bankNote20;
    }

    public void dataOutput(AutomatedTellerMachine obj) {
        System.out.println(obj);
    }

    public AutomatedTellerMachine addBankNotes(int bankNote100, int bankNote50, int bankNote20) {
        this.bankNote100 += bankNote100;
        this.bankNote50 += bankNote50;
        this.bankNote20 += bankNote20;
        return new AutomatedTellerMachine(this.bankNote100, this.bankNote50, this.bankNote20);
    }

    public boolean CashWithdrawal(int sum) {
        boolean b = false;
        int b100;
        int b50;
        int b20;
        int remainder;
        b100 = sum / 100;
        remainder = sum % 100;
        if(this.bankNote100 - b100 < 0){
            remainder += Math.abs(this.bankNote100 - b100) * 100;
        	b100 -= Math.abs(this.bankNote100 - b100);
        }
        b50 = remainder / 50;
        remainder %= 50;
        if(this.bankNote50 - b50 < 0){
            remainder += Math.abs(this.bankNote50 - b50) * 50;
        	    b50 -=Math.abs(this.bankNote50 - b50);
        	}
        b20 = remainder / 20;
        remainder %= 20;
        if(remainder != 0 && b50 !=0){
            b50--;
            remainder += 50 + b20 * 20;
            b20 = remainder / 20;
        }
        else if(remainder != 0 && b100 != 0 ){
            b50++;
            remainder -= 50;
            b100--;
            remainder += 100 + b20 * 20;
            b20 = remainder / 20;
        }
        remainder %= 20;
        if(this.bankNote20 - b20 < 0){
       	System.out.println("В банкомате не достаточно средств");
       	
       	}
       	else if(remainder == 0){
       		b = true;
       		System.out.println("Операция прошла успешно \n\n" + b100 +
       			" выдано купюр номиналом 100 \n" + b50 + " выдано купюр номиналом 50 \n"
       			+ b20 + " выдано купюр номиналом 20\n");
            bankNote100 -= b100;
            bankNote50 -= b50;
            bankNote20 -= b20;
       	}
        	else{     	
         System.out.println("Невозможно выдать указанною сумму");
        }
        return b;
    }


public String toString() {
    return this.bankNote100 + " купюр номиналом 100 \n " + this.bankNote50 +
            " купюр номиналом 50\n  " + this.bankNote20 + " купюр номиналом 20\n";
}
}

