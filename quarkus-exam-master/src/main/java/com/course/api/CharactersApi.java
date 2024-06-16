package com.course.api;

import com.course.model.InlineResponse2004;
import com.course.model.InlineResponse2005;
import jakarta.ws.rs.*;
import java.util.List;

/**
 * Potter DB API
 *
 * <p>
 * This is the API for Potter DB. It is a RESTful API that uses JSON:API.
 * Further links: - [potterdb.com](https://potterdb.com) -
 * [docs.potterdb.com](https://docs.potterdb.com) -
 * [jsonapi.org](https://jsonapi.org)
 */
@Path("/")
public interface CharactersApi {

    // You can remove this method
    @GET
    public void test();

    /**
     * Retrieves a character
     * <p>
     * Retrieves a specific character by id, use \&quot;random\&quot; to get a
     * random character.
     */
    @Produces({ "application/json" })
    public InlineResponse2005 getCharacter(@PathParam("id") String id);

    /**
     * Retrieves a list of characters
     * <p>
     * Retrieves a list of characters; paginated, sorted and filtered by attributes.
     */
    public InlineResponse2004 getCharacters(@QueryParam("page[size]") @DefaultValue("50") Integer pageSize,
            @QueryParam("page[number]") @DefaultValue("1") Integer pageNumber, @QueryParam("sort") List<String> sort,
            @QueryParam("filter") String filter);
}
