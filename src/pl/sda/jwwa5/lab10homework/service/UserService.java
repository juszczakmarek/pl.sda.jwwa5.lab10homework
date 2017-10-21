package pl.sda.jwwa5.lab10homework.service;

import pl.sda.jwwa5.lab10homework.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * This class is reponsible for creation list of users and putting it to the MAP (precisely speeking - TreeMap, as the values
 * has to be sorted
 */
public class UserService {

    private Map<String,ArrayList<User>> userMap = new HashMap<>();
    private final String FILENAME = "users.txt";
    private final String PATH = System.getProperty("user.dir")+File.separator+"input\\";

    public UserService() {
        this.userMap = createUserMap();
    }

    /**
     * This method adds user to map. As for the key it takes user.firstName concatenated with user.age
     * @param userMap map of users
     * @param user user object
     * @return user map
     */
    private Map<String,ArrayList<User>> addToUserMap(Map<String,ArrayList<User>> userMap, User user) {
        if (userMap.containsKey(user.getLastName())) {
            ArrayList<User> localUserList = userMap.get(user.getLastName());
            localUserList.add(user);
            //localUserList.sort(new UserCompareAgeAsc()); //natural order
            localUserList.sort(new UserCompareAgeAsc().reversed()); //reversed order
            userMap.put(user.getLastName(),localUserList);
        } else {
            ArrayList<User> localUserList = new ArrayList<>();
            localUserList.add(user);
            //localUserList.sort(new UserCompareAgeAsc()); //natural order
            localUserList.sort(new UserCompareAgeAsc().reversed()); //reversed order
            userMap.put(user.getLastName(),localUserList);
        }

        return userMap;
    }

    /**
     * Prints user map using lambda expression
     * @param userMap user map passed as parameter
     */
    public void printUserMap(Map<String,ArrayList<User>> userMap) {
        userMap.forEach((key,value) -> System.out.println(value.toString()));
    }

    /**
     * Creates user map. No input for this method. For each new item, which will be added to map it calls {@link #addToUserMap(Map, User)} method
     * @return Map of users
     */
    private Map<String,ArrayList<User>> createUserMap() {
        Map<String,ArrayList<User>> localUserMap = new TreeMap<>();  //natural order
        //Map<String,ArrayList<User>> localUserMap = new TreeMap<>(Collections.reverseOrder()); //reversed order

        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(this.PATH + this.FILENAME),"UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {
            String thisLine = scanner.nextLine().trim();
            localUserMap = addToUserMap(localUserMap, new User(thisLine));
        }
        scanner.close();

        return localUserMap;
    }

    //----------------------------

    public Map<String,ArrayList<User>> getUserMap() {
        return userMap;
    }
}