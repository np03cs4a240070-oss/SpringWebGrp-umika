package io.herald.MySpringWeb.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(

                "cloud_name","nlfirfs0",
                "api_key","922131876934265",
                "api_secret","abMyzcih8bUKXrNSH-NVDqvA-Lw",
                "secure",true

        ));
    }





}
