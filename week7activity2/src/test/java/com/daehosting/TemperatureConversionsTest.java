package com.daehosting;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheit = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The celcius to FahrenheitResult conversion failed", celsiusToFahrenheit, BigDecimal.valueOf(32));
    }

    @Test
    public void getTemperatureConversionsSoap12FtoC() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitToCelsius = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals("The Fahrenheit to Celcius Result conversion failed", BigDecimal.valueOf(0), fahrenheitToCelsius);
    }

    @Test
    public void getTemperatureConversionsSoap12WindchillFahrenheit() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInFahrenheit = service.windChillInFahrenheit(BigDecimal.valueOf(32), BigDecimal.valueOf(15));
        assertEquals("The Windchill in Fahrenheit Result conversion failled", BigDecimal.valueOf(8.186), windChillInFahrenheit);
    }

    @Test
    public void getTemperatureConversionsSoap12WindchillCelcius() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInCelsius = service.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(15));
        assertEquals("The Windchill in Celcius Result conversion failled", BigDecimal.valueOf(-13.23), windChillInCelsius);
    }

}