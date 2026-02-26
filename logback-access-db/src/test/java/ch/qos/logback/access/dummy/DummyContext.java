package ch.qos.logback.access.dummy;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ConfigurationEvent;
import ch.qos.logback.core.spi.ConfigurationEventListener;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.spi.SequenceNumberGenerator;
import ch.qos.logback.core.status.StatusManager;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.ReentrantLock;

public class DummyContext implements Context {
    @Override
    public StatusManager getStatusManager() {
        return null;
    }

    @Override
    public Object getObject(String s) {
        return null;
    }

    @Override
    public void putObject(String s, Object o) {

    }

    @Override
    public void addSubstitutionProperty(String s, String s1) {

    }

    @Override
    public String getProperty(String s) {
        return "";
    }

    @Override
    public void putProperty(String s, String s1) {

    }

    @Override
    public Map<String, String> getCopyOfPropertyMap() {
        return Map.of();
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setName(String s) {

    }

    @Override
    public long getBirthTime() {
        return 0;
    }

    @Override
    public ReentrantLock getConfigurationLock() {
        return null;
    }

    @Override
    public ScheduledExecutorService getScheduledExecutorService() {
        return null;
    }

    @Override
    public ExecutorService getExecutorService() {
        return null;
    }

    @Override
    public void register(LifeCycle lifeCycle) {

    }

    @Override
    public void addScheduledFuture(ScheduledFuture<?> scheduledFuture) {

    }

    @Override
    public SequenceNumberGenerator getSequenceNumberGenerator() {
        return null;
    }

    @Override
    public void setSequenceNumberGenerator(SequenceNumberGenerator sequenceNumberGenerator) {

    }

    @Override
    public void addConfigurationEventListener(ConfigurationEventListener configurationEventListener) {

    }

    @Override
    public void fireConfigurationEvent(ConfigurationEvent configurationEvent) {

    }
}
