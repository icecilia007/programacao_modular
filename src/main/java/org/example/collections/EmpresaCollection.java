package org.example.collections;

import org.example.model.Empresa;

import java.util.ArrayList;
import java.util.List;

public class EmpresaCollection {
    private List<Empresa> empresas = new ArrayList<>();
    private static EmpresaCollection instance;

    private EmpresaCollection() {
    }

    public static EmpresaCollection getInstance() {
        if (instance == null) {
            instance = new EmpresaCollection();
        }
        return instance;
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void adicionarEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    public void editarEmpresa(Empresa empresaAntiga, Empresa empresaNova) {
        int index = empresas.indexOf(empresaAntiga);
        if (index != -1) {
            empresas.set(index, empresaNova);
        }
    }

    public void excluirEmpresa(Empresa empresa) {
        empresas.remove(empresa);
    }

    public Empresa buscarEmpresa(String nome) {
        for (Empresa empresa : empresas) {
            if (empresa.getNome().equals(nome)) {
                return empresa;
            }
        }
        return null;
    }

    public List<Empresa> listarEmpresas() {
        return empresas;
    }
}
