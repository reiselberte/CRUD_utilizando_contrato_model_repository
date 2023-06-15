package repositorios;

import java.util.ArrayList;
import java.util.List;
import contratos.CarroContrato;
import models.Carros;


public class CarroRepositorio implements CarroContrato<Carros> {

    private final List<Carros> CARRO = new ArrayList<>();

    @Override
    public void criar(Carros dados) {
        CARRO.add(dados);
    }

    @Override
    public Carros buscar(Integer index) {
        return CARRO.get(index);
    }

    @Override
    public void alterar(Integer index, Carros dados) {
        CARRO.set(index, dados);
    }

    @Override
    public void deletar(Integer index) {
        CARRO.remove(index);
    }

    @Override
    public List<Carros> buscarTodosCarros() {
        return CARRO;
    }

    @Override
    public void deletarTodosCarros() {
        for( int i=0; i < CARRO.size() ;i++ ){
            deletar(i);
        }
    }   

    @Override
    public boolean buscarPorNome(String nome) {
        int posicao = 0;
        while(posicao < CARRO.size()){
            Carros dados = buscar(posicao);
            if(dados.toString().equals(nome)){
                return true;
            }
        }
        return false;
    }

   

   
    
}
   