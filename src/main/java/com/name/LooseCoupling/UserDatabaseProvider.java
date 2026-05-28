package com.name.LooseCoupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails()
    {
        return "User Details from Database";
    }
}
