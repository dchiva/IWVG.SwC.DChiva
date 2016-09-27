package es.miw.DC;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

	private User user;

    @Before
    public void before() {
        user = new User(1,"Hola","Amigos");
    }

    @Test
    public void testFullName() {
    	assertEquals("Hola Amigos", user.fullName());
    }

    @Test
    public void testInitials() {
    	assertEquals("H.", user.initials());
    }

    @Test
    public void testGetNumber() {
    	assertEquals(1, user.getNumber());
    }

    @Test
    public void testGetName() {
    	assertEquals("Hola", user.getName());
    }

    @Test
    public void testGetFamilyName() {
    	assertEquals("Amigos", user.getFamilyName());
    }

    @Test
    public void testGetAge() {
    	user.setBirthYear(1994);
    	assertEquals(22, user.getAge());
    }
}
