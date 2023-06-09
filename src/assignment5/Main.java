package assignment5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneNumber pn1 = new PhoneNumber("NPT", "0987654321");
        PhoneNumber pn2 = new PhoneNumber("Nguyen Phu Tam", "123456789");

        ArrayList<PhoneNumber> pl1 = new ArrayList<>();

        pl1.add(pn1);
        pl1.add(pn2);

        PhoneBook pb1 = new PhoneBook(pl1);

        System.out.println(pn1.name + "'s phone number: " + pn1.phone);
        System.out.println(pn2.name + "'s phone number: " + pn2.phone);

        System.out.println("---------------\n" + pb1.getPhoneList());

        pb1.insertPhone("Tran Thi Thuy", "0999999999");
        pb1.removePhone("NPT");
        System.out.println("---------------\n" + pb1.getPhoneList());
    }
}
