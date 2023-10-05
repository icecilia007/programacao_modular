package org.example.collections;

import org.example.model.SessaoTecnica;
import java.util.ArrayList;
import java.util.List;

public class SessoesTecnicasCollection {
    private static SessoesTecnicasCollection instance;
    private List<SessaoTecnica> sessoesTecnicas;
    public SessoesTecnicasCollection() {
        sessoesTecnicas = new ArrayList<>();
    }

    public static SessoesTecnicasCollection getInstance(){
        if(instance == null){
            instance = new SessoesTecnicasCollection();
        }
        return instance;
    }

    public void adicionarSessaoTecnica(SessaoTecnica sessaoTecnica) {
        // Antes de adicionar uma sessão tecnica deve adiconar um mediador a essa sessão, caso contrario era não será salva
        if(sessaoTecnica.getMediador() !=null) {
            if (sessaoTecnica.getSalaAssociada() != null) {
                sessoesTecnicas.add(sessaoTecnica);
                System.out.println("Sessão Técnica adicionada");
            } else {
                System.out.println("Sessão Técnica não tem sala associada");
            }
        }else{
            System.out.println("Sessão Técnica não tem mediador associada");
        }
    }

    public void editarSessaoTecnica(SessaoTecnica sessaoTecnicaAntiga, SessaoTecnica sessaoTecnicaNova) {
        int index = sessoesTecnicas.indexOf(sessaoTecnicaAntiga);
        if (index != -1) {
            if(sessaoTecnicaNova.getSalaAssociada() != null) {
                sessoesTecnicas.set(index, sessaoTecnicaNova);
            } else {
                System.out.println("Sessão Técnica não tem sala associada");
            }
        }
    }

    public SessaoTecnica encontrarSessaoTecnicaPorCodigo(int codigo) {
        for (SessaoTecnica sessaoTecnica : sessoesTecnicas) {
            if (sessaoTecnica.getCodigo() == codigo) {
                return sessaoTecnica;
            }
        }
        return null;
    }

    public List<SessaoTecnica> listarSessoesTecnicas() {
        return sessoesTecnicas;
    }

    public void excluirSessaoTecnica(SessaoTecnica sessaoTecnica){
        sessoesTecnicas.remove(sessaoTecnica);
    }
}

