package oop_principles.inharitance;

import java.util.ArrayList;

public class TesterClub {

    public static void main(String[] args) {

        FrontendTester ft1 = new FrontendTester("Othman", 23, "1993", "000", true);
        BackendTester bt1 = new BackendTester("John", 45, "1982", "111", false);

        FrontendTester ft2 = new FrontendTester("Jane", 29, "1983", "222", false);
        BackendTester bt2 = new BackendTester("Alex", 36, "1996", "333", false);

        int manual = 0, automation = 0; int container = 0; int avAge = 0;

        Tester[] testers = {ft1, ft2, bt1, bt2};
        for (Tester tester : testers) {
            if (!tester.isAutomationTester) manual++;
            else automation++;
            container+=tester.age;
            avAge = container / testers.length;
        }
        System.out.println("There is " + manual + " manual testers");
        System.out.println("There is " + automation + " automation testers");
        System.out.println("Average age is " + avAge);

    }
}
