package com.name.LooseCoupling;

public class UserManager {
    private UserDatabaseProvider userDatabase= new UserDatabaseProvider();
    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
