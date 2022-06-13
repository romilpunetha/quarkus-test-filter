package org.acme.module;

import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api/v1/test")
@ApplicationScoped
public class TestResource {

    @GET
    public Uni<Void> test() {
        return Uni.createFrom().voidItem();
    }
}
