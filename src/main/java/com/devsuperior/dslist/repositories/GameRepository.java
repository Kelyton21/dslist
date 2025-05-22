package com.devsuperior.dslist.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dslist.entities.Game;

// JpaRepository já possui métodos prontos para operações CRUD
// Não é necessário implementar nada aqui, a não ser que você queira adicionar métodos personalizados
public interface GameRepository extends JpaRepository<Game,Long>{
    
} 
