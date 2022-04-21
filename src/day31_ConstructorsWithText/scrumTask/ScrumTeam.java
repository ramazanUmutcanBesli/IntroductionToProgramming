package day31_ConstructorsWithText.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA,SM;
    public ArrayList<Tester> testersList =new ArrayList<>();
    public ArrayList<Developer> developersList =new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }
    public void addTester(Tester tester){
        testersList.add(tester);

    }
    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));

    }
    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        developersList.addAll(Arrays.asList(developers));
    }
    public void removeTester (int employeeID){
        testersList.removeIf(p->p.employeeID==employeeID);
    }
    public void removeDeveloper (int employeeID){
        developersList.removeIf(p->p.employeeID==employeeID);

    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers = " + testersList.size() +
                ", total number of developers = " + developersList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
