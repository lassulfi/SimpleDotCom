/**
* Código de teste do app SimpleDotCom
**/

public class SimpleDotComGame{

  public static void main(String[] args){

    //Vairável que armazena a quantidade de palpites do usuário
    int numOfGuesses = 0;

    //Chamada da classe que realiza a captura dos dados informados pelo usuario
    GameHelper helper = new GameHelper();

    //Instancia de um objeto SimpleDotCom
    SimpleDotCom theDotCom = new SimpleDotCom();

    //Cria um número aleatório para a primeira célula e usa para criar a matriz
    //de células
    int randomNum = (int) (Math.random() * 5);

    //Matriz para o local das DotCom
    int[] locations = {randomNum, randomNum + 1, randomNum + 2};

    //Chamada do método de configuração das DotCom
    theDotCom.setLocationCells(locations);

    //Variável booleana que testa a repetição do game
    boolean isAlive = true;

    while(isAlive){
      //captura do palpite do usuario
      String guess = helper.getUserInput("Insira um número: ");

      //Chamada do método para validação do palpite do usuario
      String result = theDotCom.checkYourself(guess);

      //incremento do número de palpites
      numOfGuesses++;

      //Validação do palpite
      if (result.equals("kill")) {
        isAlive = false;
        System.out.println("Voce usou " + numOfGuesses + " palpites");
      } // encerra o if
    } //encerra o while
  } //encerra o main
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
