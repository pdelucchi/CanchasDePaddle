package db;

import canchas.Color;
import canchas.Jugador;
import canchas.JugadorAmateur;
import canchas.Paleta;
import org.junit.Before;
import org.junit.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JugadorTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

    @Before
    public void setUp(){

    }

    @Test
    public void test(){
        Color rojo = new Color("rojo");
        entityManager().persist(rojo);

        //Color maybeRojo = entityManager().find(Color.class,rojo.getId());
        Color maybeRojo = entityManager().find(Color.class,1l);
        maybeRojo.setDescription("amarillo")
        assertEquals(rojo,maybeRojo);
        //entityManager().detach(maybeRojo);
        assertEquals(rojo,maybeRojo);
        //assertNotNull(rojo.getId());
    }

    @Test
    public void test(){
        Color maybeRojo = new Color("rojo");
        Paleta paleta = new Paleta();
        paleta.setColor(maybeRojo);
        entityManager().persist(paleta);

    }

    @Test
    public void testJugadores(){
        Jugador jugadorAmateur = new JugadorAmateur();

    }

}
