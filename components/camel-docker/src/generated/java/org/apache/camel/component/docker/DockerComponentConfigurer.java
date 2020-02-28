/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.docker;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DockerComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.docker.DockerConfiguration getOrCreateConfiguration(DockerComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.docker.DockerConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DockerComponent target = (DockerComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.docker.DockerConfiguration.class, value)); return true;
        case "email": getOrCreateConfiguration(target).setEmail(property(camelContext, java.lang.String.class, value)); return true;
        case "host": getOrCreateConfiguration(target).setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "port": getOrCreateConfiguration(target).setPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "requesttimeout":
        case "requestTimeout": getOrCreateConfiguration(target).setRequestTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "cmdexecfactory":
        case "cmdExecFactory": getOrCreateConfiguration(target).setCmdExecFactory(property(camelContext, java.lang.String.class, value)); return true;
        case "followredirectfilter":
        case "followRedirectFilter": getOrCreateConfiguration(target).setFollowRedirectFilter(property(camelContext, boolean.class, value)); return true;
        case "loggingfilter":
        case "loggingFilter": getOrCreateConfiguration(target).setLoggingFilter(property(camelContext, boolean.class, value)); return true;
        case "maxperrouteconnections":
        case "maxPerRouteConnections": getOrCreateConfiguration(target).setMaxPerRouteConnections(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxtotalconnections":
        case "maxTotalConnections": getOrCreateConfiguration(target).setMaxTotalConnections(property(camelContext, java.lang.Integer.class, value)); return true;
        case "parameters": getOrCreateConfiguration(target).setParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "serveraddress":
        case "serverAddress": getOrCreateConfiguration(target).setServerAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "socket": getOrCreateConfiguration(target).setSocket(property(camelContext, boolean.class, value)); return true;
        case "certpath":
        case "certPath": getOrCreateConfiguration(target).setCertPath(property(camelContext, java.lang.String.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "secure": getOrCreateConfiguration(target).setSecure(property(camelContext, boolean.class, value)); return true;
        case "tlsverify":
        case "tlsVerify": getOrCreateConfiguration(target).setTlsVerify(property(camelContext, boolean.class, value)); return true;
        case "username": getOrCreateConfiguration(target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

