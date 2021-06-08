package com.florin.restaurant.userService;

import com.florin.restaurant.service.Impl.UserDetailsServiceImpl;
import com.florin.restaurant.user.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceJpaTest {

    @Autowired
    protected UserDetailsServiceImpl userDetailsService;




@Test
public void shouldUpdateUser(){
    User user = this.userDetailsService.findUserById(1).getUser();
    String oldUsername = user.getUsername();
    String newUsername="teodorr";
    assertEquals(user.getUsername(),newUsername);

} }

