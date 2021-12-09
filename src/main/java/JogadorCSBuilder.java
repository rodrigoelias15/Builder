public class JogadorCSBuilder {

    private JogadorCS jogadorCS;

    public JogadorCSBuilder() {
        jogadorCS = new JogadorCS();
    }

    public JogadorCS build() {
        if (jogadorCS.getIdade() == 0) {
            throw new IllegalArgumentException("Idade inválida");
        }
        if (jogadorCS.getHorasJogadas() < 0) {
            throw new IllegalArgumentException("Hora Inválida");
        }
        if (jogadorCS.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return jogadorCS;
    }

    public JogadorCSBuilder setNome(String nome) {
        jogadorCS.setNome(nome);
        return this;
    }

    public JogadorCSBuilder setNickname(String nickname) {
        jogadorCS.setNickname(nickname);
        return this;
    }

    public JogadorCSBuilder setPais(String pais) {
        jogadorCS.setPais(pais);
        return this;
    }

    public JogadorCSBuilder setNivel(String nivel) {
        jogadorCS.setNivel(nivel);
        return this;
    }

    public JogadorCSBuilder setIdade(int idade) {
        jogadorCS.setIdade(idade);
        return this;
    }

    public JogadorCSBuilder setHorasJogadas(int horasJogadas) {
        jogadorCS.setHorasJogadas(horasJogadas);
        return this;
    }
}
