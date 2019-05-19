package ExerciciosPOO;
public class Data {
    private int dia, mes, ano;
    
    //Construtores sobrecarregados
    public Data(int mm, int aaaa)throws Exception{
        this(01, mm, aaaa);
    }
    
    public Data(int _dia, int _mes, int _ano)throws Exception{
        this.setData(_dia, _mes, _ano);
    }
    
   public Data(int _dia, String _mes, int _ano)throws Exception{
       this.setData(_dia,_mes,_ano);
    }
    
    public Data(String _Data)throws Exception{
        this.setData(_Data);
    }
    
    public Data()throws Exception{
        this.setData(1,1,1900);
    }

    //Metodos de interface para acesso aos campos privados
    public int getDia(){
        return this.dia; 
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    //SET's para modificaçao dos atributos
    public void setData (int _dia, int _mes, int _ano)throws Exception{
        if(isDataValida(_dia,_mes,_ano)==true){
            this.dia = _dia;
            this.mes = _mes;
            this.ano = _ano;
        }
        else{
            throw new Exception("Data invalida.");
        }
    }
    
    public void setData(int dia, String _mes, int ano)throws Exception{
       int mes = mesStringToMesInt(_mes);
       this.setData(dia,mes,ano);
    }
    
    public void setData(String _Data)throws Exception{
        if (_Data.length() < 8 || _Data.length() > 10){
            throw new Exception("Formato invalido de data.");
        }
        else{
            //VERIFICA SE DIA TEM FORMATO d OU dd
            if (_Data.substring(1,2).equals("/")){//Data formato d/...
                    dia = Integer.parseInt(_Data.substring(0,1));                
                //VERFIFICA SE MES TEM FORMATO m OU mm
                if(_Data.substring(3,4).equals("/")){//data formato d/m/...
                        mes= Integer.parseInt(_Data.substring(2,3));
                        ano = Integer.parseInt(_Data.substring(4,8));
                }else{                    
                    if(_Data.substring(4,5).equals("/")){//Data formato d/mm/...
                            mes = Integer.parseInt(_Data.substring(2,4));
                            ano = Integer.parseInt(_Data.substring(5,9));
                    }
                    else{
                        throw new Exception("Formato invalido de data.");
                    }
                }
            }else{ 
                if(_Data.substring(2,3).equals("/")){//Data formato dd/...
                        dia = Integer.parseInt(_Data.substring(0,2));
                    if(_Data.substring(4,5).equals("/")){//Data formato dd/m/...
                            mes = Integer.parseInt(_Data.substring(3,4));
                            ano = Integer.parseInt(_Data.substring(5,9));
                    }else if(_Data.substring(5,6).equals("/")){//Data fromato dd/mm/...
                                mes = Integer.parseInt(_Data.substring(3,5));
                                ano = Integer.parseInt(_Data.substring(6,10));
                            }
                            else{
                                throw new Exception("Formato invalido de data.");
                            }
                }else{
                    throw new Exception("Formato invalido de data.");
                }
            }
        }        
        this.setData(dia,mes,ano);
    }
    
//Verifica se o ano inserido e bissexto
    public static boolean isBissexto(int _ano){
        if (((_ano%4 == 0) && (_ano%100 != 0))){
            return true;
        }
        if (_ano%400 == 0){
            return true;
        }
        else{
            return false;
        }                          
    }
    
    //Verifica se a data inserida e valida
    public static boolean isDataValida(int _dia, int _mes, int _ano){
        if ((_dia > 31) || (_dia <= 0)){
            System.out.println("Erro. O dia precisar estar na faixa de 1 a 31");
            return false;
        }
        if (_ano<1582){
            System.out.println("Erro. Ano precisar ser >= 1582");
            return false;
        }
        if (_mes > 12){
            System.out.println("Erro. Mes precisa estar na faixa de 1 a 12");
            return false;
        }
        if (_dia == 31 ) {
            if ((_mes == 4) || (_mes == 6) || (_mes == 9) || (_mes == 11)){
                System.out.println("Erro. O mes" + _mes +" deve ter no maximo 30 dias");
                return false;
            }            
        }
        if(_mes == 2){
            if (_dia == 29) {
                if (isBissexto(_ano)){
                    return true;
                }
            }else if(_dia > 29){//Verificação do dia maior que 29 para o mes de fevereiro
                System.out.println("Erro. O mes " + _mes + " nao tem " +_dia + " dias.");
                return false;
            }
        }
        return true;
    }
    
    public int compareTo(Data data2)throws Exception{
        if(this.getAno() < data2.getAno()){
           return -1; 
        }
        if(this.getAno() > data2.getAno()){
            return 1;
        }
        if(this.getMes() < data2.getMes()){
            return -1;
        }
        if(this.getMes() > data2.getMes()){
            return 1;
        }
        if(this.getDia() < data2.getDia()){
            return -1;
        }
        if(this.getDia() > data2.getDia()){
            return 1;
        }
        return 0;
    }
    
    public void incrementa()throws Exception{
        try{
            this.setData(getDia()+1,getMes(),getAno());
        }catch(Exception e){
            try {
                this.setData(1, getMes()+1, getAno());
            }catch(Exception f){
                try{
                    this.setData(1, 1, getAno()+1);
                }catch(Exception g){
                    
                }
            }
        }
    }
   
   public void incrementa(int n) throws Exception{
       for(int i=0 ; i < n ; i++){
           incrementa();
       }
   }
   
   public static Data verificaECriaData(int dd, int mm, int aaaa)throws Exception{
       Data data;
       try{
           data = new Data(dd,mm,aaaa);
       }catch (Exception e){
           return null;
       }
       return data;
   }
    
    public int mesStringToMesInt(String _mes){
        String palavra = _mes.toUpperCase();
        switch(palavra){
            case "JANEIRO":
                return 1;
            case "FEVEREIRO":
                return 2;
            case "MARÇO":
                return 3;
            case "ABRIL":
                return 4;
            case "MAIO":
                return 5;
            case "JUNHO":
                return 6;
            case "JULHO":
                return 7;
            case "AGOSTO":
                return 8;
            case "SETEMBRO":
                return 9;
            case "OUTUBRO":
                return 10;
            case "NOVEMBRO":
                return 11;
            case "DEZEMBRO" :
                return 12;
            default:
                return 0;
        }
    }
    
    public boolean equals(Object objeto){
        Data aux = (Data)objeto;
        if(this.getDia() == aux.getDia() &&
                this.getMes() == aux.getMes() &&
                this.getAno() == aux.getAno()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String toString(){
        StringBuilder dados = new StringBuilder();
        dados.append(this.getDia());
        dados.append("/");
        dados.append(this.getMes());
        dados.append("/");
        dados.append(this.getAno());
        return dados.toString();
    }        
}