/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.social.service;

import br.com.crescer.social.Models.Curtida;
import br.com.crescer.social.repository.CurtidasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author William
 */

@Service
public class CurtidasService {
    
    @Autowired
    private CurtidasRepositorio curtidasRepositorio;
    
    public Iterable<Curtida> listar(){
        return curtidasRepositorio.findAll();
    }
}
