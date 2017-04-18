import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BatalhaTest
{
    @Test
    public void testarBatalhaSaintUmMaiorQueSaintDois(){
        Saint goku = new Saint("Goku", new Armadura("Pegasus", Categoria.OURO));
        Saint vegeta= new Saint("Vegeta", new Armadura("Latão", Categoria.PRATA));
        Batalha batalha = new Batalha(goku, vegeta);
        batalha.iniciar();
        assertEquals(100.0, goku.getVida(), 0.1);
        assertEquals(90.0, vegeta.getVida(), 0.1);
    }
    
    @Test
    public void testarBatalhaSaintUmIgualSaintDois(){
        Saint shiryu = new Saint("shiryu", new Armadura("Dragão", Categoria.OURO));
        Saint ikki = new Saint("ikki", new Armadura("Fenix", Categoria.OURO));
        Batalha batalha = new Batalha(shiryu, ikki);
        batalha.iniciar();
        assertEquals(100.0, shiryu.getVida(), 0.1);
        assertEquals(90.0, ikki.getVida(), 0.1);
    }
    
    @Test
    public void testarBatalhaSaintDoisMaiorQueSaintUm(){
        Saint shiryu = new Saint("shiryu", new Armadura("Ornitorrinco", Categoria.PRATA));
        Saint ikki = new Saint("ikki", new Armadura("Fenix", Categoria.OURO));
        Batalha batalha = new Batalha(shiryu, ikki);
        batalha.iniciar();
        assertEquals(90.0, shiryu.getVida(), 0.1);
        assertEquals(100.0, ikki.getVida(), 0.1);
    }
}

public class BatalhaTest
{
    @Test
    public void testarBatalhaSaintUmMaiorQueSaintDois(){
        Saint goku = new Saint("Goku", new Armadura("Pegasus", Categoria.OURO));
        Saint vegeta= new Saint("Vegeta", new Armadura("Latão", Categoria.PRATA));
        Batalha batalha = new Batalha(goku, vegeta);
        batalha.iniciar();
        assertEquals(100.0, goku.getVida(), 0.1);
        assertEquals(90.0, vegeta.getVida(), 0.1);
    }
    
    @Test
    public void testarBatalhaSaintUmIgualSaintDois(){
        Saint shiryu = new Saint("shiryu", new Armadura("Dragão", Categoria.OURO));
        Saint ikki = new Saint("ikki", new Armadura("Fenix", Categoria.OURO));
        Batalha batalha = new Batalha(shiryu, ikki);
        batalha.iniciar();
        assertEquals(100.0, shiryu.getVida(), 0.1);
        assertEquals(90.0, ikki.getVida(), 0.1);
    }
    
    @Test
    public void testarBatalhaSaintDoisMaiorQueSaintUm(){
        Saint shiryu = new Saint("shiryu", new Armadura("Ornitorrinco", Categoria.PRATA));
        Saint ikki = new Saint("ikki", new Armadura("Fenix", Categoria.OURO));
        Batalha batalha = new Batalha(shiryu, ikki);
        batalha.iniciar();
        assertEquals(90.0, shiryu.getVida(), 0.1);
        assertEquals(100.0, ikki.getVida(), 0.1);
    }
}

public class BatalhaTest
{
    @Test
    public void testarBatalhaSaintUmMaiorQueSaintDois()throws Exception{
        Constelacao cancer = new Constelacao("Cancer");
        Constelacao leao = new Constelacao("Leao");
        Saint goku = new Saint("Goku", new Armadura(cancer, Categoria.OURO));
        Saint vegeta= new Saint("Vegeta", new Armadura(leao, Categoria.PRATA));
        Batalha batalha = new Batalha(goku, vegeta);
        batalha.iniciar();
        assertEquals(100.0, goku.getVida(), 0.1);
        assertEquals(90.0, vegeta.getVida(), 0.1);
    }
    
    @Test
    public void testarBatalhaSaintUmIgualSaintDois()throws Exception{
        Constelacao aquario = new Constelacao("Aquario");
        Constelacao aries = new Constelacao("Aries");
        Saint shiryu = new Saint("shiryu", new Armadura(aquario, Categoria.OURO));
        Saint ikki = new Saint("ikki", new Armadura(aries, Categoria.OURO));
        Batalha batalha = new Batalha(shiryu, ikki);
        batalha.iniciar();
        assertEquals(100.0, shiryu.getVida(), 0.1);
        assertEquals(90.0, ikki.getVida(), 0.1);
    }
    
    @Test
    public void testarBatalhaSaintDoisMaiorQueSaintUm()throws Exception{
        Constelacao virgem = new Constelacao("Virgem");
        Constelacao sagitario = new Constelacao("Sagitário");
        Saint shiryu = new Saint("shiryu", new Armadura(virgem, Categoria.PRATA));
        Saint ikki = new Saint("ikki", new Armadura(sagitario, Categoria.OURO));
        Batalha batalha = new Batalha(shiryu, ikki);
        batalha.iniciar();
        assertEquals(90.0, shiryu.getVida(), 0.1);
        assertEquals(100.0, ikki.getVida(), 0.1);
    }
}
