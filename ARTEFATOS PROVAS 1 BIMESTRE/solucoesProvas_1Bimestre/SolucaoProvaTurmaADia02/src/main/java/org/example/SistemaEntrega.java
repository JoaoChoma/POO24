package org.example;

import java.util.ArrayList;
import java.util.List;

class SistemaEntrega {
    private List<Veiculo> frota;

    public SistemaEntrega() {
        frota = new ArrayList<>();
    }

    // Adiciona um veículo à frota
    public void adicionarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
    }

    public void atribuirEncomenda(Encomenda encomenda) {
        for (Veiculo veiculo : frota) {
            if (veiculo.estaDisponivel() && veiculo.podeCarregar(encomenda.getPeso(), encomenda.getVolume())) {
                if (encomenda.isAltaPrioridade() && veiculo instanceof Motocicleta) {
                    System.out.println("Atribuindo encomenda prioritária à motocicleta: " + veiculo);
                    veiculo.atribuirEntrega();
                    return;
                } else if (!encomenda.isAltaPrioridade() && !(veiculo instanceof Motocicleta)) {
                    System.out.println("Atribuindo encomenda à van ou caminhão: " + veiculo);
                    veiculo.atribuirEntrega();
                    return;
                }
            }
        }
        System.out.println("Nenhum veículo disponível ou com capacidade suficiente para a encomenda.");
    }

    public void statusFrota() {
        for (Veiculo veiculo : frota) {
            System.out.println(veiculo);
        }
    }
}
