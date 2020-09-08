package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId(){
        Job test1 = new Job();
        Job test2 = new Job();
        assertFalse(test1.equals(test2));
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        assertTrue(testJob.equals(testJob));
        assertTrue(testJob.getEmployer().equals(testJob.getEmployer()));
        assertTrue(testJob.getLocation().equals(testJob.getLocation()));
        assertTrue(testJob.getPositionType().equals(testJob.getPositionType()));
        assertTrue(testJob.getCoreCompetency().equals(testJob.getCoreCompetency()));
    }
    @Test
    public void testJobsForEquality() {
        Job testJob = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        Job testJob2 = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        assertFalse(testJob.equals(testJob2));
    }
}
