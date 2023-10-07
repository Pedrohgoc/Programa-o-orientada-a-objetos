package com.veterinario;

import java.util.Objects;

public class Consulta {

    private Integer id;
    private String dataconsulta;
    private String descricao;
    private String historico;



    public Consulta() {
    }

    public Consulta(Integer id, String dataconsulta, String descricao, String historico) {
        this.id = id;
        this.dataconsulta = dataconsulta;
        this.descricao = descricao;
        this.historico = historico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataconsulta() {
        return dataconsulta;
    }

    public void setDataconsulta(String dataconsulta) {
        this.dataconsulta = dataconsulta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consulta consulta = (Consulta) o;
        return Objects.equals(id, consulta.id) && Objects.equals(dataconsulta, consulta.dataconsulta) && Objects.equals(descricao, consulta.descricao) && Objects.equals(historico, consulta.historico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataconsulta, descricao, historico);
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", dataconsulta='" + dataconsulta + '\'' +
                ", descricao='" + descricao + '\'' +
                ", historico='" + historico + '\'' +
                '}';
    }
}
