package com.correairwing;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("dota")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class DotaResource {

    @Inject
    DotaAssistant assistant;

    @POST
    public String chat(String userMessage) {
        return assistant.chat(userMessage);
    }

}
