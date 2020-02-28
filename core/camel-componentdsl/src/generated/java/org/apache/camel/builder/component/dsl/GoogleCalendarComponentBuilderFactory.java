/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.google.calendar.GoogleCalendarComponent;

/**
 * The google-calendar component provides access to Google Calendar.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface GoogleCalendarComponentBuilderFactory {

    /**
     * Google Calendar (camel-google-calendar)
     * The google-calendar component provides access to Google Calendar.
     * 
     * Category: api,cloud
     * Since: 2.15
     * Maven coordinates: org.apache.camel:camel-google-calendar
     */
    static GoogleCalendarComponentBuilder googleCalendar() {
        return new GoogleCalendarComponentBuilderImpl();
    }

    /**
     * Builder for the Google Calendar component.
     */
    interface GoogleCalendarComponentBuilder
            extends
                ComponentBuilder<GoogleCalendarComponent> {
        /**
         * Google calendar application name. Example would be
         * camel-google-calendar/1.0.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarComponentBuilder applicationName(
                java.lang.String applicationName) {
            doSetProperty("applicationName", applicationName);
            return this;
        }
        /**
         * Client ID of the calendar application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarComponentBuilder clientId(
                java.lang.String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * To use the shared configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.google.calendar.GoogleCalendarConfiguration</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarComponentBuilder configuration(
                org.apache.camel.component.google.calendar.GoogleCalendarConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The emailAddress of the Google Service Account.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarComponentBuilder emailAddress(
                java.lang.String emailAddress) {
            doSetProperty("emailAddress", emailAddress);
            return this;
        }
        /**
         * The name of the p12 file which has the private key to use with the
         * Google Service Account.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarComponentBuilder p12FileName(
                java.lang.String p12FileName) {
            doSetProperty("p12FileName", p12FileName);
            return this;
        }
        /**
         * Specifies the level of permissions you want a calendar application to
         * have to a user account. You can separate multiple scopes by comma.
         * See https://developers.google.com/google-apps/calendar/auth for more
         * info.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: https://www.googleapis.com/auth/calendar
         * Group: common
         */
        default GoogleCalendarComponentBuilder scopes(java.lang.String scopes) {
            doSetProperty("scopes", scopes);
            return this;
        }
        /**
         * The email address of the user the application is trying to
         * impersonate in the service account flow.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarComponentBuilder user(java.lang.String user) {
            doSetProperty("user", user);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GoogleCalendarComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default GoogleCalendarComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default GoogleCalendarComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use the GoogleCalendarClientFactory as factory for creating the
         * client. Will by default use BatchGoogleCalendarClientFactory.
         * 
         * The option is a:
         * <code>org.apache.camel.component.google.calendar.GoogleCalendarClientFactory</code> type.
         * 
         * Group: advanced
         */
        default GoogleCalendarComponentBuilder clientFactory(
                org.apache.camel.component.google.calendar.GoogleCalendarClientFactory clientFactory) {
            doSetProperty("clientFactory", clientFactory);
            return this;
        }
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GoogleCalendarComponentBuilder accessToken(
                java.lang.String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Client secret of the calendar application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GoogleCalendarComponentBuilder clientSecret(
                java.lang.String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * OAuth 2 refresh token. Using this, the Google Calendar component can
         * obtain a new accessToken whenever the current one expires - a
         * necessity if the application is long-lived.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GoogleCalendarComponentBuilder refreshToken(
                java.lang.String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
            return this;
        }
    }

    class GoogleCalendarComponentBuilderImpl
            extends
                AbstractComponentBuilder<GoogleCalendarComponent>
            implements
                GoogleCalendarComponentBuilder {
        @Override
        protected GoogleCalendarComponent buildConcreteComponent() {
            return new GoogleCalendarComponent();
        }
        private org.apache.camel.component.google.calendar.GoogleCalendarConfiguration getOrCreateConfiguration(
                org.apache.camel.component.google.calendar.GoogleCalendarComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.google.calendar.GoogleCalendarConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "applicationName": getOrCreateConfiguration((GoogleCalendarComponent) component).setApplicationName((java.lang.String) value); return true;
            case "clientId": getOrCreateConfiguration((GoogleCalendarComponent) component).setClientId((java.lang.String) value); return true;
            case "configuration": ((GoogleCalendarComponent) component).setConfiguration((org.apache.camel.component.google.calendar.GoogleCalendarConfiguration) value); return true;
            case "emailAddress": getOrCreateConfiguration((GoogleCalendarComponent) component).setEmailAddress((java.lang.String) value); return true;
            case "p12FileName": getOrCreateConfiguration((GoogleCalendarComponent) component).setP12FileName((java.lang.String) value); return true;
            case "scopes": getOrCreateConfiguration((GoogleCalendarComponent) component).setScopes((java.lang.String) value); return true;
            case "user": getOrCreateConfiguration((GoogleCalendarComponent) component).setUser((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((GoogleCalendarComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((GoogleCalendarComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((GoogleCalendarComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "clientFactory": ((GoogleCalendarComponent) component).setClientFactory((org.apache.camel.component.google.calendar.GoogleCalendarClientFactory) value); return true;
            case "accessToken": getOrCreateConfiguration((GoogleCalendarComponent) component).setAccessToken((java.lang.String) value); return true;
            case "clientSecret": getOrCreateConfiguration((GoogleCalendarComponent) component).setClientSecret((java.lang.String) value); return true;
            case "refreshToken": getOrCreateConfiguration((GoogleCalendarComponent) component).setRefreshToken((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}