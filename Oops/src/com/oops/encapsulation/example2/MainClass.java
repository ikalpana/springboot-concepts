package com.oops.encapsulation.example2;

public class MainClass {

    public static void main (String [] args) {

        Account myAcc=new Account();

        //set values for data members through setter methods
        myAcc.setAcc_no(775492842L);
        myAcc.setName("SoftwareTestingHelp.com");
        myAcc.setEmail("sth_account@sth.com");
        myAcc.setAmount(25000f);

        //read data member values through getter methods
        System.out.println("Account No:" + myAcc.getAcc_no()+" "+"Account Name:"
                + myAcc.getName()+" \n"+"Account holder email:" + myAcc.getEmail()+"\n "
                + "Amount in Account:" + myAcc.getAmount());
    }

}
