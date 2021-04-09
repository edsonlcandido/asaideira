package me.clementino.solution.acompanhamentos;

import me.clementino.v1.acai.Acai;

public class Morango extends PadraoDeProjeto{

    private final double preco;

    public Morango(Acai acai) {
        super(acai);  
        descricao = super.getDescricao() + " com morango";
        preco = super.getPreco() + 4.99;
    }

    public String getDescricao() {
        return  descricao;
    }
    @Override
    public double getPreco() {
        return preco;
    }
}
