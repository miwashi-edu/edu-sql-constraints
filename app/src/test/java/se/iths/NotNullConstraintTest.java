/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package se.iths;

import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLIntegrityConstraintViolationException;

import static org.junit.jupiter.api.Assertions.fail;

class NotNullConstraintTest {

    private static final String CREATE_QUERY =
"""
CREATE TABLE Student (
    ID int NOT NULL,
    Name varchar(255) NOT NULL
);
""";

    private Configuration config = new Configuration();
    private Connection con = null;
    @BeforeEach
    public void setUp() throws Exception {

        con = DriverManager.getConnection(config.getDbUrl(), config.getDbUser(), config.getDbPassword());
        con.createStatement().execute("DROP TABLE IF EXISTS Student");
        try {
            con.createStatement().execute(CREATE_QUERY);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @AfterEach
    public void tearDown() throws Exception {
        con.close();
    }

    @Test void shouldFailWithCorrectException() throws Exception {
        fail("not yet implemented!");
    }
}
