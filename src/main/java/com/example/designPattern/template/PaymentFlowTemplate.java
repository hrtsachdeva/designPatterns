package com.example.designPattern.template;

public abstract class PaymentFlowTemplate {

    public abstract void  validate();
    public abstract void deduct();
    public abstract void  deductFee();
    public abstract void depositToParty();

    public final void sendMoney(){
        validate();
        deduct();
        deductFee();
        depositToParty();
    }
}
