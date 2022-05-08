package demo;

import demo.resources.HelloResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class App extends Application<Configuration> {
    public static void main(String[] args) throws Exception {
        new App().run("server");
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(Configuration configuration,
                    Environment environment) {
        // nothing to do yet
        environment.jersey().register(new HelloResource());
    }

}