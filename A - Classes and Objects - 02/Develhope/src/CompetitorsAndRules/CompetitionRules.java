package CompetitorsAndRules;

public class CompetitionRules {

    private static final CompetitionRules compRules = new CompetitionRules();

    private String competitionRules1 = "Do not copy and paste from StackOverflow!";
    private String competitionRules2 = "Learn every day!";
    private String competitionRules3 = "Be the best team!";

    private CompetitionRules(){}

    public static CompetitionRules getInstance(){
        return compRules;
    }

    public void printRules(){
        System.out.println(competitionRules1);
        System.out.println(competitionRules2);
        System.out.println(competitionRules3);
    }

}
