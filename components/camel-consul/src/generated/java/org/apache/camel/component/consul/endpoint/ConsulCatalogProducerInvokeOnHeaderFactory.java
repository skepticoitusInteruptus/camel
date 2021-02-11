/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.consul.endpoint;

import org.apache.camel.AsyncCallback;
import org.apache.camel.Exchange;
import org.apache.camel.spi.InvokeOnHeaderStrategy;
import org.apache.camel.component.consul.endpoint.ConsulCatalogProducer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ConsulCatalogProducerInvokeOnHeaderFactory implements InvokeOnHeaderStrategy {

    @Override
    public Object invoke(Object obj, String key, Exchange exchange, AsyncCallback callback) throws Exception {
        org.apache.camel.component.consul.endpoint.ConsulCatalogProducer target = (org.apache.camel.component.consul.endpoint.ConsulCatalogProducer) obj;
        switch (key) {
        case "deregister":
        case "DEREGISTER": target.deregister(exchange.getMessage()); return null;
        case "get_node":
        case "GET_NODE": target.getNode(exchange.getMessage()); return null;
        case "get_service":
        case "GET_SERVICE": target.getService(exchange.getMessage()); return null;
        case "list_datacenters":
        case "LIST_DATACENTERS": target.listDatacenters(exchange.getMessage()); return null;
        case "list_nodes":
        case "LIST_NODES": target.listNodes(exchange.getMessage()); return null;
        case "list_services":
        case "LIST_SERVICES": target.listServices(exchange.getMessage()); return null;
        case "register":
        case "REGISTER": target.register(exchange.getMessage()); return null;
        default: return null;
        }
    }

}
