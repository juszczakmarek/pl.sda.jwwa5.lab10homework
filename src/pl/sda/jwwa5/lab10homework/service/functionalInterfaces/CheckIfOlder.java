package pl.sda.jwwa5.lab10homework.service.functionalInterfaces;

import pl.sda.jwwa5.lab10homework.User;

public interface CheckIfOlder {
    boolean checkIfOlderThan(User user, Integer checkThisAge);
}
