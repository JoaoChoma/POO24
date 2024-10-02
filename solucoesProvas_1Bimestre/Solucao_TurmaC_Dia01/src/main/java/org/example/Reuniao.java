package org.example;

class Reuniao extends Evento {
    private boolean privada;
    private String senhaAcesso;

    public Reuniao(String nome, String data, boolean privada) {
        super(nome, data);
        this.privada = privada;
        if (privada) {
            this.senhaAcesso = gerarSenhaUnica();
        }
    }

    @Override
    public String agendar() {
        return (privada ? "Reunião privada" : "Reunião pública") + " '" + getNome() + "' agendada para " + getData();
    }

    private String gerarSenhaUnica() {
        return "12345";  // Exemplo simples, pode ser uma lógica mais complexa
    }

    public void acessarReuniao(String senha) {
        if (privada) {
            if (senha.equals(senhaAcesso)) {
                System.out.println("Acesso concedido à reunião privada.");
            } else {
                System.out.println("Acesso negado. Senha incorreta.");
            }
        } else {
            System.out.println("Acesso livre à reunião pública.");
        }
    }

    @Override
    public void inscreverParticipante() {
        System.out.println("Reuniões não possuem limite de participantes.");
        setParticipantes(getParticipantes() + 1);
    }

    // Getters e Setters para privada e senha
    public boolean isPrivada() {
        return privada;
    }

    public void setPrivada(boolean privada) {
        this.privada = privada;
        if (privada) {
            this.senhaAcesso = gerarSenhaUnica();
        }
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }
}

