package me.clementino.solution.acompanhamentos;

import me.clementino.v1.acai.Acai;
import me.clementino.v1.acai.Tamanho;

public class PadraoDeProjeto extends Acai{

    Acai acai;

    public PadraoDeProjeto (Acai acai){
        this.acai = acai; 
        this.descricao = acai.getDescricao();
        this.tamanho = acai.getTamanho();    
    }
    @Override
    public String getDescricao(){
        return this.acai.getDescricao();
    };
    @Override
    public Tamanho getTamanho() {
        return this.acai.getTamanho();
    }

    @Override
    public double getPreco() {
        // TODO Auto-generated method stub
        return this.acai.getPreco();
    }
}
