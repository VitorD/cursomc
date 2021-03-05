package com.vitordaltro.cursomc.Services;

import com.vitordaltro.cursomc.Services.exceptions.ObjectNotFoundException;
import com.vitordaltro.cursomc.domain.Categoria;
import com.vitordaltro.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: "+id+ ", Tipo: "+Categoria.class.getName()
        ));
    }
}
