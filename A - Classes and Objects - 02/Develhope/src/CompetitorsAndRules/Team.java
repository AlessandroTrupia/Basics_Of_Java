package CompetitorsAndRules;

public class Team {

    public String teamName;

    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();

    public void printTeamDetails(){
        p1.printProgrammerDetails();
        p2.printProgrammerDetails();
        System.out.println(teamName);
    }
}
