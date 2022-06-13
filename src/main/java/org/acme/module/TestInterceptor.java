package org.acme.module;

import io.smallrye.mutiny.Uni;
import org.jboss.resteasy.reactive.server.ServerResponseFilter;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.container.ContainerResponseContext;

@ApplicationScoped
public class TestInterceptor {

    @TestAnnotation
    @ServerResponseFilter
    public Uni<Void> testAnnotationFilter(ContainerResponseContext responseContext) {

        responseContext.setStatus(400);

        return Uni.createFrom().voidItem();
    }
}
