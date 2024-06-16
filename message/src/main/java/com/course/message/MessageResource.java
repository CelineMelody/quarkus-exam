package com.course.message;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import com.course.Houses;
import com.course.Perso;

@Path("/api/message")
public class MessageResource {

    private final List<Perso> persoList = new CopyOnWriteArrayList<>();

    @Incoming("character-added")
    public void processMessage(Perso perso) {
        persoList.add(perso);
        System.out.println("Message received and added to list: " + perso.getName());
    }

    @GET
    @Path("/persos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Perso> getPersos() {
        return persoList;
    }

    @GET
    @Path("/persos/count/{house}")
    @Produces(MediaType.APPLICATION_JSON)
    public long countPersosByHouse(@PathParam("house") Houses house) {
        return persoList.stream()
                .filter(perso -> perso.getHouses() == house)
                .count();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
}
