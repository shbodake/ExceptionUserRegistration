package com.blp.exceptionuser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionUserRegistrationTest {
    ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

    @Test
    public void givenFirstNameIsProperReturnTrue() {
        boolean actualResult = exceptionUserRegistration.firstName("Sayali");
        Assert.assertEquals(true, actualResult);
    }
    @Test
    public void givenFirstNameIsProperReturnFalse() {
        boolean actualResult = exceptionUserRegistration.firstName("SaYali");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenLastNameIsProperReturnTrue() {
        boolean actualResult = exceptionUserRegistration.lastName("Bodake");
        Assert.assertEquals(true, actualResult);
    }
    @Test
    public void givenLastNameIsProperReturnFalse() {
        boolean actualResult = exceptionUserRegistration.firstName("BodAke");
        Assert.assertEquals(false, actualResult);
    }
}