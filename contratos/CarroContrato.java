package contratos;

import java.util.List;

import models.Carros.Marca;
import models.Carros.Modelo;

public interface CarroContrato <T>{

void criar(T dados);
T buscar(Integer index);
void alterar(Integer index, T dados);
void deletar (Integer index);
List<T>buscarTodosCarros();
void deletarTodosCarros();
boolean buscarPorNome(String nome);



   
    
  

}
