package CompetitorsAndRules;

public class Competition {

    public static void main(String[] args) {

        CompetitionRules.getInstance().printRules();

        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "Red Team";
        teamA.p1.name = "Giacomo";
        teamA.p1.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 1;

        teamA.p2.name = "Riccardo";
        teamA.p2.programmingLanguage = "C++";
        teamA.p2.yearsOfExperience = 2;

        teamB.teamName = "Blue Team ";
        teamB.p1.name = "Andrea";
        teamB.p1.programmingLanguage = "HTML";
        teamB.p1.yearsOfExperience = 1;

        teamB.p2.name = "Roberto";
        teamB.p2.programmingLanguage = "python";
        teamB.p2.yearsOfExperience = 2;

        teamA.printTeamDetails();
        teamB.printTeamDetails();
    }
}
