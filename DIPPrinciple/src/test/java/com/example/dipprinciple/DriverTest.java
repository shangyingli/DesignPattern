package com.example.dipprinciple;

import org.junit.runner.RunWith;

import java.util.List;

import javax.swing.Icon;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class DriverTest {


    @org.junit.Test
    public void driver() {
       ICar car = mock(ICar.class);
       Driver driver = new Driver();
       driver.driver(car);
       verify(car).run();
    }
}