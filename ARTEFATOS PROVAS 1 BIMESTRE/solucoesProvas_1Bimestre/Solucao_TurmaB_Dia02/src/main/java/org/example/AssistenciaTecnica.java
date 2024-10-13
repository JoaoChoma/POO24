package org.example;

import java.util.ArrayList;
import java.util.List;

public class AssistenciaTecnica {
    private List<Dispositivo> dispositivos;
    private List<String> tecnicos;

    public AssistenciaTecnica() {
        this.dispositivos = new ArrayList<>();
        this.tecnicos = new ArrayList<>();
        this.tecnicos.add("Técnico de Smartphones");
        this.tecnicos.add("Técnico de Notebooks");
        this.tecnicos.add("Técnico de Consoles");
    }

    public void registrarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
        System.out.println("Dispositivo registrado: " + dispositivo.getModelo());
    }

    public void diagnosticarDispositivo(Dispositivo dispositivo) {
        System.out.println(dispositivo.diagnosticar());
        dispositivo.setStatus("Diagnóstico realizado");
    }

    public void gerarOrcamento(Dispositivo dispositivo) {
        double orcamento = dispositivo.calcularOrcamento();
        System.out.println("Orçamento gerado para " + dispositivo.getModelo() + ": R$ " + orcamento);
    }

    public void aprovarOrcamento(Dispositivo dispositivo, boolean aprovado) {
        if (aprovado) {
            dispositivo.setStatus("Orçamento aprovado, reparo iniciado");
            System.out.println("Orçamento aprovado. Reparo iniciado para o dispositivo: " + dispositivo.getModelo());
        } else {
            dispositivo.setStatus("Orçamento rejeitado");
            System.out.println("Orçamento rejeitado para o dispositivo: " + dispositivo.getModelo());
        }
    }

    public void alocarTecnico(Dispositivo dispositivo) {
        if (dispositivo instanceof Smartphone) {
            dispositivo.setTecnicoResponsavel(tecnicos.get(0));
        } else if (dispositivo instanceof Notebook) {
            dispositivo.setTecnicoResponsavel(tecnicos.get(1));
        } else if (dispositivo instanceof Console) {
            dispositivo.setTecnicoResponsavel(tecnicos.get(2));
        }
        System.out.println("Técnico alocado para o dispositivo " + dispositivo.getModelo() + ": " + dispositivo.getTecnicoResponsavel());
    }

    public void gerarRelatorio() {
        System.out.println("\n--- Relatório de Status dos Reparos ---");
        for (Dispositivo dispositivo : dispositivos) {
            System.out.println("Dispositivo: " + dispositivo.getModelo() + ", Status: " + dispositivo.getStatus() + ", Técnico Responsável: " + dispositivo.getTecnicoResponsavel());
        }
    }
}
