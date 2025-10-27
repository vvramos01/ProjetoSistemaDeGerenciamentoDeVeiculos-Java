public class Veiculo {
   String marca;
   String modelo;
   int ano;


   public Veiculo(String marca, String modelo, int ano) {
       this.marca = marca;
       this.modelo = modelo;
       this.ano = ano;
   }


   public Veiculo(String marca, String modelo) {
       this.marca = marca;
       this.modelo = modelo;
       this.ano = 2020;
   }


   public String exibirInformacoes() {
       return "Veiculo: " + modelo + "\n" +
               "Marca: " + marca + "\n" +
               "Ano: " + ano;
   }
}

