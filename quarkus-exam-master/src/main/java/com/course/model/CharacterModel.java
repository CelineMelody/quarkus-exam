package com.course.model;

import com.course.dto.Character;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;

import java.util.List;

/**
 * Representation of a character.
 **/
@Entity
@NamedQueries({
        @NamedQuery(name = "Character.getBySpecies", query = "from CharacterModel where attributes.species like ?1")
})
public class CharacterModel extends PanacheEntity {

    /**
     * The unique identifier of the character. Must be a valid UUID v4.
     **/
    private String jsonId = null;

    private String type = null;
    @OneToOne
    private Character attributes = new Character();
    @jakarta.persistence.Transient
    private CharacterLinks links = new CharacterLinks();

    public static List<CharacterModel> findById(Long id) {
        return find("attributes.id", id).list();
    }

    public static List<CharacterModel> findByHouse(String houseName) {
        return find("attributes.house", houseName).list();
    }

    public static List<CharacterModel> findBySpeciesLike(String species) {
        return find("#Character.getBySpecies", species).list();
    }

    @JsonProperty("id")
    public String getJsonId() {
        return jsonId;
    }

    @JsonProperty("id")
    public void setJsonId(String id) {
        this.jsonId = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Character getAttributes() {
        return attributes;
    }

    public void setAttributes(Character attributes) {
        this.attributes = attributes;
    }

    public CharacterLinks getLinks() {
        return links;
    }

    public void setLinks(CharacterLinks links) {
        this.links = links;
    }
}
