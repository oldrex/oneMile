package com.mile.one.oneMile;

import com.mile.one.oneMile.models.gemfire.Person;
import org.apache.geode.cache.client.ClientRegionShortcut;

import org.springframework.boot.SpringApplication;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;

//@SpringBootApplication
@ClientCacheApplication(name = "AccessingGemFireDataRestApplication")
@EnableEntityDefinedRegions(
        basePackageClasses = Person.class,
        clientRegionShortcut = ClientRegionShortcut.LOCAL
)
//@EnableGemfireRepositories
@SuppressWarnings("unused")
public class GemApplication {

    public static void main(String[] args) {
        SpringApplication.run(GemApplication.class, args);
    }
}
