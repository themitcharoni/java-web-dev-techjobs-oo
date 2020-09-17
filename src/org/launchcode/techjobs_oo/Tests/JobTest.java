package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob;
    Job testJob2;
    Job testEmptyJob1;
    Job testEmptyJob2;


    @Before
    public void createTestJobs() {
        testJob = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        testJob2 = new Job(
                "Product tester",
                new Employer(""),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        testEmptyJob1 = new Job();
        testEmptyJob2 = new Job();
//        testBlankField = testEmptyJob2.getEmployer().toString();

    }

    @Test
    public void testSettingJobId() {
        assertFalse(testEmptyJob1.equals(testEmptyJob2));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob.equals(testJob));
        assertTrue(testJob.getEmployer().equals(testJob.getEmployer()));
        assertTrue(testJob.getLocation().equals(testJob.getLocation()));
        assertTrue(testJob.getPositionType().equals(testJob.getPositionType()));
        assertTrue(testJob.getCoreCompetency().equals(testJob.getCoreCompetency()));
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob.equals(testJob2));
    }


    //Create a test to check for blank at beginning and end
    @Test
    public void testToStringStartsAndEndsWithBlankLine() {
        assertTrue(testJob.toString().substring(0, 1).isBlank());
        assertTrue(testJob.toString().substring(testJob.toString().length()).isBlank());
    }
}


