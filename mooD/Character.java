package com.company.mooD;

public interface Character<T> {
    String getUserName();
    String getHashedPassword();
    int getLevel();
    T getSpecialPoints();
    String hashPass();
}
