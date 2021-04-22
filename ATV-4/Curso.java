public class Curso implements Cloneable {
	private String nome_curso,disc_especifica,disc_comum_1,disc_comum_2,disc_comum_3;
    private int carga_horaria;

    // Construtor
    public Curso(String nome,String discEsp,String dComum1,String dComum2, String dComum3,int cargaHoraria){
        super();

        this.nome_curso = nome; 
        this.disc_especifica = discEsp;
        this.disc_comum_1 = dComum1;
        this.disc_comum_2 = dComum2;
        this.disc_comum_3 = dComum3;
        this.carga_horaria = cargaHoraria;
    }

    // setters necessarios:
    public void setNome(String nome){
        this.nome_curso = nome;
    }
    public void setDisciplinaEsp(String disc_especifica){
        this.disc_especifica = disc_especifica;
    }

    // faz a copia do objeto Curso
    public Curso clonar(){
        try {
            return (Curso)super.clone(); // retorna uma copia do objeto
        } catch(CloneNotSupportedException e) { // erro na clonagem
            e.printStackTrace(); // exibe o erro
            return this;
        }
    }

    // informacoes do curso
    public String toString(){
        return String.format("\nCurso: %s\nDisciplinas em comum: %s, %s e %s\nDisciplina Especifica: %s\nCarga Horaria: %d Horas\n",nome_curso,disc_comum_1,disc_comum_2,disc_comum_3,disc_especifica,carga_horaria);
    }
}