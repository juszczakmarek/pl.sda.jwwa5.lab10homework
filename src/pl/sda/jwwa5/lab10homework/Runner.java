package pl.sda.jwwa5.lab10homework;

import pl.sda.jwwa5.lab10homework.service.UserService;

import java.util.ArrayList;
import java.util.Map;

/**
 * Goal of this exercise is to:
 * 1. Load a lot of separate lines. Each line will contain following pattern: firstName_lastName_age
 * 2. As a result, data loaded should be sorted in the following order using lastname and age (if two users will have
 * exactly the same lastName, then it should be sorted using age
 */
public class Runner {
    public static void main(String[] args) {

        Map<String,ArrayList<User>> userMap;
        UserService userService = new UserService();
        userMap = userService.getUserMap();
        userService.printUserMap(userMap);

    }
}
