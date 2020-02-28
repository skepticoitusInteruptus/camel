/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mail;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MailComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.mail.MailConfiguration getOrCreateConfiguration(MailComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.mail.MailConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MailComponent target = (MailComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "closefolder":
        case "closeFolder": getOrCreateConfiguration(target).setCloseFolder(property(camelContext, boolean.class, value)); return true;
        case "copyto":
        case "copyTo": getOrCreateConfiguration(target).setCopyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "delete": getOrCreateConfiguration(target).setDelete(property(camelContext, boolean.class, value)); return true;
        case "disconnect": getOrCreateConfiguration(target).setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "handlefailedmessage":
        case "handleFailedMessage": getOrCreateConfiguration(target).setHandleFailedMessage(property(camelContext, boolean.class, value)); return true;
        case "mimedecodeheaders":
        case "mimeDecodeHeaders": getOrCreateConfiguration(target).setMimeDecodeHeaders(property(camelContext, boolean.class, value)); return true;
        case "moveto":
        case "moveTo": getOrCreateConfiguration(target).setMoveTo(property(camelContext, java.lang.String.class, value)); return true;
        case "peek": getOrCreateConfiguration(target).setPeek(property(camelContext, boolean.class, value)); return true;
        case "skipfailedmessage":
        case "skipFailedMessage": getOrCreateConfiguration(target).setSkipFailedMessage(property(camelContext, boolean.class, value)); return true;
        case "unseen": getOrCreateConfiguration(target).setUnseen(property(camelContext, boolean.class, value)); return true;
        case "fetchsize":
        case "fetchSize": getOrCreateConfiguration(target).setFetchSize(property(camelContext, int.class, value)); return true;
        case "foldername":
        case "folderName": getOrCreateConfiguration(target).setFolderName(property(camelContext, java.lang.String.class, value)); return true;
        case "mapmailmessage":
        case "mapMailMessage": getOrCreateConfiguration(target).setMapMailMessage(property(camelContext, boolean.class, value)); return true;
        case "bcc": getOrCreateConfiguration(target).setBcc(property(camelContext, java.lang.String.class, value)); return true;
        case "cc": getOrCreateConfiguration(target).setCc(property(camelContext, java.lang.String.class, value)); return true;
        case "from": getOrCreateConfiguration(target).setFrom(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "replyto":
        case "replyTo": getOrCreateConfiguration(target).setReplyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "subject": getOrCreateConfiguration(target).setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "to": getOrCreateConfiguration(target).setTo(property(camelContext, java.lang.String.class, value)); return true;
        case "javamailsender":
        case "javaMailSender": getOrCreateConfiguration(target).setJavaMailSender(property(camelContext, org.apache.camel.component.mail.JavaMailSender.class, value)); return true;
        case "additionaljavamailproperties":
        case "additionalJavaMailProperties": getOrCreateConfiguration(target).setAdditionalJavaMailProperties(property(camelContext, java.util.Properties.class, value)); return true;
        case "alternativebodyheader":
        case "alternativeBodyHeader": getOrCreateConfiguration(target).setAlternativeBodyHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "attachmentscontenttransferencodingresolver":
        case "attachmentsContentTransferEncodingResolver": getOrCreateConfiguration(target).setAttachmentsContentTransferEncodingResolver(property(camelContext, org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.mail.MailConfiguration.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": getOrCreateConfiguration(target).setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "contenttype":
        case "contentType": getOrCreateConfiguration(target).setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "contenttyperesolver":
        case "contentTypeResolver": target.setContentTypeResolver(property(camelContext, org.apache.camel.component.mail.ContentTypeResolver.class, value)); return true;
        case "debugmode":
        case "debugMode": getOrCreateConfiguration(target).setDebugMode(property(camelContext, boolean.class, value)); return true;
        case "ignoreunsupportedcharset":
        case "ignoreUnsupportedCharset": getOrCreateConfiguration(target).setIgnoreUnsupportedCharset(property(camelContext, boolean.class, value)); return true;
        case "ignoreurischeme":
        case "ignoreUriScheme": getOrCreateConfiguration(target).setIgnoreUriScheme(property(camelContext, boolean.class, value)); return true;
        case "javamailproperties":
        case "javaMailProperties": getOrCreateConfiguration(target).setJavaMailProperties(property(camelContext, java.util.Properties.class, value)); return true;
        case "session": getOrCreateConfiguration(target).setSession(property(camelContext, javax.mail.Session.class, value)); return true;
        case "useinlineattachments":
        case "useInlineAttachments": getOrCreateConfiguration(target).setUseInlineAttachments(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": getOrCreateConfiguration(target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "username": getOrCreateConfiguration(target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

