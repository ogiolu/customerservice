package configuration;

import com.mongodb.async.client.MongoClient;
import com.mongodb.async.client.MongoClients;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.data.mongodb.repository.config.ReactiveMongoRepositoryConfigurationExtension;

@EnableReactiveMongoRepositories
@PropertySource("classpath:application.properties")
public class AppConfig  extends ReactiveMongoRepositoryConfigurationExtension{
    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create();
    }

 //  @Override
    protected String getDatabaseName() {
        return "reactive";
    }

}
