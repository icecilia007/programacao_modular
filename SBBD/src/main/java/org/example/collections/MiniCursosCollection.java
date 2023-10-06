package org.example.collections;

import org.example.model.MiniCurso;
import org.example.model.Profissional;

import java.util.ArrayList;
import java.util.List;

public class MiniCursosCollection {
    private static MiniCursosCollection instance;
    private List<MiniCurso> minicursos;

    public MiniCursosCollection() {
        minicursos = new ArrayList<>();
    }
    public static MiniCursosCollection getInstance(){
        if(instance == null){
            instance = new MiniCursosCollection();
        }
        return instance;
    }
    public void adicionarMinicurso(MiniCurso minicurso, Profissional profissional) {
/*        Antes de adicionar um mini curso a collections, precisa associar ele a uma sala,
        se ele não estiver sala associada não adiciona, precisa adiconar utilizando a collections de salas.*/
        if(minicurso.getSalaAssociada()!=null){
            minicurso.setMinistrante(profissional);
            profissional.setMiniCurso(minicurso);
            minicursos.add(minicurso);
            System.out.println("Mini Curso adicionado");
        }else {
            System.out.println("Mini Curso não tem sala associada");
        }
    }
    public void editarMiniCurso(MiniCurso miniCursoAntigo, MiniCurso miniCursoNovo) {
        int index = minicursos.indexOf(miniCursoAntigo);
        if (index != -1) {
            if(miniCursoNovo.getSalaAssociada()!=null) {
                minicursos.set(index, miniCursoNovo);
            }else System.out.println("Mini Curso não tem sala associada");
        }
    }

    public MiniCurso encontrarMinicursoPorCodigo(int codigo) {
        for (MiniCurso minicurso : minicursos) {
            if (minicurso.getCodigo() == codigo) {
                return minicurso;
            }
        }
        return null;
    }

    public List<MiniCurso> listarMinicursos() {
        return minicursos;
    }
    public void excluirMiniCurso(MiniCurso minicurso){
        minicursos.remove(minicurso);
    }

}
