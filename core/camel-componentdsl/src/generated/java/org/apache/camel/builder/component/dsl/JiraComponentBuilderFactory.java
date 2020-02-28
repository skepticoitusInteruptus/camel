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
import org.apache.camel.component.jira.JiraComponent;

/**
 * The jira component interacts with the JIRA issue tracker.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface JiraComponentBuilderFactory {

    /**
     * Jira (camel-jira)
     * The jira component interacts with the JIRA issue tracker.
     * 
     * Category: api,reporting
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-jira
     */
    static JiraComponentBuilder jira() {
        return new JiraComponentBuilderImpl();
    }

    /**
     * Builder for the Jira component.
     */
    interface JiraComponentBuilder extends ComponentBuilder<JiraComponent> {
        /**
         * Time in milliseconds to elapse for the next poll.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 6000
         * Group: common
         */
        default JiraComponentBuilder delay(java.lang.Integer delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * The Jira server url, example: http://my_jira.com:8081.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default JiraComponentBuilder jiraUrl(java.lang.String jiraUrl) {
            doSetProperty("jiraUrl", jiraUrl);
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
        default JiraComponentBuilder bridgeErrorHandler(
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
        default JiraComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default JiraComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a shared base jira configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.jira.JiraConfiguration</code> type.
         * 
         * Group: advanced
         */
        default JiraComponentBuilder configuration(
                org.apache.camel.component.jira.JiraConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * (OAuth only) The access token generated by the Jira server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default JiraComponentBuilder accessToken(java.lang.String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * (OAuth only) The consumer key from Jira settings.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default JiraComponentBuilder consumerKey(java.lang.String consumerKey) {
            doSetProperty("consumerKey", consumerKey);
            return this;
        }
        /**
         * (Basic authentication only) The password to authenticate to the Jira
         * server. Use only if username basic authentication is used.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default JiraComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * (OAuth only) The private key generated by the client to encrypt the
         * conversation to the server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default JiraComponentBuilder privateKey(java.lang.String privateKey) {
            doSetProperty("privateKey", privateKey);
            return this;
        }
        /**
         * (Basic authentication only) The username to authenticate to the Jira
         * server. Use only if OAuth is not enabled on the Jira server. Do not
         * set the username and OAuth token parameter, if they are both set, the
         * username basic authentication takes precedence.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default JiraComponentBuilder username(java.lang.String username) {
            doSetProperty("username", username);
            return this;
        }
        /**
         * (OAuth only) The verification code from Jira generated in the first
         * step of the authorization proccess.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default JiraComponentBuilder verificationCode(
                java.lang.String verificationCode) {
            doSetProperty("verificationCode", verificationCode);
            return this;
        }
    }

    class JiraComponentBuilderImpl
            extends
                AbstractComponentBuilder<JiraComponent>
            implements
                JiraComponentBuilder {
        @Override
        protected JiraComponent buildConcreteComponent() {
            return new JiraComponent();
        }
        private org.apache.camel.component.jira.JiraConfiguration getOrCreateConfiguration(
                org.apache.camel.component.jira.JiraComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.jira.JiraConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "delay": getOrCreateConfiguration((JiraComponent) component).setDelay((java.lang.Integer) value); return true;
            case "jiraUrl": getOrCreateConfiguration((JiraComponent) component).setJiraUrl((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((JiraComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((JiraComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((JiraComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((JiraComponent) component).setConfiguration((org.apache.camel.component.jira.JiraConfiguration) value); return true;
            case "accessToken": getOrCreateConfiguration((JiraComponent) component).setAccessToken((java.lang.String) value); return true;
            case "consumerKey": getOrCreateConfiguration((JiraComponent) component).setConsumerKey((java.lang.String) value); return true;
            case "password": getOrCreateConfiguration((JiraComponent) component).setPassword((java.lang.String) value); return true;
            case "privateKey": getOrCreateConfiguration((JiraComponent) component).setPrivateKey((java.lang.String) value); return true;
            case "username": getOrCreateConfiguration((JiraComponent) component).setUsername((java.lang.String) value); return true;
            case "verificationCode": getOrCreateConfiguration((JiraComponent) component).setVerificationCode((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}