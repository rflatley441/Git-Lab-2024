package edu.unl.raikes.git;

public class GitLabHelper {

    private String person1;
    private String person2;
    
    GitLabHelper(String person1, String person2) {
        this.person1 = person1;
        this.person2 = person2;
    }
    
    public void PrintWelcomeMessage() {
        System.out.printf("Git lab by: %s and %s", person1, person2);}
}
