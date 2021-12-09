import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorCSBuilderTest {

    @Test
    void deveRetornarExcecaoParaJogadorComIdadeInvalida() {
        try {
            JogadorCSBuilder jogadorCSBuilder = new JogadorCSBuilder();
            JogadorCS jogadorCS = jogadorCSBuilder
                    .setNome("João")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Idade inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaHorasJogadasInvalida() {
        try {
            JogadorCSBuilder jogadorCSBuilder = new JogadorCSBuilder();
            JogadorCS jogadorCS = jogadorCSBuilder
                    .setNome("José")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Hora Inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlunoValido() {
        JogadorCSBuilder jogadorCSBuilder = new JogadorCSBuilder();
        JogadorCS jogadorCS = jogadorCSBuilder
                .setIdade(18)
                .setNome("Fernando")
                .setHorasJogadas(500)
                .build();

        assertNotNull(jogadorCS);
    }
}