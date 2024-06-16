package com.course.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Character extends PanacheEntity {


    private String slug = null;


    private String name = null;


    private String born = null;


    private String died = null;


    private String gender = null;


    private String species = null;


    private String height = null;


    private String weight = null;


    private String hairColor = null;


    private String eyeColor = null;


    private String skinColor = null;


    private String bloodStatus = null;


    private String maritalStatus = null;


    private String nationality = null;


    private String animagus = null;


    private String boggart = null;


    private String house = null;


    private String patronus = null;


    private List<String> aliasNames = null;


    private List<String> familyMembers = null;


    private List<String> jobs = null;


    private List<String> romances = null;


    private List<String> titles = null;


    private List<String> wands = null;


    private String image = null;


    private String wiki = null;

    /**
     * Get slug
     *
     * @return slug
     **/
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Character slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get born
     *
     * @return born
     **/
    @JsonProperty("born")
    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public Character born(String born) {
        this.born = born;
        return this;
    }

    /**
     * Get died
     *
     * @return died
     **/
    @JsonProperty("died")
    public String getDied() {
        return died;
    }

    public void setDied(String died) {
        this.died = died;
    }

    public Character died(String died) {
        this.died = died;
        return this;
    }

    /**
     * Get gender
     *
     * @return gender
     **/
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Character gender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Get species
     *
     * @return species
     **/
    @JsonProperty("species")
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Character species(String species) {
        this.species = species;
        return this;
    }

    /**
     * Get height
     *
     * @return height
     **/
    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Character height(String height) {
        this.height = height;
        return this;
    }

    /**
     * Get weight
     *
     * @return weight
     **/
    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Character weight(String weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get hairColor
     *
     * @return hairColor
     **/
    @JsonProperty("hair_color")
    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public Character hairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    /**
     * Get eyeColor
     *
     * @return eyeColor
     **/
    @JsonProperty("eye_color")
    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Character eyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        return this;
    }

    /**
     * Get skinColor
     *
     * @return skinColor
     **/
    @JsonProperty("skin_color")
    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public Character skinColor(String skinColor) {
        this.skinColor = skinColor;
        return this;
    }

    /**
     * Get bloodStatus
     *
     * @return bloodStatus
     **/
    @JsonProperty("blood_status")
    public String getBloodStatus() {
        return bloodStatus;
    }

    public void setBloodStatus(String bloodStatus) {
        this.bloodStatus = bloodStatus;
    }

    public Character bloodStatus(String bloodStatus) {
        this.bloodStatus = bloodStatus;
        return this;
    }

    /**
     * Get maritalStatus
     *
     * @return maritalStatus
     **/
    @JsonProperty("marital_status")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Character maritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    /**
     * Get nationality
     *
     * @return nationality
     **/
    @JsonProperty("nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Character nationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    /**
     * Get animagus
     *
     * @return animagus
     **/
    @JsonProperty("animagus")
    public String getAnimagus() {
        return animagus;
    }

    public void setAnimagus(String animagus) {
        this.animagus = animagus;
    }

    public Character animagus(String animagus) {
        this.animagus = animagus;
        return this;
    }

    /**
     * Get boggart
     *
     * @return boggart
     **/
    @JsonProperty("boggart")
    public String getBoggart() {
        return boggart;
    }

    public void setBoggart(String boggart) {
        this.boggart = boggart;
    }

    public Character boggart(String boggart) {
        this.boggart = boggart;
        return this;
    }

    /**
     * Get house
     *
     * @return house
     **/
    @JsonProperty("house")
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public Character house(String house) {
        this.house = house;
        return this;
    }

    /**
     * Get patronus
     *
     * @return patronus
     **/
    @JsonProperty("patronus")
    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public Character patronus(String patronus) {
        this.patronus = patronus;
        return this;
    }

    /**
     * Get aliasNames
     *
     * @return aliasNames
     **/
    @JsonProperty("alias_names")
    public List<String> getAliasNames() {
        return aliasNames;
    }

    public void setAliasNames(List<String> aliasNames) {
        this.aliasNames = aliasNames;
    }

    public Character aliasNames(List<String> aliasNames) {
        this.aliasNames = aliasNames;
        return this;
    }

    public Character addAliasNamesItem(String aliasNamesItem) {
        this.aliasNames.add(aliasNamesItem);
        return this;
    }

    /**
     * Get familyMembers
     *
     * @return familyMembers
     **/
    @JsonProperty("family_members")
    public List<String> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(List<String> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public Character familyMembers(List<String> familyMembers) {
        this.familyMembers = familyMembers;
        return this;
    }

    public Character addFamilyMembersItem(String familyMembersItem) {
        this.familyMembers.add(familyMembersItem);
        return this;
    }

    /**
     * Get jobs
     *
     * @return jobs
     **/
    @JsonProperty("jobs")
    public List<String> getJobs() {
        return jobs;
    }

    public void setJobs(List<String> jobs) {
        this.jobs = jobs;
    }

    public Character jobs(List<String> jobs) {
        this.jobs = jobs;
        return this;
    }

    public Character addJobsItem(String jobsItem) {
        this.jobs.add(jobsItem);
        return this;
    }

    /**
     * Get romances
     *
     * @return romances
     **/
    @JsonProperty("romances")
    public List<String> getRomances() {
        return romances;
    }

    public void setRomances(List<String> romances) {
        this.romances = romances;
    }

    public Character romances(List<String> romances) {
        this.romances = romances;
        return this;
    }

    public Character addRomancesItem(String romancesItem) {
        this.romances.add(romancesItem);
        return this;
    }

    /**
     * Get titles
     *
     * @return titles
     **/
    @JsonProperty("titles")
    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public Character titles(List<String> titles) {
        this.titles = titles;
        return this;
    }

    public Character addTitlesItem(String titlesItem) {
        this.titles.add(titlesItem);
        return this;
    }

    /**
     * Get wands
     *
     * @return wands
     **/
    @JsonProperty("wands")
    public List<String> getWands() {
        return wands;
    }

    public void setWands(List<String> wands) {
        this.wands = wands;
    }

    public Character wands(List<String> wands) {
        this.wands = wands;
        return this;
    }

    public Character addWandsItem(String wandsItem) {
        this.wands.add(wandsItem);
        return this;
    }

    /**
     * Get image
     *
     * @return image
     **/
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Character image(String image) {
        this.image = image;
        return this;
    }

    /**
     * Get wiki
     *
     * @return wiki
     **/
    @JsonProperty("wiki")
    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }

    public Character wiki(String wiki) {
        this.wiki = wiki;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Character {\n");

        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    born: ").append(toIndentedString(born)).append("\n");
        sb.append("    died: ").append(toIndentedString(died)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    species: ").append(toIndentedString(species)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    hairColor: ").append(toIndentedString(hairColor)).append("\n");
        sb.append("    eyeColor: ").append(toIndentedString(eyeColor)).append("\n");
        sb.append("    skinColor: ").append(toIndentedString(skinColor)).append("\n");
        sb.append("    bloodStatus: ").append(toIndentedString(bloodStatus)).append("\n");
        sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
        sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
        sb.append("    animagus: ").append(toIndentedString(animagus)).append("\n");
        sb.append("    boggart: ").append(toIndentedString(boggart)).append("\n");
        sb.append("    house: ").append(toIndentedString(house)).append("\n");
        sb.append("    patronus: ").append(toIndentedString(patronus)).append("\n");
        sb.append("    aliasNames: ").append(toIndentedString(aliasNames)).append("\n");
        sb.append("    familyMembers: ").append(toIndentedString(familyMembers)).append("\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    romances: ").append(toIndentedString(romances)).append("\n");
        sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
        sb.append("    wands: ").append(toIndentedString(wands)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    wiki: ").append(toIndentedString(wiki)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
