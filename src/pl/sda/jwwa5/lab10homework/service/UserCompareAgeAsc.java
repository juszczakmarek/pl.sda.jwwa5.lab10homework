package pl.sda.jwwa5.lab10homework.service;

import pl.sda.jwwa5.lab10homework.User;

import java.util.Comparator;

public class UserCompareAgeAsc implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        User user1 = (User) o1;
        User user2 = (User) o2;
        return ((User) o1).getAge() - ((User) o2).getAge();
    }
}
