/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.directoryservices.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.Readable;
import com.microsoft.services.odata.interfaces.*;
import com.microsoft.directoryservices.*; 
import com.microsoft.directoryservices.*;       

/**
 * The type  DirectoryRoleTemplateFetcher.
 */
public class DirectoryRoleTemplateFetcher extends ODataEntityFetcher<DirectoryRoleTemplate,DirectoryRoleTemplateOperations> 
                                     implements Readable<DirectoryRoleTemplate> {

     /**
     * Instantiates a new DirectoryRoleTemplateFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public DirectoryRoleTemplateFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, DirectoryRoleTemplate.class, DirectoryRoleTemplateOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public DirectoryRoleTemplateFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public DirectoryRoleTemplateFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    	}