import models.Carros;
import models.Carros.Marca;
import models.Carros.Modelo;
import repositorios.CarroRepositorio;

public class Main{
    public static void main(String[] args) {
        
        Carros chevrolet1 =new Carros(Marca.CHEVROLET, Modelo.ARGO, 2022, 35000.00);
        Carros fiat1      =new Carros(Marca.FIAT, Modelo.STRADA, 2017, 25000.00);
        Carros hyunday1   =new Carros(Marca.HYUNDAI, Modelo.HB20, 2023, 83500.00);

        CarroRepositorio repositorio = new CarroRepositorio();

        repositorio.criar(chevrolet1);
        repositorio.criar(fiat1);
        repositorio.criar(hyunday1);

       System.out.println(chevrolet1.verificarAutenticidade());  
       System.out.println(fiat1.verificarAutenticidade());
       System.out.println(hyunday1.verificarAutenticidade());

       System.out.println( repositorio.buscar(0));
    
       System.out.println(chevrolet1.emplacamentoGratis());
       System.out.println(fiat1.emplacamentoGratis());

       hyunday1.setPreco(78950.00);
       repositorio.alterar(2, hyunday1);
       System.out.println(repositorio.buscar(2));
         
   


      

    }
}