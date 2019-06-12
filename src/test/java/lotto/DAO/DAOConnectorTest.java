package lotto.DAO;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.assertj.core.api.Assertions.assertThat;

public class DAOConnectorTest {

    @Test
    void connection() {
        assertThat(DAOConnector.getConnection()).isNotNull();
    }
}
