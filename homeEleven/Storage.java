package com.telran.com.homeEleven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

    private Map<String, List<UserRequest>> userRequests;

    public Storage() {
        userRequests = new HashMap<>();
    }

    public void addRequest(String username, String address, Answer answer) {
        UserRequest request = new UserRequest(address, answer);
        if (!userRequests.containsKey(username)) {
            userRequests.put(username, new ArrayList<>());
        }
        userRequests.get(username).add(request);
    }

    public List<UserRequest> getRequestsByUsername(String username) {
        return userRequests.getOrDefault(username, new ArrayList<>());
    }

    public void displayStatistics(String username) {
        List<UserRequest> requests = getRequestsByUsername(username);
        System.out.println("User: " + username);
        System.out.println("Total requests: " + requests.size());
        int approved = 0, denied = 0, errors = 0;
        for (UserRequest request : requests) {
            switch (request.getAnswer()) {
                case APPROVED:
                    approved++;
                    break;
                case DENIED:
                    denied++;
                    break;
                case ERROR:
                    errors++;
                    break;
            }
        }
        System.out.println("Approved: " + approved);
        System.out.println("Denied: " + denied);
        System.out.println("Errors: " + errors);
    }
}
