package org.launchcode.techjobs_oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job {

    /** UNIQUE ID FIELDS **/
    private int id;
    private static int nextId = 1;

    /** JOB FIELDS **/
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    /** JOB ID ASSIGNMENT CONSTRUCTOR **/
    public Job(){
        id = nextId;
        nextId++;
    }

    /** CONSTRUCTOR **/
    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType,
               CoreCompetency aCoreCompetency){
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

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

        /** CREATE ARRAY LIST FOR CHECKING BLANK FIELDS **/
        ArrayList<String> fieldObjects = new ArrayList<>();
        fieldObjects.add(employer.toString());
        fieldObjects.add(location.toString());
        fieldObjects.add(positionType.toString());
        fieldObjects.add(coreCompetency.toString());

        /** SET BLANK FIELD TO "DATA NOT AVAILABLE **/
        for(int i = 0; i < fieldObjects.size(); i++){
            if(fieldObjects.get(i).isBlank()){
                fieldObjects.set(i, "Data not available");
            }
        }


        /** RETURN STRING THAT HAS FIELDS CALLED FROM ARRAY LIST **/
        return "\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "Employer: " + fieldObjects.get(0)
                + "\n" + "Location: " + fieldObjects.get(1) + "\n" + "Position Type: " + fieldObjects.get(2) + "\n" +
                "Core Competency: " + fieldObjects.get(3) + "\n";
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

    /******* METHODS I THOUGHT I NEEDED *******/

/*    public Boolean checkBlankLineBefore(){
        String aToString = this.toString();
        String firstSpace = aToString.substring(0,1);
        Boolean answer = firstSpace.contains("\n");

        return answer;
    }

    public Boolean checkBlankLineAfter(){
        String aToString = this.toString();

        *//**FIGURE OUT THE LAST INDEX**//*
        int lastIndex = aToString.length();

        *//**FIGURE OUT SECOND TO LAST INDEX**//*
        int secondToLastIndex = lastIndex -1;
        String lastSpace = aToString.substring(secondToLastIndex, lastIndex);
        Boolean answer = lastSpace.contains("\n");
        return answer;
    }*/



}
