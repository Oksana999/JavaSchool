package com.claim.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OptionsBean implements Serializable {
    private static final String SQL_QUERY = "Select U.*from User U where U.fName=:fName and U.lName=:lName;";
    private List<String> certificateName;

    public OptionsBean() {
    	certificateName = new ArrayList<>();
    }

    public List<String> getOptions(){
        return certificateName;
}
}