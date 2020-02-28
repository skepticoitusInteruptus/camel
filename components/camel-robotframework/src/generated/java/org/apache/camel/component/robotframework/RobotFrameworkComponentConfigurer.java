/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.robotframework;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RobotFrameworkComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration getOrCreateConfiguration(RobotFrameworkComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RobotFrameworkComponent target = (RobotFrameworkComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "argumentfile":
        case "argumentFile": getOrCreateConfiguration(target).setArgumentFile(property(camelContext, java.io.File.class, value)); return true;
        case "combinedtagstats":
        case "combinedTagStats": getOrCreateConfiguration(target).setCombinedTagStats(property(camelContext, java.lang.String.class, value)); return true;
        case "criticaltags":
        case "criticalTags": getOrCreateConfiguration(target).setCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "debugfile":
        case "debugFile": getOrCreateConfiguration(target).setDebugFile(property(camelContext, java.io.File.class, value)); return true;
        case "document": getOrCreateConfiguration(target).setDocument(property(camelContext, java.lang.String.class, value)); return true;
        case "dryrun": getOrCreateConfiguration(target).setDryrun(property(camelContext, boolean.class, value)); return true;
        case "excludes": getOrCreateConfiguration(target).setExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "exitonfailure":
        case "exitOnFailure": getOrCreateConfiguration(target).setExitOnFailure(property(camelContext, boolean.class, value)); return true;
        case "includes": getOrCreateConfiguration(target).setIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "listener": getOrCreateConfiguration(target).setListener(property(camelContext, java.lang.String.class, value)); return true;
        case "listeners": getOrCreateConfiguration(target).setListeners(property(camelContext, java.lang.String.class, value)); return true;
        case "log": getOrCreateConfiguration(target).setLog(property(camelContext, java.io.File.class, value)); return true;
        case "loglevel":
        case "logLevel": getOrCreateConfiguration(target).setLogLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "logtitle":
        case "logTitle": getOrCreateConfiguration(target).setLogTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "metadata": getOrCreateConfiguration(target).setMetadata(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorcolors":
        case "monitorColors": getOrCreateConfiguration(target).setMonitorColors(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorwidth":
        case "monitorWidth": getOrCreateConfiguration(target).setMonitorWidth(property(camelContext, java.lang.String.class, value)); return true;
        case "name": getOrCreateConfiguration(target).setName(property(camelContext, java.lang.String.class, value)); return true;
        case "noncriticaltags":
        case "nonCriticalTags": getOrCreateConfiguration(target).setNonCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "nostatusreturncode":
        case "noStatusReturnCode": getOrCreateConfiguration(target).setNoStatusReturnCode(property(camelContext, boolean.class, value)); return true;
        case "output": getOrCreateConfiguration(target).setOutput(property(camelContext, java.io.File.class, value)); return true;
        case "outputdirectory":
        case "outputDirectory": getOrCreateConfiguration(target).setOutputDirectory(property(camelContext, java.io.File.class, value)); return true;
        case "randomize": getOrCreateConfiguration(target).setRandomize(property(camelContext, java.lang.String.class, value)); return true;
        case "report": getOrCreateConfiguration(target).setReport(property(camelContext, java.io.File.class, value)); return true;
        case "reportbackground":
        case "reportBackground": getOrCreateConfiguration(target).setReportBackground(property(camelContext, java.lang.String.class, value)); return true;
        case "reporttitle":
        case "reportTitle": getOrCreateConfiguration(target).setReportTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "runemptysuite":
        case "runEmptySuite": getOrCreateConfiguration(target).setRunEmptySuite(property(camelContext, boolean.class, value)); return true;
        case "runfailed":
        case "runFailed": getOrCreateConfiguration(target).setRunFailed(property(camelContext, java.io.File.class, value)); return true;
        case "runmode":
        case "runMode": getOrCreateConfiguration(target).setRunMode(property(camelContext, java.lang.String.class, value)); return true;
        case "skipteardownonexit":
        case "skipTeardownOnExit": getOrCreateConfiguration(target).setSkipTeardownOnExit(property(camelContext, boolean.class, value)); return true;
        case "splitoutputs":
        case "splitOutputs": getOrCreateConfiguration(target).setSplitOutputs(property(camelContext, java.lang.String.class, value)); return true;
        case "suites": getOrCreateConfiguration(target).setSuites(property(camelContext, java.lang.String.class, value)); return true;
        case "suitestatlevel":
        case "suiteStatLevel": getOrCreateConfiguration(target).setSuiteStatLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "summarytitle":
        case "summaryTitle": getOrCreateConfiguration(target).setSummaryTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "tagdocs":
        case "tagDocs": getOrCreateConfiguration(target).setTagDocs(property(camelContext, java.lang.String.class, value)); return true;
        case "tags": getOrCreateConfiguration(target).setTags(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatexcludes":
        case "tagStatExcludes": getOrCreateConfiguration(target).setTagStatExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatincludes":
        case "tagStatIncludes": getOrCreateConfiguration(target).setTagStatIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatlinks":
        case "tagStatLinks": getOrCreateConfiguration(target).setTagStatLinks(property(camelContext, java.lang.String.class, value)); return true;
        case "tests": getOrCreateConfiguration(target).setTests(property(camelContext, java.lang.String.class, value)); return true;
        case "timestampoutputs":
        case "timestampOutputs": getOrCreateConfiguration(target).setTimestampOutputs(property(camelContext, boolean.class, value)); return true;
        case "variablefiles":
        case "variableFiles": getOrCreateConfiguration(target).setVariableFiles(property(camelContext, java.lang.String.class, value)); return true;
        case "variables": getOrCreateConfiguration(target).setVariables(property(camelContext, java.lang.String.class, value)); return true;
        case "warnonskippedfiles":
        case "warnOnSkippedFiles": getOrCreateConfiguration(target).setWarnOnSkippedFiles(property(camelContext, boolean.class, value)); return true;
        case "xunitfile":
        case "xunitFile": getOrCreateConfiguration(target).setXunitFile(property(camelContext, java.io.File.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration.class, value)); return true;
        default: return false;
        }
    }

}

