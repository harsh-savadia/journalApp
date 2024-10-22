// package com.example.journalApp.Service;

// import com.example.journalApp.Repository.UserRepository;
// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.mockito.ArgumentMatchers;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.test.context.ActiveProfiles;

// import java.util.ArrayList;

// import static org.mockito.Mockito.when;

// @Disabled("Reason for disabling")
// @ActiveProfiles("dev")
// public class UserDetailsServiceImplTests {

//     @InjectMocks
//     private UserDetailsServiceImpl userDetailsService;

//     @Mock
//     private UserRepository userRepository;

//     @BeforeEach
//     void setUp() {
//         MockitoAnnotations.initMocks(this);
//     }

//     @Disabled("Reason for disabling")
//     @Test
//     void loadUserByUsernameTest() {
//        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("ram").password("inrinrick").roles(new ArrayList<>()).build());
//        UserDetails user = userDetailsService.loadUserByUsername("Harsh");
//        Assertions.assertNotNull(user);
//     }

// }
