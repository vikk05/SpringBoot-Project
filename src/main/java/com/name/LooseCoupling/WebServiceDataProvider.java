package com.name.LooseCoupling;

public class WebServiceDataProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return "Fetch from web";
    }

}
