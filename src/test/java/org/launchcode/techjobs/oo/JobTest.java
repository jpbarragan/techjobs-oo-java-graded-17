package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        int expected = job1.getId();
        int actual = job2.getId();
        assertNotEquals(expected, actual);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job3.getName() instanceof String);
        assertEquals("Product tester", job3.getName());

        assertTrue(job3.getEmployer() instanceof Employer);
        assertEquals("ACME", job3.getEmployer().getValue());

        assertTrue(job3.getLocation() instanceof Location);
        assertEquals("Desert", job3.getLocation().getValue());

        assertTrue(job3.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job3.getPositionType().getValue());

        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job4.getId() == job5.getId());

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newline = System.lineSeparator();
        String expected = newline;
        int end = job6.toString().length();
        String actual1 = String.valueOf(job6.toString().charAt(0));
        String actual2 = String.valueOf(job6.toString().charAt(end - 1));
        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newline = System.lineSeparator();
        String expected = newline +
                "ID: " + job7.getId() + newline +
                "Name: " + job7.getName() + newline +
                "Employer: " + job7.getEmployer() + newline +
                "Location: " + job7.getLocation() + newline +
                "Position Type: " + job7.getPositionType() + newline +
                "Core Competency: " + job7.getCoreCompetency() +
                newline;
        String actual = job7.toString() ;
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job job8 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newline = System.lineSeparator();
        String expected = newline +
                "ID: " + job8.getId() + newline +
                "Name: " + job8.getName() + newline +
                "Employer: " + "Data not available" + newline +
                "Location: " + job8.getLocation() + newline +
                "Position Type: " + job8.getPositionType() + newline +
                "Core Competency: " + job8.getCoreCompetency() + newline +
                newline;
        String actual = job8.toString() ;
        assertEquals(expected, actual);
    }
}
