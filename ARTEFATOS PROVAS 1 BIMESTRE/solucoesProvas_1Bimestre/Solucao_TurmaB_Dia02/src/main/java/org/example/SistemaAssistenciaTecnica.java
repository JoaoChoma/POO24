package org.example;

public class SistemaAssistenciaTecnica {
    public static void main(String[] args) {
        AssistenciaTecnica assistencia = new AssistenciaTecnica();


        Dispositivo smartphone = new Smartphone("iPhone 12", "Troca de tela");
        Dispositivo notebook = new Notebook("Dell XPS", "Formatação e troca de disco");
        Dispositivo console = new Console("PS5", "Falha de leitura de disco");


        assistencia.registrarDispositivo(smartphone);
        assistencia.registrarDispositivo(notebook);
        assistencia.registrarDispositivo(console);

        assistencia.diagnosticarDispositivo(smartphone);
        assistencia.diagnosticarDispositivo(notebook);
        assistencia.diagnosticarDispositivo(console);

        assistencia.gerarOrcamento(smartphone);
        assistencia.gerarOrcamento(notebook);
        assistencia.gerarOrcamento(console);

        assistencia.aprovarOrcamento(smartphone, true);
        assistencia.aprovarOrcamento(notebook, true);
        assistencia.aprovarOrcamento(console, false);

        assistencia.alocarTecnico(smartphone);
        assistencia.alocarTecnico(notebook);
        assistencia.alocarTecnico(console);
        
        assistencia.gerarRelatorio();
    }
}
