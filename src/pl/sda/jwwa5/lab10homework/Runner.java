package pl.sda.jwwa5.lab10homework;

import pl.sda.jwwa5.lab10homework.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Runner {
    public static void main(String[] args) {

        Map<String,User> userMap;
        UserService userService = new UserService();
        userMap = userService.getUserMap();
        userService.printUserMap(userMap);

    }
}
