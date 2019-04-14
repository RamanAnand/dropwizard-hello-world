package com.raman.Dropwizard;
/*
 * JSON format :
 * {
 *    "message": "Hi Friend! Now you will learn about Dropwizard from Stack Abuse!"
 *	}
 * 
 */
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Representation {
	@Length(max = 3)
    private String message;

    public Representation() {
        // Jackson deserialization
    }

    @JsonProperty
    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Representation(String message) {
        this.message = message;
    }

}
