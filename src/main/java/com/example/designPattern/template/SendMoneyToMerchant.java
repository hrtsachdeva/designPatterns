package com.example.designPattern.template;

public class SendMoneyToMerchant extends PaymentFlowTemplate {
    @Override
    public void validate() {
        System.out.println("Merchant validate");
    }

    @Override
    public void deduct() {
        System.out.println("Merchant deduct");
    }

    @Override
    public void deductFee() {
        System.out.println("Merchant deduct fee");
    }

    @Override
    public void depositToParty() {
        System.out.println("Merchant credited");
    }
}
