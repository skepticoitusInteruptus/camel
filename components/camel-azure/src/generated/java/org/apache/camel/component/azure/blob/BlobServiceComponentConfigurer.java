/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.blob;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BlobServiceComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.azure.blob.BlobServiceConfiguration getOrCreateConfiguration(BlobServiceComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.azure.blob.BlobServiceConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BlobServiceComponent target = (BlobServiceComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "azureblobclient":
        case "azureBlobClient": getOrCreateConfiguration(target).setAzureBlobClient(property(camelContext, com.microsoft.azure.storage.blob.CloudBlob.class, value)); return true;
        case "bloboffset":
        case "blobOffset": getOrCreateConfiguration(target).setBlobOffset(property(camelContext, java.lang.Long.class, value)); return true;
        case "blobtype":
        case "blobType": getOrCreateConfiguration(target).setBlobType(property(camelContext, org.apache.camel.component.azure.blob.BlobType.class, value)); return true;
        case "closestreamafterread":
        case "closeStreamAfterRead": getOrCreateConfiguration(target).setCloseStreamAfterRead(property(camelContext, boolean.class, value)); return true;
        case "credentials": getOrCreateConfiguration(target).setCredentials(property(camelContext, com.microsoft.azure.storage.StorageCredentials.class, value)); return true;
        case "datalength":
        case "dataLength": getOrCreateConfiguration(target).setDataLength(property(camelContext, java.lang.Long.class, value)); return true;
        case "filedir":
        case "fileDir": getOrCreateConfiguration(target).setFileDir(property(camelContext, java.lang.String.class, value)); return true;
        case "publicforread":
        case "publicForRead": getOrCreateConfiguration(target).setPublicForRead(property(camelContext, boolean.class, value)); return true;
        case "streamreadsize":
        case "streamReadSize": getOrCreateConfiguration(target).setStreamReadSize(property(camelContext, int.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "blobmetadata":
        case "blobMetadata": getOrCreateConfiguration(target).setBlobMetadata(property(camelContext, java.util.Map.class, value)); return true;
        case "blobprefix":
        case "blobPrefix": getOrCreateConfiguration(target).setBlobPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "closestreamafterwrite":
        case "closeStreamAfterWrite": getOrCreateConfiguration(target).setCloseStreamAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.azure.blob.BlobServiceOperations.class, value)); return true;
        case "streamwritesize":
        case "streamWriteSize": getOrCreateConfiguration(target).setStreamWriteSize(property(camelContext, int.class, value)); return true;
        case "useflatlisting":
        case "useFlatListing": getOrCreateConfiguration(target).setUseFlatListing(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.azure.blob.BlobServiceConfiguration.class, value)); return true;
        default: return false;
        }
    }

}

