/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.outlookservices;

/**
 * The type Calendar Group.
*/
public class CalendarGroup extends Entity {

    public CalendarGroup(){
        setODataType("#Microsoft.OutlookServices.CalendarGroup");
    }

    
    private java.util.List<Calendar> Calendars = new java.util.ArrayList<Calendar>();

    /**
    * Gets the Calendars.
    *
    * @return the Calendars
    */
    public java.util.List<Calendar> getCalendars() {
        return this.Calendars; 
    }
            
	private String Name;

    /**
    * Gets the Name.
    *
    * @return the String
    */
    public String getName() {
        return this.Name; 
    }

    /**
    * Sets the Name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.Name = value; 
    }
    
	private String ChangeKey;

    /**
    * Gets the Change Key.
    *
    * @return the String
    */
    public String getChangeKey() {
        return this.ChangeKey; 
    }

    /**
    * Sets the Change Key.
    *
    * @param value the String
    */
    public void setChangeKey(String value) { 
        this.ChangeKey = value; 
    }
    
	private java.util.UUID ClassId;

    /**
    * Gets the Class Id.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getClassId() {
        return this.ClassId; 
    }

    /**
    * Sets the Class Id.
    *
    * @param value the java.util.UUID
    */
    public void setClassId(java.util.UUID value) { 
        this.ClassId = value; 
    }
}