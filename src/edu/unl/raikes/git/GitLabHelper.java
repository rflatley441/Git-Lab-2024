package edu.unl.raikes.git;

import java.util.Arrays;

public class GitLabHelper {

    private String[] persons;
        GitLabHelper(String[] persons) {
    this.persons = persons;
    }
    
    public void PrintWelcomeMessage() {
          System.out.printf("Git lab by: %s", Arrays.toString(persons));
    }
    

}

