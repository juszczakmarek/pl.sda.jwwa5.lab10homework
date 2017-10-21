package pl.sda.jwwa5.lab10homework.service;


import pl.sda.jwwa5.lab10homework.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StreamsExercise {

    private final String FILENAME = "users.txt";
    private final String PATH = System.getProperty("user.dir")+ File.separator+"input\\";
    private ArrayList<User> userList;

    public StreamsExercise() {
        this.userList = createUserList();

    }


//------------------------------------------------------------------------------
    public boolean checkIfAnyUserIsOlderThanParameter(ArrayList<User> userList, Integer checkThisAge) {
        for (User currentUser: userList) {
            if (currentUser.getAge()>checkThisAge) {
                return true;
            }
        }
        return false;
    }
//------------------------------------------------------------------------------

    private ArrayList<User> addToUserList(ArrayList<User> userList, User user) {
        ArrayList<User> localUserList = userList;
        localUserList.add(user);
        return localUserList;
    }

    private ArrayList<User> createUserList() {

        ArrayList<User> localUserList = new ArrayList<>();

        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(this.PATH + this.FILENAME),"UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {
            String thisLine = scanner.nextLine().trim();
            localUserList = addToUserList(localUserList, new User(thisLine));
        }
        scanner.close();

        return localUserList;
    }


}
