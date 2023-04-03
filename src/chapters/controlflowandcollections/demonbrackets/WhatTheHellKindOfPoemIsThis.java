package chapters.controlflowandcollections.demonbrackets;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WhatTheHellKindOfPoemIsThis {
    public static void main(String[] args) {
        String poem = " I would not, could not, in a box." +
                " I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] remix =  poem.split("");
        System.out.println(Arrays.toString(remix));
        String questionablePoem = " I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] stanza = questionablePoem.split("\\.");
        System.out.println(Arrays.toString(stanza));
    }
}
