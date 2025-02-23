public class Pessoa{
    private String nome;
    private int cpf;
    private String email;
    private String senha;

    //medico extends pessoa
    private int CRM;
    private String especialidade;
    private int horarios; //?
    public void VerMeusHorariosTotais(){
        //verificar todos os horarios, os que não foram marcados e os que foram marcados
    }
    public void VerMeusHorariosOcupados(){
        //verificar horarios que tem pacientes marcados //LEMBRAR DE DESMARCAR O HORARIO CASO O PACIENTE DESMARQUE A CONSULTA
    }
    public void AnotacoesAcercaDosPacientes(){
        //lugar para anotar o que foi feito na consulta, como receita medica e problemas relatados pelo paciente
    }
    public void ConsultarAnotacoesAnterioresPaciente(){
        //buscar as anotações anteriores atraves do cpf e nome
    }

    //paciente extends pessoa
    private int consulta; //?
    public void MarcarConsulta(){
        //marcar um horario com o médico //LEMBRAR DE TER UMA VERIFICAÇÃO PARA NÃO MARCAREM DOIS PACIENTES O MESMO HORARIO
    }
    public void DesmarcarConsulta(){
        //desmarcar um horario com o médico //LEMBRAR DE TER UMA VERIFICAÇÃO QUE DEMARQUE ESSE HORARIO PARA O MÉDICO TAMBÉM
    }
    public void VerMinhasConsultas(){
        //ver os horarios que marquei com os médico
    }
    public void VerHorariosDisponiveis(){
        //ver os horarios disponiveis para que eu marque uma consulta
    }

    //Consultas
    public void CriarHorarios(){
        //criar horarios apra os médicos, para que tenha um controle, assim como em uma barbearia
    } //disponivel apenas para admin
    public void ExcluirHorarios(){
        //excluir horarios para os médicos, caso um médico não possa atender em x horario.
    }
    public void CadastrarMedico(){
        //cadastrar um médico novo
    }
    public void CadastrarPaciente(){
        //cadastrar um paciente novo
    }
    public void ExcluirMedico(){
        //excluir o cadastro de um medico ja registrado
        //lembrar de excluir todos os dados e anotações feitas pelo médico
    }
    public void ExcluirPaciente(){
        //excluir o cadastro de um paciente ja registrado
        //lembrar de excluir todass as anotações acerca do paciente feita pelo(s) medico(s)
        //apagar os horarios que a pessoa marcou
    }


    //construtor
    public Pessoa(){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }
    //getters
    public String GetNome(){
        return nome;
    }
    public int GetCPF(){
        return cpf;
    }
    public String GetEmail(){
        return email;
    }
    public String GetSenha(){
        return senha;
    }
    //setters
    public void SetNome(String nome){
        this.nome = nome;
    }
    public void SetCpf(int cpf){
        this.cpf = cpf;
    }
    public void SetEmail(String email){
        this.email = email;
    }
    public void SetSenha(String senha){
        this.senha = senha;
    }



    ///////////////getters e setters medico//////////////////
    public void SetCRM(int CRM){
        this.CRM = CRM;
    }
    public void SetEspecialidade(String especialidade){
        this.especialidade = especialidade;    
    }

    ///////////////getters e setters paciente//////////////////
    







}