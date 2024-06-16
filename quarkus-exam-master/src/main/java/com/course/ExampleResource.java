package com.course;

import java.io.IOException;
import java.util.List;

import com.course.model.CharacterModel;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.PathParam;
import com.course.Perso;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Path("/")
public class ExampleResource {

    @Channel("character-added")
    Emitter<Perso> characterAddedEmitter;

    @GET
    @Path("/")
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public List<CharacterModel> provideAndFindAll() throws IOException {
        if (CharacterModel.count() == 0) {
            ObjectMapper objectMapper = new ObjectMapper();
            List<CharacterModel> list = objectMapper.readerForListOf(CharacterModel.class)
                    .readValue(getClass().getClassLoader().getResourceAsStream("hp.json"));
            for (CharacterModel characterModel : list) {
                characterModel.getAttributes().persist();
                characterModel.persist();
                String houseName = characterModel.getAttributes().getHouse();
                if (houseName != null) {
                    Houses house = Houses.Unknown;
                    try {
                        house = Houses.valueOf(houseName);
                    } catch (IllegalArgumentException e) {
                        System.out.println("House not found: " + houseName);
                    }
                    Perso perso = new Perso(characterModel.getAttributes().getName(), house);
                    characterAddedEmitter.send(perso);
                } else {
                    Perso perso = new Perso(characterModel.getAttributes().getName(), Houses.Unknown);
                    characterAddedEmitter.send(perso);
                }
            }
        }
        return CharacterModel.listAll();
    }

    @GET
    @Path("character/{id}")
    public List<CharacterModel> findById(@PathParam("id") Long id) {
        return CharacterModel.findById(id);
    }

    @GET
    @Path("houses/{house}")
    public List<CharacterModel> findByHouse(@PathParam("house") Houses house) {
        return CharacterModel.findByHouse(house.name());
    }

    @GET
    @Path("count-houses/{house}")
    public int countByHouse(@PathParam("house") Houses house) {
        return CharacterModel.findByHouse(house.name()).size();
    }

    @GET
    @Path("species/{specie}")
    public List<CharacterModel> findBySpeciesLike(@PathParam("specie") String specie) {
        return CharacterModel.findBySpeciesLike(specie);
    }
}
