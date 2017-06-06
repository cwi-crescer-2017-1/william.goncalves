﻿using FestasCrescer.Infraestrutura.Entidades;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FestasCrescer.Infraestrutura.Repositorios
{
    class UsuarioRepositorio
    {
        private Contexto contexto = new Contexto();

        public void Criar(Usuario usuario)
        {
            contexto.Usuarios.Add(usuario);
            contexto.SaveChanges();
        }

        public void Alterar(Usuario usuario)
        {
            contexto.Entry(usuario).State = EntityState.Modified;
            contexto.SaveChanges();
        }
        public void Excluir(Usuario usuario)
        {
            var usuarios = contexto.Usuarios.FirstOrDefault(x => x == usuario);
            contexto.Usuarios.Remove(usuario);
            contexto.SaveChanges();
        }

        public IEnumerable<Usuario> Listar()
        {
            return contexto.Usuarios.ToList();
        }

        public Usuario Obter(string email)
        {
            var usuario = contexto.Usuarios.Where(u => u.Email == email).Include(u => u.Cargo).FirstOrDefault();
            return contexto.Usuarios.Where(u => u.Email == email).Include(u => u.).FirstOrDefault();
        }

        public void Dispose()
        {
            Contexto.Dispose();
        }
    }
}
