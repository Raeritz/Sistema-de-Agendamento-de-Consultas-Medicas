public class Medico extends Pessoa{
    private int crm;
    private String especialidade;
    private List<String> horarios;

    public Medico(){
        this.crm = crm;
        this.especialidade = especialidade;
        this.horarios = horarios;
        
    }
    //setters
    public void SetCrm(int crm){
        this.crm = crm;
    }
    public void SetEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public void SetHorarios(List<String> horarios){
        this.horarios = horarios;
    }

    //getters
    public int GetCrm(){
        return crm;
    }
    public String GetEspecialidade(){
        return especialidade;
    }
    public List<String> GetHorarios(){
        return horarios;
    }


}