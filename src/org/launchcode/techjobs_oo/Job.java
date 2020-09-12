package org.launchcode.techjobs_oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        return "\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "Employer: " + employer
                + "\n" + "Location: " + location + "\n" + "Position Type: " + positionType + "\n" +
                "Core Competency: " + coreCompetency + "\n";
    }

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType,
               CoreCompetency aCoreCompetency){
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;

        ArrayList<JobField> fieldObjects = new ArrayList<>();
        fieldObjects.add(employer);
        fieldObjects.add(location);
        fieldObjects.add(positionType);
        fieldObjects.add(coreCompetency);
        for(JobField fields : fieldObjects){
            if(fields.getValue() == ""){
                fields.setValue("Data not available");
            }
        }
    }

    /******* GETTERS AND SETTERS *******/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public int getId() {
        return id;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    /******* METHODS I NEED *******/

    public Boolean checkBlankLineBefore(){
        String aToString = this.toString();
        String firstSpace = aToString.substring(0,1);
        Boolean answer = firstSpace.contains("\n");

        return answer;
    }

    public Boolean checkBlankLineAfter(){
        String aToString = this.toString();

        /**FIGURE OUT THE LAST INDEX**/
        int lastIndex = aToString.length();

        /**FIGURE OUT SECOND TO LAST INDEX**/
        int secondToLastIndex = lastIndex -1;
        String lastSpace = aToString.substring(secondToLastIndex, lastIndex);
        Boolean answer = lastSpace.contains("\n");
        return answer;
    }



}
