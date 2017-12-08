/**
* Código de teste do app SimpleDotCom
**/

public class SimpleDotComTestDrive{

  public static void main(String[] args){

    //Instancia de um objeto SimpleDotCom
    SimpleDotCom dot = new SimpleDotCom();

    //Matriz para o local das DotCom
    int[] locations = {2, 3, 4};

    //Chamada do método de configuração das DotCom
    dot.setLocationCells(locations);

    //Definição do palpite do usuario
    String userGuess = "2";

    //Chamada do método para validação do palpite do usuario
    String result = dot.checkYourself(userGuess);

    //Validação do palpite
    String testResult = "failed";
    if (result.equals("hit")) {
      testResult = "passed";
    }

    System.out.println(testResult);
  }
}

class SimpleDotCom{

  //Atributos
  int[] locationCells;
  int numOfHits;

  //Métodos especiais
  public void setLocationCells(int[] locs){
    locationCells = locs;
  }

  //Métodos

  /**
  * Método que verifica se o palpite foi certo ou não
  **/
  public String checkYourself(String stringGuess){

    //Converte a string com o palpite para int
    int guess = Integer.parseInt(stringGuess);

    //Variável que armazena o resultado a ser retornado. "miss" é padrão
    //assumindo que oerro vai ocorrer
    String result = "miss";

    //Loop para validação do palpite
    for(int cell : locationCells){
      if (guess == cell) {
        result = "hit";
        numOfHits++;
        break;
      }
    }

    //Valida se o número de hits é igual a 3, então exibe uma mensagem informando
    //que a palavra foi eliminada
    if (numOfHits == locationCells.length) {
      result = "kill";
    }

    //Exibe o resultado na tela
    System.out.println(result);

    //retorna o resultado
    return result;
  }

  void selfLocationCells(int[] loc){
  }

}
