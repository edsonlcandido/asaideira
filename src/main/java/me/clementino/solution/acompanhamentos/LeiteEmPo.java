package me.clementino.solution.acompanhamentos;

import me.clementino.v1.acai.Acai;

public class LeiteEmPo extends PadraoDeProjeto{

    private final double preco;

    public LeiteEmPo(Acai acai) {
        super(acai);
        descricao = super.getDescricao() + " com leite em pó";
        preco = super.getPreco() + 1.99;
    }


    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
