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
import org.apache.camel.component.consul.ConsulComponent;

/**
 * The camel consul component allows you to work with Consul, a distributed,
 * highly available, datacenter-aware, service discovery and configuration
 * system.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ConsulComponentBuilderFactory {

    /**
     * Consul (camel-consul)
     * The camel consul component allows you to work with Consul, a distributed,
     * highly available, datacenter-aware, service discovery and configuration
     * system.
     * 
     * Category: api,cloud
     * Since: 2.18
     * Maven coordinates: org.apache.camel:camel-consul
     */
    static ConsulComponentBuilder consul() {
        return new ConsulComponentBuilderImpl();
    }

    /**
     * Builder for the Consul component.
     */
    interface ConsulComponentBuilder
            extends
                ComponentBuilder<ConsulComponent> {
        /**
         * Connect timeout for OkHttpClient.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: common
         */
        default ConsulComponentBuilder connectTimeoutMillis(
                java.lang.Long connectTimeoutMillis) {
            doSetProperty("connectTimeoutMillis", connectTimeoutMillis);
            return this;
        }
        /**
         * Reference to a com.orbitz.consul.Consul in the registry.
         * 
         * The option is a: <code>com.orbitz.consul.Consul</code> type.
         * 
         * Group: common
         */
        default ConsulComponentBuilder consulClient(
                com.orbitz.consul.Consul consulClient) {
            doSetProperty("consulClient", consulClient);
            return this;
        }
        /**
         * The default key. Can be overridden by CamelConsulKey.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default ConsulComponentBuilder key(java.lang.String key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * Configure if the AgentClient should attempt a ping before returning
         * the Consul instance.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default ConsulComponentBuilder pingInstance(boolean pingInstance) {
            doSetProperty("pingInstance", pingInstance);
            return this;
        }
        /**
         * Read timeout for OkHttpClient.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: common
         */
        default ConsulComponentBuilder readTimeoutMillis(
                java.lang.Long readTimeoutMillis) {
            doSetProperty("readTimeoutMillis", readTimeoutMillis);
            return this;
        }
        /**
         * Set tags. You can separate multiple tags by comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default ConsulComponentBuilder tags(java.lang.String tags) {
            doSetProperty("tags", tags);
            return this;
        }
        /**
         * The Consul agent URL.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default ConsulComponentBuilder url(java.lang.String url) {
            doSetProperty("url", url);
            return this;
        }
        /**
         * Write timeout for OkHttpClient.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: common
         */
        default ConsulComponentBuilder writeTimeoutMillis(
                java.lang.Long writeTimeoutMillis) {
            doSetProperty("writeTimeoutMillis", writeTimeoutMillis);
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
        default ConsulComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The default action. Can be overridden by CamelConsulAction.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ConsulComponentBuilder action(java.lang.String action) {
            doSetProperty("action", action);
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
        default ConsulComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Default to transform values retrieved from Consul i.e. on KV endpoint
         * to string.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ConsulComponentBuilder valueAsString(boolean valueAsString) {
            doSetProperty("valueAsString", valueAsString);
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
        default ConsulComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Consul configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.consul.ConsulConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default ConsulComponentBuilder configuration(
                org.apache.camel.component.consul.ConsulConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The consistencyMode used for queries, default
         * ConsistencyMode.DEFAULT.
         * 
         * The option is a:
         * <code>com.orbitz.consul.option.ConsistencyMode</code> type.
         * 
         * Default: DEFAULT
         * Group: advanced
         */
        default ConsulComponentBuilder consistencyMode(
                com.orbitz.consul.option.ConsistencyMode consistencyMode) {
            doSetProperty("consistencyMode", consistencyMode);
            return this;
        }
        /**
         * The data center.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default ConsulComponentBuilder datacenter(java.lang.String datacenter) {
            doSetProperty("datacenter", datacenter);
            return this;
        }
        /**
         * The near node to use for queries.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default ConsulComponentBuilder nearNode(java.lang.String nearNode) {
            doSetProperty("nearNode", nearNode);
            return this;
        }
        /**
         * The note meta-data to use for queries.
         * 
         * The option is a: <code>java.util.List<java.lang.String></code> type.
         * 
         * Group: advanced
         */
        default ConsulComponentBuilder nodeMeta(
                java.util.List<java.lang.String> nodeMeta) {
            doSetProperty("nodeMeta", nodeMeta);
            return this;
        }
        /**
         * The second to wait for a watch event, default 10 seconds.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 10
         * Group: watch
         */
        default ConsulComponentBuilder blockSeconds(
                java.lang.Integer blockSeconds) {
            doSetProperty("blockSeconds", blockSeconds);
            return this;
        }
        /**
         * The first index for watch for, default 0.
         * 
         * The option is a: <code>java.math.BigInteger</code> type.
         * 
         * Default: 0
         * Group: watch
         */
        default ConsulComponentBuilder firstIndex(
                java.math.BigInteger firstIndex) {
            doSetProperty("firstIndex", firstIndex);
            return this;
        }
        /**
         * Recursively watch, default false.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: watch
         */
        default ConsulComponentBuilder recursive(boolean recursive) {
            doSetProperty("recursive", recursive);
            return this;
        }
        /**
         * Sets the ACL token to be used with Consul.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ConsulComponentBuilder aclToken(java.lang.String aclToken) {
            doSetProperty("aclToken", aclToken);
            return this;
        }
        /**
         * Sets the password to be used for basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ConsulComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * SSL configuration using an
         * org.apache.camel.support.jsse.SSLContextParameters instance.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default ConsulComponentBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default ConsulComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
        /**
         * Sets the username to be used for basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ConsulComponentBuilder userName(java.lang.String userName) {
            doSetProperty("userName", userName);
            return this;
        }
    }

    class ConsulComponentBuilderImpl
            extends
                AbstractComponentBuilder<ConsulComponent>
            implements
                ConsulComponentBuilder {
        @Override
        protected ConsulComponent buildConcreteComponent() {
            return new ConsulComponent();
        }
        private org.apache.camel.component.consul.ConsulConfiguration getOrCreateConfiguration(
                org.apache.camel.component.consul.ConsulComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.consul.ConsulConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "connectTimeoutMillis": getOrCreateConfiguration((ConsulComponent) component).setConnectTimeoutMillis((java.lang.Long) value); return true;
            case "consulClient": getOrCreateConfiguration((ConsulComponent) component).setConsulClient((com.orbitz.consul.Consul) value); return true;
            case "key": getOrCreateConfiguration((ConsulComponent) component).setKey((java.lang.String) value); return true;
            case "pingInstance": getOrCreateConfiguration((ConsulComponent) component).setPingInstance((boolean) value); return true;
            case "readTimeoutMillis": getOrCreateConfiguration((ConsulComponent) component).setReadTimeoutMillis((java.lang.Long) value); return true;
            case "tags": getOrCreateConfiguration((ConsulComponent) component).setTags((java.lang.String) value); return true;
            case "url": getOrCreateConfiguration((ConsulComponent) component).setUrl((java.lang.String) value); return true;
            case "writeTimeoutMillis": getOrCreateConfiguration((ConsulComponent) component).setWriteTimeoutMillis((java.lang.Long) value); return true;
            case "bridgeErrorHandler": ((ConsulComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "action": getOrCreateConfiguration((ConsulComponent) component).setAction((java.lang.String) value); return true;
            case "lazyStartProducer": ((ConsulComponent) component).setLazyStartProducer((boolean) value); return true;
            case "valueAsString": getOrCreateConfiguration((ConsulComponent) component).setValueAsString((boolean) value); return true;
            case "basicPropertyBinding": ((ConsulComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((ConsulComponent) component).setConfiguration((org.apache.camel.component.consul.ConsulConfiguration) value); return true;
            case "consistencyMode": getOrCreateConfiguration((ConsulComponent) component).setConsistencyMode((com.orbitz.consul.option.ConsistencyMode) value); return true;
            case "datacenter": getOrCreateConfiguration((ConsulComponent) component).setDatacenter((java.lang.String) value); return true;
            case "nearNode": getOrCreateConfiguration((ConsulComponent) component).setNearNode((java.lang.String) value); return true;
            case "nodeMeta": getOrCreateConfiguration((ConsulComponent) component).setNodeMeta((java.util.List) value); return true;
            case "blockSeconds": getOrCreateConfiguration((ConsulComponent) component).setBlockSeconds((java.lang.Integer) value); return true;
            case "firstIndex": getOrCreateConfiguration((ConsulComponent) component).setFirstIndex((java.math.BigInteger) value); return true;
            case "recursive": getOrCreateConfiguration((ConsulComponent) component).setRecursive((boolean) value); return true;
            case "aclToken": getOrCreateConfiguration((ConsulComponent) component).setAclToken((java.lang.String) value); return true;
            case "password": getOrCreateConfiguration((ConsulComponent) component).setPassword((java.lang.String) value); return true;
            case "sslContextParameters": getOrCreateConfiguration((ConsulComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "useGlobalSslContextParameters": ((ConsulComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            case "userName": getOrCreateConfiguration((ConsulComponent) component).setUserName((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}