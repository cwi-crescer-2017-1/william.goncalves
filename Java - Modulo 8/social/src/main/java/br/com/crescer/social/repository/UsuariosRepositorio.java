/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.social.repository;

import br.com.crescer.social.Models.Usuarios;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author William
 */
public interface UsuariosRepositorio extends CrudRepository<Usuarios, Long> {
    
}