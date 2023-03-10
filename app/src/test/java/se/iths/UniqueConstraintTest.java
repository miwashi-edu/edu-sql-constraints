/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package se.iths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.jupiter.api.Assertions.fail;

class UniqueConstraintTest {

    private static final String CREATE_QUERY =
"""
CREATE TABLE Student (
    StudentId int NOT NULL,
    Name varchar(255) NOT NULL,
    CONSTRAINT UC_Student UNIQUE (Name)
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

    @Disabled @Test void shouldFailWhenAddingDuplicteName() throws Exception {
        fail("not yet implemented!");
    }
}
