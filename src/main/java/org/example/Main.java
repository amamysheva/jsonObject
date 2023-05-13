package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        Iam gsonObject = new Iam();

        gsonObject.name = "Anna";
        gsonObject.lastName = "Mamysheva";

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        System.out.println(gson.toJson(gsonObject));
    }
}
