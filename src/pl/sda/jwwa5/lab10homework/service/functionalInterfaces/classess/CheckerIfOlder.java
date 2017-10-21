package pl.sda.jwwa5.lab10homework.service.functionalInterfaces.classess;

import pl.sda.jwwa5.lab10homework.User;
import pl.sda.jwwa5.lab10homework.service.functionalInterfaces.CheckIfOlder;

public class CheckerIfOlder implements CheckIfOlder {
    @Override
    public boolean checkIfOlderThan(User user, Integer checkThisAge) {
        if (user.getAge()>checkThisAge) {
            return true;
        }
        return false;
    }
}
