package com.example.designPattern.template;

public class SendMoneyToFriend extends PaymentFlowTemplate{
    @Override
    public void validate() {
        System.out.println("Friend validate");
    }

    @Override
    public void deduct() {
        System.out.println("Friend deduct");
    }

    @Override
    public void deductFee() {
        System.out.println("Friend deduct fee");
    }

    @Override
    public void depositToParty() {
        System.out.println(" Friend credited");
    }
}
