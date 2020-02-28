/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.etcd;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class EtcdStatsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.etcd.EtcdConfiguration getOrCreateConfiguration(EtcdStatsComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.etcd.EtcdConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        EtcdStatsComponent target = (EtcdStatsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.etcd.EtcdConfiguration.class, value)); return true;
        case "recursive": getOrCreateConfiguration(target).setRecursive(property(camelContext, boolean.class, value)); return true;
        case "servicepath":
        case "servicePath": getOrCreateConfiguration(target).setServicePath(property(camelContext, java.lang.String.class, value)); return true;
        case "timeout": getOrCreateConfiguration(target).setTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        case "uris": getOrCreateConfiguration(target).setUris(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendemptyexchangeontimeout":
        case "sendEmptyExchangeOnTimeout": getOrCreateConfiguration(target).setSendEmptyExchangeOnTimeout(property(camelContext, boolean.class, value)); return true;
        case "fromindex":
        case "fromIndex": getOrCreateConfiguration(target).setFromIndex(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "timetolive":
        case "timeToLive": getOrCreateConfiguration(target).setTimeToLive(property(camelContext, java.lang.Integer.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": getOrCreateConfiguration(target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "username":
        case "userName": getOrCreateConfiguration(target).setUserName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

