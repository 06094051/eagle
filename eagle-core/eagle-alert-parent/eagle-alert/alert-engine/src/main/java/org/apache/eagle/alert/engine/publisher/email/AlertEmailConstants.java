/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.eagle.alert.engine.publisher.email;

public class AlertEmailConstants {

    public static final String CONN_PLAINTEXT = "plaintext";
    public static final String CONN_TLS = "tls";
    public static final String CONN_SSL = "ssl";

    public static final String CONF_MAIL_HOST = "mail.smtp.host";
    public static final String CONF_MAIL_PORT = "mail.smtp.port";
    public static final String CONF_MAIL_AUTH = "mail.smtp.auth";
    public static final String CONF_AUTH_USER = "mail.username";
    public static final String CONF_AUTH_PASSWORD = "mail.password";
    public static final String CONF_MAIL_CONN = "mail.connection";
    public static final String CONF_MAIL_DEBUG = "mail.debug";
}
