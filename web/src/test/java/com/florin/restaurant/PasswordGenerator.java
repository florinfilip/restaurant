package com.florin.restaurant;


import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
public class PasswordGenerator {



    @Test
    void shouldgeneratePassword(){
        BCryptPasswordEncoder encoder  = new BCryptPasswordEncoder();
        String rawPass="javaSpring";
        String encodedPass= encoder.encode(rawPass);
        System.out.println(encodedPass);


    }


}
