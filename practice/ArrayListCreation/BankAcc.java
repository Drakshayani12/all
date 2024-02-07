package practice.ArrayListCreation;

import java.util.ArrayList;
import java.util.List;

public class BankAcc {
    ArrayList<Bank> list;

    public  BankAcc() {
    list = new ArrayList<>();
    }

    public void arrAdd(Bank b) {
        list.add(b);
    }

    public String retrive(String BankId) {
        for (Bank b : list) {
            if (b.getBankId().equals(BankId)) {
                return b.getBankId();
            }

        }
        return null;
    }

    public Bank remove(String BankId) {
        for (Bank b : list) {
            if (b.getBankId().equals(BankId)) {
                list.remove(b);
                return b;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        BankAcc ba = new BankAcc();
        ba.arrAdd(new Bank("null", null, null));
        ba.remove("null");
    }
}