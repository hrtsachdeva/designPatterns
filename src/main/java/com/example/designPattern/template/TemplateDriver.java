package com.example.designPattern.template;

public class TemplateDriver {

    public void execute(){
        PaymentFlowTemplate sendMoneyToFriend = new SendMoneyToFriend();
        sendMoneyToFriend.sendMoney();
    }
}
