package models;

public class Carros{

    private Marca marca;
    private Modelo modelo;
    private Integer ano;
    private Double preco;
    

    public Carros(Marca marca, Modelo modelo, Integer ano, Double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;

    }


    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Modelo getModelo() {
        return modelo;
    }
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public  enum  Marca {
        CHEVROLET,
            FIAT,
                VOLKSWAGEN,
                    HYUNDAI,
                        TOYOYA,
                             JEEP,
                                 RENAULT,
                                       HONDA;
  }

    public enum Modelo{
        CRUZE,ONIX,SPIN,
             STRADA,TORO,ARGO,
                  GOLF,GOL,POLO,
                     HB20,CRETA,IX35,
                          COROLLA,ETIOS,HILUX,
                              COMPASS,RENEGADE,COMMANDER,
                                  CLIO, LOGAN,KWID,
                                          CIVIC,CITY,HR_V;
    }



        @Override
    public String toString() {
        return "Marca "+marca +" Modelo "+modelo+
                " Ano "+ano + " Preço "+preco;
    }

    public String emplacamentoGratis(){
        if(preco<=25000.00){
            return "Emplacamento GRATIS para o veiculo selecionado";
        }
        return "Não há descontos ativos para emplacamento do veiculo selecionado";
    }
    
    
     
    public String verificarAutenticidade() {

        if(marca==Marca.CHEVROLET   && modelo== Modelo.CRUZE    ||modelo== Modelo.ONIX    || modelo== Modelo.SPIN){
            return"CARRO CADASTRADO";
        
        }if(marca==Marca.FIAT       && modelo== Modelo.STRADA   ||modelo== Modelo.ARGO    ||modelo== Modelo.TORO){
            return"CARRO CADASTRADO";
        
        }if(marca==Marca.VOLKSWAGEN && modelo== Modelo.GOL      ||modelo== Modelo.GOLF    ||modelo== Modelo.POLO){
            return"CARRO CADASTRADO";
        
        }if(marca==Marca.HYUNDAI    && modelo== Modelo.HB20     ||modelo== Modelo.CRETA   ||modelo== Modelo.IX35){
            return"CARRO CADASTRADO";
        
        }if(marca==Marca.TOYOYA     && modelo== Modelo.HILUX    ||modelo== Modelo.COROLLA ||modelo== Modelo.ETIOS){
            return"CARRO CADASTRADO";
        
        }if(marca==Marca.JEEP       && modelo== Modelo.RENEGADE ||modelo== Modelo.COMPASS ||modelo== Modelo.COMMANDER){
            return"CARRO CADASTRADO";
        
        }if(marca==Marca.RENAULT    && modelo== Modelo.CLIO     ||modelo== Modelo.LOGAN   ||modelo== Modelo.KWID){
            return"CARRO CADASTRADO";
        
        }if(marca==Marca.HONDA      && modelo== Modelo.CIVIC    ||modelo== Modelo.CITY    ||modelo== Modelo.HR_V){
            return"CARRO CADASTRADO"; 
        
        }
            
        return "CADASTRO INVALIDO, CARRO NÃO COMPATÍVEL COM MARCA OU MODELO";
        
    }

}