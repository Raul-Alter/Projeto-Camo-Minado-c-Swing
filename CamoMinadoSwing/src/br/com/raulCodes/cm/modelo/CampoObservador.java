package br.com.raulCodes.cm.modelo;

@FunctionalInterface
public interface CampoObservador {
    public void eventoOcorreu(Campo c, CampoEvento evento);
}
