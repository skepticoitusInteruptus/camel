/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atomix.client.queue;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AtomixQueueComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.atomix.client.queue.AtomixQueueConfiguration getOrCreateConfiguration(AtomixQueueComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.atomix.client.queue.AtomixQueueConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AtomixQueueComponent target = (AtomixQueueComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "atomix": getOrCreateConfiguration(target).setAtomix(property(camelContext, io.atomix.Atomix.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.atomix.client.queue.AtomixQueueConfiguration.class, value)); return true;
        case "configurationuri":
        case "configurationUri": target.setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "defaultaction":
        case "defaultAction": getOrCreateConfiguration(target).setDefaultAction(property(camelContext, org.apache.camel.component.atomix.client.queue.AtomixQueue.Action.class, value)); return true;
        case "nodes": target.setNodes(property(camelContext, java.util.List.class, value)); return true;
        case "resultheader":
        case "resultHeader": getOrCreateConfiguration(target).setResultHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "transportclassname":
        case "transportClassName": getOrCreateConfiguration(target).setTransportClassName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "defaultresourceconfig":
        case "defaultResourceConfig": getOrCreateConfiguration(target).setDefaultResourceConfig(property(camelContext, java.util.Properties.class, value)); return true;
        case "defaultresourceoptions":
        case "defaultResourceOptions": getOrCreateConfiguration(target).setDefaultResourceOptions(property(camelContext, java.util.Properties.class, value)); return true;
        case "ephemeral": getOrCreateConfiguration(target).setEphemeral(property(camelContext, boolean.class, value)); return true;
        case "readconsistency":
        case "readConsistency": getOrCreateConfiguration(target).setReadConsistency(property(camelContext, io.atomix.resource.ReadConsistency.class, value)); return true;
        case "resourceconfigs":
        case "resourceConfigs": getOrCreateConfiguration(target).setResourceConfigs(property(camelContext, java.util.Map.class, value)); return true;
        case "resourceoptions":
        case "resourceOptions": getOrCreateConfiguration(target).setResourceOptions(property(camelContext, java.util.Map.class, value)); return true;
        default: return false;
        }
    }

}

