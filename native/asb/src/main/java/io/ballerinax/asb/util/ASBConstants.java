/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.ballerinax.asb.util;

import io.ballerina.runtime.api.utils.StringUtils;
import io.ballerina.runtime.api.values.BString;

/**
 * Asb Connector Constants.
 */
public class ASBConstants {

    // Message constant fields
    public static final String MESSAGE_RECORD = "Message";
    public static final String APPLICATION_PROPERTIES = "ApplicationProperties";
    // Message content data binding errors
    public static final String XML_CONTENT_ERROR = "Error while retrieving the xml content of the message. ";
    public static final String JSON_CONTENT_ERROR = "Error while retrieving the json content of the message. ";
    public static final String TEXT_CONTENT_ERROR = "Error while retrieving the string content of the message. ";
    public static final String INT_CONTENT_ERROR = "Error while retrieving the int content of the message. ";
    public static final String FLOAT_CONTENT_ERROR = "Error while retrieving the float content of the message. ";
    // Message receive modes
    public static final String PEEKLOCK = "PEEKLOCK";
    public static final String RECEIVEANDDELETE = "RECEIVEANDDELETE";
    // listener constant fields
    public static final String CONSUMER_SERVICES = "consumer_services";
    public static final String ASB_CALLER = "asb_caller";
    public static final String STARTED_SERVICES = "started_services";
    public static final String FUNC_ON_MESSAGE = "onMessage";
    public static final String FUNC_ON_ERROR = "onError";
    public static final String DISPATCH_ERROR = "Error occurred while dispatching the message. ";
    public static final BString QUEUE_NAME = StringUtils.fromString("entityPath");
    public static final String UNCHECKED = "unchecked";
    
}
