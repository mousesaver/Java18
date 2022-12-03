package Interfaces;

public class main {
    public static void main(String[] args) {
        ITelephone timePhone;
        timePhone = new DeskPhone(123456);
        timePhone.powerOn();
        timePhone.callPhone(123456);
        timePhone.answer();

        ITelephone mobile = new MobilePhone(3232);
        mobile.powerOn();
        mobile.callPhone(3232);
        mobile.answer();

    }
}
