import java.io.*;

/**
*
* Classe Helper que é responsável pela leitura de dados na tela
*
* @author: luis daniel assulfi
**/
public class GameHelper{

  /**
  * Método que exibe uma mensagem de prompt na tela para que o  usuario
  * informe um número e depois retorna o número como uma String
  *
  * @param: prompt exibido na tela
  * @return: String
  *
  **/
  public String getUserInput(String prompt){

    String inputLine = null;
    System.out.print(prompt + " ");

    try{
      BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
      inputLine = is.readLine();
      if (inputLine.length() == 0) {
        return null;
      }
    } catch(IOException e){
      System.out.println("IOException " + e);
    }
    return inputLine;
  }
}
