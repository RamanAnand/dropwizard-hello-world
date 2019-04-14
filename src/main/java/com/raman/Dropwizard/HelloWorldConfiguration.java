package com.raman.Dropwizard;
/*
 * configuration class <--- config.yml
 * main application class
 * representation class
 * resource class
 */
import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class HelloWorldConfiguration extends Configuration 
{

	@NotEmpty
    private String message;

    @NotEmpty
    private String firstParameter;

    @NotEmpty
    private String secondParameter;

    @JsonProperty
    public String getMessage() {
        return message;
    }

    @JsonProperty
    public void setMessage(String message) {
        this.message = message;
    }

    public String getFirstParameter() {
        return firstParameter;
    }

    public void setFirstParameter(String firstParameter) {
        this.firstParameter = firstParameter;
    }

    public String getSecondParameter() {
        return secondParameter;
    }

    public void setSecondParameter(String secondParameter) {
        this.secondParameter = secondParameter;
    }
}
