package Exo01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
class userserviceTest {
    userservice us=new userservice();
    @Mock
    userrepository ur;
    @BeforeEach
    public void setup(){
    }

    @Test
    void getuserbyid() {
        ur=mock(userrepository.class);
        utilisateur u=new utilisateur();
        u.setName("admin");
        when(ur.findUserById(5)).thenReturn(u);
        us.setur(ur);
        utilisateur result = us.getuserbyid(5);
        verify(ur).findUserById(5);
        assertEquals("admin", result.getName());
    }
}
