package demo.resources;

import com.codahale.metrics.annotation.Timed;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloResource {

    public static final class Input {
        @Size(min = 3)
        public String message;
    }

    public static final class Saying {
        public String word;
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") String name, @Valid Input input ) {
        String word = "Hello, " + name + "! (" + input.message + ")";
        Saying saying = new Saying();
        saying.word = word;
        return saying;
    }
}
