package lesson_13;

import java.util.*;

class PhoneDirectory {
    private Map<String, List<String>> directory = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        directory.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, new ArrayList<>());
    }
}

