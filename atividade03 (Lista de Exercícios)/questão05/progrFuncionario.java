package atv02.quest5;

public class progrFuncionario{

public static void main(String[] args) {
    Funcionario func = new Funcionario ("Luisa Mel", "20/05/2000", "12.345.678-90" , "123.456.789-22", "Rua A, nº502", "Feira de Santana-BA", 2.500, "Analista de Sistemas", "Superior completo", 123456);
    func.listar();

    func.cadastrarAlterar("Sérgio Maia", "29/09/1970", "90.876.543-21", "165.789.064-01", "Rua das Núvens, nº15", "Salvador-BA", 3.900, "Analista de Dados", "Superior completo", 123654);
    func.listar();
                
}

}