package net.juniper.jmp.cdifoundation.producer;

import javax.enterprise.inject.Produces;

import net.juniper.jmp.persist.IJmpPersistenceManager;
import net.juniper.jmp.persist.PersistenceManagerWrapper;

import org.apache.log4j.Logger;

@javax.enterprise.context.ApplicationScoped
public class JmpFoundationProducer {
    @Produces
    public IJmpPersistenceManager getPersistenceManager() {
        return new PersistenceManagerWrapper();
    }
    
    @Produces
    public Logger getLogger() {
        return Logger.getLogger(JmpFoundationProducer.class);
    }
}
